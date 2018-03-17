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

public class Jatekos extends Leptetheto {
    private final String nev;

    /**
     * Az osztaly konstruktora. Beallitja a nevet, palyat és a mezot.
     *
     * @param nev A jatekos neve.
     * @param p   A palya.
     * @param m   A mezo, amin all.
     */
    public Jatekos(String nev, Palya p, UresMezo m) {
        super(p, m);
        this.nev = nev;
        palya = p;
        mezo = m;
    }

    /**
     * A jatekos nevet kerdezi le.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public String getNev() {
        Printer.PrintTabIn("Jatekos" + '\t' + "getNev()");
        Printer.PrintTabOut("Return: " + nev);
        return nev;
    }

    /**
     * A jatekos lepeset inditja el.
     *
     * @param i Irany amerre lepni akarunk
     */
    public void Lepes(Irany i) {
        Printer.PrintTabIn("Jatekos" + '\t' + "Lepes(Irany)");

        Tol(i, this);
        palya.Vegellenorzes();

        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos pontszerzeset kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya pontok osztajanak pontot kap
     * metodusat.
     */
    public void PontotKap() {
        Printer.PrintTabIn("Jatekos" + '\t' + "PontotKap()");
        palya.PontotKap(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos halalat kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya halal metodusat.
     */
    @Override
    public void Halal() {
        Printer.PrintTabIn("Jatekos" + '\t' + "Halal()");
        palya.Halal(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * Az objektumot egy doboz tolta meg, és az ezzel valo interakciot kezeli.
     *
     * @param i Irany amerre a dobozt tolták
     * @param j Jatekos, aki tolást kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Utkozik(Irany i, Jatekos j) {

        Printer.PrintTabIn("Jatekos" + '\t' + "Utkozik(Irany, Jatekos)");


        boolean success = mezo.GetSzomszed(i).Fogad(i, this, j);
        if (success) {
            mezo.Enged();
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            return true;
        }

        Halal();
        Printer.PrintTabOut("Return: " + Boolean.toString(false));
        return false;
    }

    /**
     * Az objektumot egy jatekos tolta meg, és az ezzel valo interakciot kezeli.
     *
     * @param i Irany amerre a dobozt tolták
     * @param j Jatekos, aki tolást kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Tol(Irany i, Jatekos j) {

        Printer.PrintTabIn("Jatekos" + '\t' + "Tol(Irany, Jatekos)");

        boolean success = mezo.GetSzomszed(i).Fogad(i, this, j);
        if (success)
            mezo.Enged();
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

}
