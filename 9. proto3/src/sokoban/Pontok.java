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

import java.io.Serializable;
import java.util.LinkedList;

@SuppressWarnings("serial")
public class Pontok implements Serializable{

    private LinkedList<Pont> pontok;

    /**
     * Az osztaly konstruktora. Letrehozza a pontok listajat.
     */
    public Pontok() {
        pontok = new LinkedList<Pont>();
    }

    /**
     * A jatekos pontszerzeset kezeli.
     *
     * @param nev A jatekos neve, aki a pontot kapja.
     */
    public void PontotKap(String nev) {
        Printer.PrintTabIn("Pontok" + '\t' + "PontotKap(String)");

        for (Pont p : pontok) {
            if (p.getNev() == nev) {
                p.PontotAd();
            }
        }
        Printer.PrintTabOut("Return");
    }

    /**
     * A jatekos pontjait kerdezi le.
     *
     * @param nev A jatekos neve.
     * 
     * @return int A pontok szama.
     */
    public int getPont(String nev) {
        Printer.PrintTabIn("Pontok" + '\t' + "getPont(String)");
        for (Pont p : pontok) {
            if (p.getNev() == nev) {
                Printer.PrintTabOut("Return: " + p.getPont());
                return p.getPont();
            }
        }
        Printer.PrintTabOut("Return: " + 0);
        return 0;
    }

    /**
     * A jatekos pontjait kerdezi le.
     *
     * @param idx A jatekos sorszama a listaban.
     * 
     * @return int A pontok szama.
     */
    public Pont getPont(int idx) {
        Printer.PrintTabIn("Pontok" + '\t' + "getPont(int)");
        Printer.PrintTabOut("Return: pontok.get(" + idx + ")");
        return pontok.get(idx);
    }

    /**
     * A pontok listajanak hossza.
     *
     * @return int A lista hossza.
     */
    public int getHossz() {
        Printer.PrintTabIn("Pontok" + '\t' + "getHossz()");
        Printer.PrintTabOut("Return: " + pontok.size());
        return pontok.size();
    }

    /**
     * A pontok listajahoz ad elemet.
     *
     * @param nev A lista uj eleme, a jatekos neve.
     */
    public void AddJatekos(String nev) {
        pontok.add(new Pont(nev));
        Printer.PrintTabIn("Pontok" + '\t' + "AddJatekos(String)");
    }

}