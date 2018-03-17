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

public class JeloltDoboz extends Doboz {
    private boolean jel;


    /**
     * Az osztaly konstruktora. Beallitja a jelet, palyat es a mezot.
     *
     * @param p A palya.
     * @param m A mezo, amin all.
     */
    public JeloltDoboz(Palya p, UresMezo m) {
        super(p, m);
        jel = true;
    }

    /**
     * Torli a doboz jeloleset, a boolean ertek megveltoztatasaval.
     */
    public void JeletTorol() {
        Printer.PrintTabIn("JeloltDoboz" + '\t' + "JeletTorol()");
        jel = false;
        Printer.PrintTabOut("Return");
    }

    /**
     * Lekeri a jel erteket.
     *
     * @return boolean A jel erteke.
     */
    public boolean getJel() {
        Printer.PrintTabIn("JeloltDoboz" + '\t' + "JeletTorol()");
        Printer.PrintTabOut("Return " + Boolean.toString(jel));
        return jel;
    }

}
