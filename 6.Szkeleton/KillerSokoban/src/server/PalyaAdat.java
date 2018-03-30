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

@SuppressWarnings("serial")
public class PalyaAdat extends BaseAdat {
	
	public final int jsz;
    public final int csapdak[];
    

    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     *
     * @param j 	Palya játékosainak száma.
     * @param pa	Palya adatok (int ID-k).
     * @param cs	kapcsolo-csapda osszerendeles.
     */
    public PalyaAdat(int j, int[] pa, int[] cs)
    {
    	super(pa);
    	jsz=j;
    	csapdak=cs;
    }
}
