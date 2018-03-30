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

package server;

import java.io.Serializable;

import sokoban.Pontok;

@SuppressWarnings("serial")
public class KliensAdat implements Serializable {
	
    public final int palya[];
    public final String IDk[];
    public final Pontok pontok;
    

    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     * 
     * @param pa	Palya adatok (int ID-k).
     * @param ID	jatekos azonositok.
     * @param po	A jatekosok pontjai.
     */
    public KliensAdat(int[] pa, String[] ID, Pontok po) 
    {
    	palya=pa;
    	IDk=ID;
    	pontok=po;
    }
}
