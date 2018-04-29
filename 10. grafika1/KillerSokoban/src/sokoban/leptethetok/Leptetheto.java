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

import sokoban.Irany;
import sokoban.Palya;
import sokoban.mezok.UresMezo;

public abstract class Leptetheto {

    protected UresMezo mezo;
    protected Palya palya;

    /**
     * Az osztaly konstruktora.
     *
     * @param p A palya.
     * @param m A mezo amin all.
     */
    public Leptetheto(Palya p, UresMezo m) {
        palya = p;
        mezo = m;
    }

    /**
     * Az objektumot egy doboz tolta meg, �s az ezzel valo interakciot kezeli.
     *
     * @param i Irany amerre a dobozt tolt�k
     * @param j Jatekos, aki tol�st kezdte
     * 
     * @return boolean Annak az erteke, hogy a Leptetheto tolhato-e.
     */
    public abstract boolean Utkozik(float ero, float surl, Irany i, Jatekos j);

    /**
     * Az objektumot egy doboz jatekos meg, �s az ezzel valo interakciot kezeli.
     *
     * @param i Irany amerre a dobozt tolt�k
     * @param j Jatekos, aki tol�st kezdte
     * 
     * @return boolean Annak az erteke, hogy a Leptetheto tolhato-e.
     */
    public abstract boolean Tol(float ero, float surl, Irany i, Jatekos j);

    /**
     * A jatekos halalat kezeli. Ezt hivja meg a mezo,
     * ez pedig tovabbhivja a palya halal metodusat.
     */
    public abstract void Halal();

    /**
     * lekerdezi a tipusat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Tipus szama.
     */
    public int getTipus() {return 0;}

    /**
     * lekerdezi a statuszat a mezo ID-jenek eloallitasakor.
     * 
     * @return int Statusz szama.
     */
    public int getStatus() {return 0;}

    /**
     * lekerdezi, hogy a leptetheto lephet-e az adott iranyba.
     * 
     * @return boolean Lephet, vagy sem.
     */
    public abstract boolean Vege(Irany i);

}
