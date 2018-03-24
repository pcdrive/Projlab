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
    private float ero;

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
        ero = 4;
    }

    /**
     * A jatekos nevet kerdezi le.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public String getNev() {
        Printer.PrintTabIn( nev + '\t' + "getNev()");
        Printer.PrintTabOut("Return: " + nev);
        return nev;
    }

    /**
     * A jatekos lepeset inditja el.
     *
     * @param i Irany amerre lepni akarunk
     */
    public void Lepes(Irany i) {
        Printer.PrintTabIn( nev + '\t' + "Lepes(Irany)");

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
        Printer.PrintTabIn( nev + '\t' + "PontotKap()");
        palya.PontotKap(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos halalat kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya halal metodusat.
     */
    @Override
    public void Halal() {
        Printer.PrintTabIn( nev + '\t' + "Halal()");
        palya.Halal(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * Az objektumot egy doboz tolta meg, és az ezzel valo interakciot kezeli.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param surl	A mezo surlodasa, amin all.
     * @param i Irany amerre a dobozt tolták
     * @param j Jatekos, aki tolást kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Utkozik(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn(nev + '\t' + "Utkozik(Irany, Jatekos)");


        boolean success = mezo.GetSzomszed(i).Fogad(ero, i, this, j);
        if (!success) {
            Halal();
        }

        mezo.Enged();
        Printer.PrintTabOut("Return: " + Boolean.toString(true));
        return true;
    }

    /**
     * Az objektumot egy jatekos tolta meg, és az ezzel valo interakciot kezeli.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param surl	A mezo surlodasa, amin all.
     * @param i Irany amerre a dobozt tolták
     * @param j Jatekos, aki tolást kezdte
     * @return boolean Annak az erteke, hogy a jatekos tolhato-e.
     */
    @Override
    public boolean Tol(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn(nev + '\t' + "Tol(Irany, Jatekos)");

        boolean success = mezo.GetSzomszed(i).Fogad(ero, i, this, j);
        if (success)
            mezo.Enged();
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }


    /**
     * A jatekos erejet allitja be.
     *
     * @param f    az ero amivel a jatekos tolni tud.
     */
    public void setEro(float f) {ero=f;}

}
