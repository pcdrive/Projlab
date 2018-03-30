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

import Tools.Printer;
import sokoban.leptethetok.Doboz;
import sokoban.Irany;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;

public class Fal extends UresMezo {

    /**
     * Az osztaly konstruktora.
     */
    public Fal() {
        super();
        mezoTipus = 1;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i  Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param jd JeloltDoboz, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, JeloltDoboz jd, Jatekos j) {
        Printer.PrintTabIn("Fal" + '\t' + "Fogad(Irany, JeloltDoboz, Jatekos)");
        Printer.PrintTabOut("Return: " + Boolean.toString(false));
        return false;
    }


    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i    Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j    Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("Fal" + '\t' + "Fogad(Irany, Jatekos, Jatekos)");
        Printer.PrintTabOut("Return: " + Boolean.toString(false));
        return false;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param d Doboz, ami a mezore kivan lepni
     * @param j Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("Fal" + '\t' + "Fogad(Irany, Doboz,Jatekos)");
        Printer.PrintTabOut("Return: " + Boolean.toString(false));
        return false;
    }

    public int getID(){
        return (leptetheto != null ? leptetheto.getTipus() * 10000000 : 0) + (leptetheto != null ? leptetheto.getStatus() * 100000 : 0) + mezoTipus * 1000 + mez * 10 + olaj;
    }
}
