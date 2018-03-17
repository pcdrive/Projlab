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

public class Csapdaajto extends UresMezo {

    private boolean nyitva;

    /**
     * Az osztaly konstruktora. Beallitja az ajtot.
     */
    public Csapdaajto() {
        super();
        nyitva = false;
    }


    /**
     * Kinyitja az ajt�t, az erre a c�lra fentartott boolean erteket valtoztatva
     */
    public void Nyit() {
        Printer.PrintTabIn("Csapdaajto" + '\t' + "Nyit()");
        Printer.PrintTabOut("Return");
    }

    /**
     * Becsukja az ajt�t, az erre a c�lra fentartott boolean erteket valtoztatva
     */
    public void Csuk() {
        Printer.PrintTabIn("Csapdaajto" + '\t' + "Csuk()");
        Printer.PrintTabOut("Return");
    }


    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i    Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j    Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("Csapdaajto" + '\t' + "Fogad(Jatekos)");
        if (nyitva) {
            aktj.Halal();
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            return true;
        } else {
            boolean success = super.Fogad(i, aktj, j);
            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param d Doboz, ami a mezore kivan lepni
     * @param j Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("Csapdaajto" + '\t' + "Fogad(Doboz, Jatekos)");
        if (nyitva) {
            d.Halal();
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            return true;
        } else {
            boolean success = super.Fogad(i, d, j);
            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }
    }


}
