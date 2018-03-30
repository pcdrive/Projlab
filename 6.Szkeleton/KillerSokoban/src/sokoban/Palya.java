/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018-02-09
 */


package sokoban;

import Tools.Printer;
import data.Data;
import server.*;
import sokoban.leptethetok.*;
import sokoban.mezok.*;

import java.util.LinkedList;

@SuppressWarnings("unused")

public class Palya {
    private Szerver szerver;
    private UresMezo mezok[];
    private Pontok pontok;
    private LinkedList<Doboz> dobozok;
    private LinkedList<Jatekos> jatekosok;

    /**
     * Az osztaly konstruktora. Letrehozza a pontok osztalyt, �s beallitja a jatekot.
     */
    public Palya(Szerver s, PalyaAdat k, String[] nevek) {
        szerver = s;
        pontok = new Pontok();
        dobozok = new LinkedList<Doboz>();
        jatekosok = new LinkedList<Jatekos>();
        mezok = new UresMezo[k.palya.length];
        
        int num=0;
        
        for (int i=0; i<mezok.length;i++) 
        {
        	switch (((int)(k.palya[i]/100))%100) 
        	{
        		case 0: mezok[i] = new UresMezo(); break;
        		case 1: mezok[i] = new Fal(); break;
        		case 2: mezok[i] = new Lyuk(); break;
        		case 3: mezok[i] = new Celhely(); break;
        		case 4: mezok[i] = new Csapdaajto(); break;
        		case 5: mezok[i] = new Kapcsolo(); break;
        	}
        	
        	if (i>1) 
        	{
        		mezok[i-1].SetSzomszed(Irany.JOBBRA, mezok[i]);
        		mezok[i].SetSzomszed(Irany.BALRA, mezok[i-1]);
        	}
        	if (i>Data.PalyaY) 
        	{
        		mezok[i-Data.PalyaY].SetSzomszed(Irany.LE, mezok[i]);
        		mezok[i].SetSzomszed(Irany.FEL, mezok[i-Data.PalyaY]);        		
        	}

        	switch ((int)(k.palya[i]/10000000)) 
        	{
        		case 1: 
	        		{
	        			Jatekos jatekos = new Jatekos(nevek[num++],this,mezok[i]);
        				mezok[i].Fogad(0, null, jatekos, null); 
        				jatekosok.add(jatekos);
	        		} break;
        		case 2: 
        			{
        				Doboz doboz = new Doboz(this,  mezok[i]);
        				mezok[i].Fogad(0, null, doboz, null); 
        				dobozok.add(doboz);
        			} break;
        		case 3:
	    			{
	    				JeloltDoboz doboz = new JeloltDoboz(this,  mezok[i]);
	    				mezok[i].Fogad(0, null, doboz, null); 
	    				dobozok.add(doboz);
	    			} break;
        	}
        }
    }


    /**
     * A jatekos lepeset inditja el.
     *
     * @param i   Irany amerre lepni akarunk
     * @param nev A jatekos neve, azonositoja, akit leptetni akarunk.
     */
    public void Leptet(Irany i, String nev) {
        Printer.PrintTabIn("Palya" + '\t' + "Leptet(Irany, String)");

        for (Jatekos j : jatekosok) {
            if (j.getNev().equals(nev)) {
                j.Lepes(i);
            }
        }
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekost torli a listabol.
     *
     * @param j A jatekos akinek meg kell halnia.
     */
    public void Halal(Jatekos j) {
        Printer.PrintTabIn("Palya" + '\t' + "Halal(Jatekos)");

        jatekosok.remove(j);
        Printer.PrintTabOut("Return");
    }

    /**
     * A dobozt torli a listabol.
     *
     * @param d A doboz akinek meg kell halnia.
     */
    public void Halal(Doboz d) {
        Printer.PrintTabIn("Palya" + '\t' + "Halal(Doboz)");
        dobozok.remove(d);
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos pontszerzeset kezeli. Ez tovabbhivja pontok osztaj pontot kap
     * metodusat.
     *
     * @param j A jatekos aki a pontot kapja.
     */
    public void PontotKap(Jatekos j) {
        Printer.PrintTabIn("Palya" + '\t' + "PontotKap(Jatekos)");
        pontok.PontotKap(j.getNev());
        Printer.PrintTabOut("Return");
    }

    /**
     * Vegignezi a dobozokat, es ellenorzi a jatek veget.
     */
    public void Vegellenorzes() {
        Printer.PrintTabIn("Palya" + '\t' + "Vegellenorzes()");

        for (Doboz d : dobozok) {
            boolean mozgathato = d.Vege();
            if (mozgathato) {
                Printer.PrintTabOut("Return");
                return;
            }
        }

//        jatek.EndGame();
        Printer.PrintTabOut("Return");
        return;
    }

}
