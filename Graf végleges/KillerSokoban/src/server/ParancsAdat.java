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

import sokoban.Irany;

@SuppressWarnings("serial")
public class ParancsAdat implements Serializable {
	
	public final Irany i;
	
	public final String nev;

    /**
     * Az osztaly konstruktora. Beallitja az attributumokat, amik az
     * informaciot hordozzak.
     * 
     * @param i	A parancs amit a jatekos vegrehajtani szeretne.
     * @param nev	A jatekos neve amibol azonosithato.
     */
	public ParancsAdat(Irany i, String nev) 
	{
		this.i=i;
		this.nev=nev;
	}

}
