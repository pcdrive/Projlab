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
public class PalyaAdat extends KliensAdat implements Serializable {
	
	public final int jsz;
    public final int csapdak[];
    

    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     * 
     * @param pa	Palya adatok (int ID-k).
     * @param cs	kapcsolo-csapda osszerendeles.
     * @param ID	jatekos azonositok.
     * @param po	A jatekosok pontjai.
     */
    public PalyaAdat(int j, int[] pa, int[] cs, String[] ID, Pontok po) 
    {
    	super(pa,ID,po);
    	jsz=j;
    	csapdak=cs;
    }
}
