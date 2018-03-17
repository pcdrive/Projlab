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

public class Celhely extends UresMezo {

    private boolean jel;

    /**
     * Az osztaly konstruktora. Be�ll�tja a jelet.
     */
    public Celhely() {
        super();
        jel = true;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param i  Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param jd JeloltDoboz, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(Irany i, JeloltDoboz jd, Jatekos j) {
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(JeloltDoboz,Jatekos)");
        boolean success = super.Fogad(i, jd, j);
        if (!jel || !jd.getJel()) {
            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }

        if (success) {
            jd.JeletTorol();
            j.PontotKap();
        }
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
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
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(Jatekos)");
        boolean success = super.Fogad(i, aktj, j);
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
     * @param j Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(Doboz,Jatekos)");
        boolean success = super.Fogad(i, d, j);
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

}
