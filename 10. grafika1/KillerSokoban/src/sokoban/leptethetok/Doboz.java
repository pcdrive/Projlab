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


package sokoban.leptethetok;

import tools.Printer;
import sokoban.Irany;
import sokoban.Palya;
import sokoban.mezok.UresMezo;

public class Doboz extends Leptetheto {

    protected float tapadas = 0.8f;

    /**
     * Az osztaly konstruktora. Beallitja a mezot es a palyat.
     *
     * @param p A palya.
     * @param m A mezo, amin all.
     */
    public Doboz(Palya p, UresMezo m) {
        super(p, m);
    }

    /**
     * A doboz vegallapotat kerdezi le. A doboz kepes e lepni egy adott iranyba vagy sem.
     *
     * @return boolean Annak az erteke, hogy mozgathato-e.
     */
    public boolean Vege(Irany i) {
        Printer.PrintTabIn("Doboz" + '\t' + "Vege()");

        UresMezo szom = mezo.GetSzomszed(i);
        boolean success = szom.Vege(i);
        
        
        Printer.PrintTabOut("Return: " + success);
        return success;
    }

    /**
     * megoli a dobozt, a palya megfelelo fuggvenyenek hivasaval.
     */
    @Override
    public void Halal() {
        Printer.PrintTabIn("Doboz" + '\t' + "Halal()");
        palya.Halal(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * lekerdezi a tipusat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Tipus szama.
     */
    @Override
    public int getTipus() {
        return 2;
    }

    /**
     * lekerdezi a statuszat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Statusz szama.
     */
    @Override
    public int getStatus() {
        return 0;
    }

    /**
     * Az objektumot egy doboz tolta meg, es az ezzel valo interakciot kezeli.
     *
     * @param ero  az ero amivel a jatekos a sort megtolta.
     * @param surl A mezo surlodasa, amin all.
     * @param i    Irany amerre a dobozt toltak
     * @param j    Jatekos, aki tol�st kezdte
     * @return boolean Annak az erteke, hogy a doboz tolhato-e.
     */
    @Override
    public boolean Utkozik(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn("Doboz" + '\t' + "Utkozik(float, float, Irany, Jatekos)");

        if (ero - tapadas * surl > 0) {

            UresMezo szom = mezo.GetSzomszed(i);
            boolean success = szom.Fogad(ero - tapadas * surl, i, this, j);

            if (success) 
            {
                mezo.Enged();
                mezo=szom;
            }

            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }

        Printer.PrintTabOut("Return: " + Boolean.toString(false));

        return false;
    }

    /**
     * Az objektumot egy jatekos tolta meg, �s az ezzel valo interakciot kezeli.
     *
     * @param ero  az ero amivel a jatekos a sort megtolta.
     * @param surl A mezo surlodasa, amin all.
     * @param i    Irany amerre a dobozt toltak
     * @param j    Jatekos, aki tol�st kezdte
     * @return boolean Annak az erteke, hogy a doboz tolhato-e.
     */
    @Override
    public boolean Tol(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn("Doboz" + '\t' + "Tol(float, float, Irany, Jatekos)");

        if (ero - tapadas * surl > 0) {


            UresMezo szom = mezo.GetSzomszed(i);
            boolean success = szom.Fogad(ero - tapadas * surl, i, this, j);
            if (success) 
            {
                mezo.Enged();
                mezo=szom;
            }
            Printer.PrintTabOut("Return: " + Boolean.toString(success));
            return success;
        }

        Printer.PrintTabOut("Return: " + Boolean.toString(false));

        return false;
    }

}
