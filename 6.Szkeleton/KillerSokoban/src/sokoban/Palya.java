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

import java.util.ArrayList;

@SuppressWarnings("unused")

public class Palya {
    private Jatek jatek;
    private UresMezo mezok[];
    private Pontok pontok;
    private ArrayList<Doboz> dobozok;
    private ArrayList<Jatekos> jatekosok;

    /**
     * Az osztaly konstruktora. Letrehozza a pontok osztalyt, �s beallitja a jatekot.
     */
    public Palya(Jatek j) {
        jatek = j;
        pontok = new Pontok();
        dobozok = new ArrayList<Doboz>();
        jatekosok = new ArrayList<Jatekos>();
    }


    /**
     * A jatekos lepeset inditja el.
     *
     * @param i   Irany amerre lepni akarunk
     * @param nev A jatekos neve, azonositoja, akit leptetni akarunk.
     */
    public void Leptet(Irany i, String nev) {
        Printer.PrintTabIn("Palya" + '\t' + "Leptet()");

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

        jatek.EndGame();
        Printer.PrintTabOut("Return");
        return;
    }

}
