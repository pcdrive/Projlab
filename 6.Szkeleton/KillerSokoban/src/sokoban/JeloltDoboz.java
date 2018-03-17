/**
* A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
* A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
*
* @author  Horvath Gergo
* @author  Mocsari Andras
* @author  Zsiros Balint
* @author  Bottlik Judit
* @author  Holub Csongor
*  
* @version 1.0
* @since   2018-02-09 
*/


package sokoban;

public class JeloltDoboz extends Doboz {
	private boolean jel;
	
	
	   /**
	   * Az osztaly konstruktora. Beallitja a jelet, palyat es a mezot.
	   * 
	   * @param p A palya.
	   * @param m A mezo, amin all.
	   */
	public JeloltDoboz(Palya p, UresMezo m) {
		super(p,m);
		jel=true;
	}
	
	   /**
	   * Torli a doboz jeloleset, a boolean ertek megveltoztatasaval.
	   */
	public void JeletTorol() {
		System.out.println("JeloltDoboz"+'\t'+"JeletTorol()");
		jel = false;
	}
	
	   /**
	   * Lekeri a jel erteket.
	   * 
	   * @return boolean A jel erteke.
	   */
	public boolean getJel() {
		System.out.println("JeloltDoboz"+'\t'+"JeletTorol()");
		System.out.println(jel);
		return jel;
	}

}
