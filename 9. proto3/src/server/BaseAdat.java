package server;

import java.io.Serializable;

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
 * @since 2018.03.30.
 */

@SuppressWarnings("serial")
public class BaseAdat implements Serializable {
    public final int palya[];
    public final int x;
    public final int y;
    
    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     *
     * @param pa	Palya adatok (int ID-k).
     * @param x	A palya szelessege.
     * @param y	A palya hossza.
     */
    public BaseAdat(int[] pa, int x, int y)
    {
        palya=pa;
        this.x=x;
        this.y=y;
    }
}
