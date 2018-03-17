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

public abstract class Leptetheto {

	protected UresMezo mezo;
	protected Palya palya;

	   /**
	   * Az osztaly konstruktora.
	   * 
	   * @param p  A palya.
	   * @param m  A mezo amin all.
	   */
	public Leptetheto(Palya p, UresMezo m) {
		palya=p;
		mezo=m;
	}
	
	   /**
	   * Az objektumot egy doboz tolta meg, és az ezzel valo interakciot kezeli.
	   * 
	   * @param i Irany amerre a dobozt tolták
	   * @param j  Jatekos, aki tolást kezdte
	   * 
	   * @return boolean Annak az erteke, hogy a Leptetheto tolhato-e.
	   */
	public abstract  boolean Utkozik(Irany i, Jatekos j);
	
	   /**
	   * Az objektumot egy doboz jatekos meg, és az ezzel valo interakciot kezeli.
	   * 
	   * @param i Irany amerre a dobozt tolták
	   * @param j  Jatekos, aki tolást kezdte
	   * 
	   * @return boolean Annak az erteke, hogy a Leptetheto tolhato-e.
	   */
	public abstract boolean Tol(Irany i, Jatekos j);
	
	   /**
	   * A jatekos halalat kezeli. Ezt hivja meg a mezo,
	   * ez pedig tovabbhivja a palya halal metodusat.
	   */
	public abstract void Halal();
	
}
