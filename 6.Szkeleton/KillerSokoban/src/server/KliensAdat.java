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

import sokoban.Pontok;

public class KliensAdat {
	
    public final int palya[];
    public final Pontok pontok;
    

    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     * 
     * @param pa	Palya adatok (int ID-k).
     * @param po	A jatekosok pontjai.
     */
    public KliensAdat(int[] pa, Pontok po) 
    {
    	palya=pa;
    	pontok=po;
    }
}
