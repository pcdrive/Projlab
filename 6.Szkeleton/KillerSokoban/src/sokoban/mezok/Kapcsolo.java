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
import sokoban.Irany;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;

import java.util.LinkedList;

public class Kapcsolo extends UresMezo {

    private LinkedList<Csapdaajto> csapdak;

    /**
     * Az osztaly konstruktora. Letrehozza a tombbot amiben a szomszedokat taroljuk.
     */
    public Kapcsolo() {
        super();
        csapdak = new LinkedList<Csapdaajto>();
        mezoTipus = 5;
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
    	
        Printer.PrintTabIn("Kapcsolo" + '\t' + "Fogad(Irany, JeloltDoboz, Jatekos)");
        boolean success = super.Fogad(ero, i, jd, j);

        if (success) {
            for (Csapdaajto c : csapdak) {
                c.Nyit();
            }
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
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i    Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j    Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    @Override
    public boolean Fogad(float ero, Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("Kapcsolo" + '\t' + "Fogad(Irany, Jatekos)");
        boolean success = super.Fogad(ero, i, aktj, j);

        if (success) {
            for (Csapdaajto c : csapdak) {
                c.Csuk();
            }
        }

        Printer.PrintTabOut("Return " + Boolean.toString(success));
        return success;
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

        Printer.PrintTabIn("Kapcsolo" + '\t' + "Fogad(Irany, Doboz,Jatekos)");
        boolean success = super.Fogad(ero, i, d, j);

        if (success) {
            for (Csapdaajto c : csapdak) {
                c.Nyit();
            }
        }

        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * A kapcsolora kot egy csapdat.
     *
     * @param c A kapcsolohoz adni kivant csapda.
     */
    public void AddCsapda(Csapdaajto c) {
        Printer.PrintTabIn("Kapcsolo" + '\t' + "AddCsapda(Csapdaajto)");
        csapdak.add(c);
        Printer.PrintTabOut("Return");
    }

    public int getID(){
        return leptetheto.getTipus() * 10000000 + leptetheto.getStatus() * 100000 + mezoTipus * 1000 + mez * 10 + olaj;
    }
}
