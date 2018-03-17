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

public class UresMezo {

    private UresMezo szomszed[];
    protected Leptetheto leptetheto;

    public UresMezo() {
        szomszed = new UresMezo[4];
    }


    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param jd JeloltDoboz, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(Irany i, JeloltDoboz jd, Jatekos j) {
        System.out.println("UresMezo" + '\t' + "Fogad(JeloltDoboz, Jatekos)");
        boolean success = this.Fogad(i, (Doboz) jd, j);
        System.out.println(success);
        return success;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("UresMezo" + '\t' + "Fogad(Jatekos)");
        if (leptetheto == null) {
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            return true;
        }
        boolean success = leptetheto.Tol(i, j);
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param d Doboz, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     *
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("UresMezo" + '\t' + "Fogad(Doboz, Jatekos)");
        if (leptetheto == null) {
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            return true;
        }
        boolean success = leptetheto.Utkozik(i, j);
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * Elengedi a leptethetot, amikor az ellep a mezorol.
     */
    public void Enged() {
        Printer.PrintTabIn("UresMezo" + '\t' + "Enged(Leptetheto)");
        leptetheto = null;
        Printer.PrintTabOut("Return");
    }

    /**
     * Megadja a szomszedos mezot az adott iranyba.
     *
     * @param i Az irany amiben a szomszedos mezot keressuk.
     *
     * @return UresMezo A szomszedos mezo.
     */
    public UresMezo GetSzomszed(Irany i) {
        Printer.PrintTabIn("UresMezo" + '\t' + "GetSzomszed(Irany)");
        Printer.PrintTabOut("Return: " + szomszed[i.ordinal()]);
        return szomszed[i.ordinal()];
    }

    /**
     * Beallitja a szomszedos mezot az adott iranyba.
     *
     * @param i Az irany amiben a szomszedos mezot keressuk.
     * @param u A mezo amit beallitunk.
     */
    public void SetSzomszed(Irany i, UresMezo u) {
        Printer.PrintTabIn("UresMezo" + '\t' + "SetSzomszed(Irany, UresMezo)");
        szomszed[i.ordinal()] = u;
        Printer.PrintTabOut("Return");
    }

}
