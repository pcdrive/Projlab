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

package sokoban.mezok;

import tools.Printer;
import sokoban.Irany;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;

public class Celhely extends UresMezo {

    private boolean jel;

    /**
     * Az osztaly konstruktora. Beallitja a jelet.
     */
    public Celhely() {
        super();
        jel = true;
        mezoTipus = 3;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero az ero amivel a jatekos a sort megtolta.
     * @param i   Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param jd  JeloltDoboz, ami a mezore kivan lepni
     * @param j   Jatekos, aki lepest tette.
     * 
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, JeloltDoboz jd, Jatekos j) {
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(Irany,JeloltDoboz,Jatekos)");
        boolean success = super.Fogad(ero, i, jd, j);
        if (!jel || !jd.getJel()) {
            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }

        if (success) {
            jd.JeletTorol();
            j.PontotKap();
            jel = false;
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
     * @param ero  az ero amivel a jatekos a sort megtolta.
     * @param i    Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j    Jatekos, aki lepest tette.
     * 
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(Irany, Jatekos, Jatekos)");
        boolean success = super.Fogad(ero, i, aktj, j);
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero az ero amivel a jatekos a sort megtolta.
     * @param i   Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param d   Doboz, ami a mezore kivan lepni
     * @param j   Jatekos, aki lepest tette.
     * 
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("Celhely" + '\t' + "Fogad(Irany,Doboz,Jatekos)");
        boolean success = super.Fogad(ero, i, d, j);
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * Visszaadja a mezo aktualis ID azonositojat.
     * 
     * @return int ID szama.
     */
    @Override
    public int getID() {
        return (leptetheto != null ? leptetheto.getTipus() * 10000000 : 0) + (leptetheto != null ? leptetheto.getStatus() * 100000 : 0) + mezoTipus * 1000 + (jel ? 1 : 0) * 100 + mez * 10 + olaj;
    }
}
