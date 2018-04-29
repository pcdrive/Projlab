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


package sokoban.leptethetok;

import tools.Printer;
import sokoban.Irany;
import sokoban.Palya;
import sokoban.mezok.UresMezo;

public class Jatekos extends Leptetheto {


    private final String nev;
    private float ero;
    private int status;
    private static int jatekosSzam = 0;

    /**
     * Az osztaly konstruktora. Beallitja a nevet, palyat �s a mezot.
     *
     * @param nev A jatekos neve.
     * @param p   A palya.
     * @param m   A mezo, amin all.
     */
    public Jatekos(String nev, Palya p, UresMezo m) {
        super(p, m);
        this.nev = nev;
        ero = 1;
        status = jatekosSzam++;
    }

    /**
     * A jatekos nevet kerdezi le.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public String getNev() {
        Printer.PrintTabIn(nev + '\t' + "getNev()");
        Printer.PrintTabOut("Return: " + nev);
        return nev;
    }

    /**
     * A jatekos lepeset inditja el.
     *
     * @param i Irany amerre lepni akarunk
     */
    public void Lepes(Irany i) {
    	
    	if (i==Irany.MEZ) 
    	{
    		mezo.AddMez();
    		return;
    	}
    	if (i==Irany.OLAJ) 
    	{
    		mezo.AddOlaj();
    		return;
    	}
    	
        Printer.PrintTabIn(nev + '\t' + "Lepes(Irany)");

        Tol(ero, 0, i, this);
        palya.Vegellenorzes();

        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos pontszerzeset kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya pontok osztajanak pontot kap
     * metodusat.
     */
    public void PontotKap() {
        Printer.PrintTabIn(nev + '\t' + "PontotKap()");
        palya.PontotKap(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos halalat kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya halal metodusat.
     */
    @Override
    public void Halal() {
        Printer.PrintTabIn(nev + '\t' + "Halal()");
        palya.Halal(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * lekerdezi a tipusat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Tipus szama.
     */
    @Override
    public int getTipus() {
        return 1;
    }

    /**
     * lekerdezi a statuszat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Statusz szama.
     */
    @Override
    public int getStatus() {
        return status;
    }

    /**
     * Az objektumot egy doboz tolta meg, es az ezzel valo interakciot kezeli.
     *
     * @param ero  az ero amivel a jatekos a sort megtolta.
     * @param surl A mezo surlodasa, amin all.
     * @param i    Irany amerre a dobozt toltak
     * @param j    Jatekos, aki tolast kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Utkozik(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn(nev + '\t' + "Utkozik(Irany, Jatekos)");

        UresMezo szom = mezo.GetSzomszed(i);
        boolean success = szom.Fogad(ero, i, this, j);
        if (!success) {
            Halal();
        }

        mezo.Enged();
        mezo=szom;
        Printer.PrintTabOut("Return: " + Boolean.toString(true));
        return true;
    }

    /**
     * Az objektumot egy jatekos tolta meg, es az ezzel valo interakciot kezeli.
     *
     * @param ero  az ero amivel a jatekos a sort megtolta.
     * @param surl A mezo surlodasa, amin all.
     * @param i    Irany amerre a dobozt toltak
     * @param j    Jatekos, aki tolast kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Tol(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn(nev + '\t' + "Tol(Irany, Jatekos)");

        UresMezo szom = mezo.GetSzomszed(i);
        boolean success = szom.Fogad(ero, i, this, j);
        if (success) 
        {
            mezo.Enged();
            mezo=szom;
        }
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }


    /**
     * A jatekos erejet allitja be.
     *
     * @param f az ero amivel a jatekos tolni tud.
     */
    public void setEro(float f) {
        ero = f;
    }

    /**
     * A doboz vegallapotat kerdezi le. A doboz kepes e lepni egy adott iranyba vagy sem.
     *
     * @return boolean Annak az erteke, hogy mozgathato-e.
     */
    public boolean Vege(Irany i) {
        Printer.PrintTabIn("Doboz" + '\t' + "Vege()");

        boolean success = true;
        
        
        Printer.PrintTabOut("Return: " + success);
        return success;
    }
}
