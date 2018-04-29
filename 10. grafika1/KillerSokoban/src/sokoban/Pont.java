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

import java.io.Serializable;

import tools.Printer;

@SuppressWarnings("serial")
public class Pont implements Serializable {

    private final String nev;
    private int pont;

    /**
     * Az osztaly konstruktora. Eltarolja a nevet, akinek a pontjait tartalmazzuk,
     * valamint a pontjainak szamat nullara allitja.
     * 
     * @param nev	A jatekos neve, akinek a pontjait tartalmazni fogja.
     */
    public Pont(String nev) {
        this.nev = nev;
        pont = 0;
    }

    /**
     * Lekeri a nev erteket.
     *
     * @return String A nev erteke.
     */
    public String getNev() {
        Printer.PrintTabIn("Pont" + '\t' + "getNev()");
        Printer.PrintTabOut("Return: " + nev);
        return nev;
    }

    /**
     * Lekeri a pontok erteket.
     *
     * @return int A pontok erteke.
     */
    public int getPont() {
        Printer.PrintTabIn("Pont" + '\t' + "getPont()");
        Printer.PrintTabOut("Return: " + pont);
        return pont;
    }

    /**
     * Pontot ad a jatekosnak.
     */
    public void PontotAd() {
        Printer.PrintTabIn("Pont" + '\t' + "PontotAd()");
        pont++;
        Printer.PrintTabOut("Return");
    }

}
