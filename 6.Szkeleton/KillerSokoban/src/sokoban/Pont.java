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

public class Pont {

	private final String nev;
	private int pont;
	   
	   /**
	   * Az osztaly konstruktora. Eltarolja a nevet, akinek a pontjait tartalmazzuk,
	   * valamint a pontjainak szamat nullara allitja.
	   */	
	public Pont(String nev) {
		this.nev=nev;
		pont=0;
	}
	
	   /**
	   * Lekeri a nev erteket.
	   * 
	   * @return String A nev erteke.
	   */
	public String getNev() {
		System.out.println("Pont"+'\t'+"getNev()");
		System.out.println(nev);
		return nev;
	}
	
	   /**
	   * Lekeri a pontok erteket.
	   * 
	   * @return String A pontok erteke.
	   */
	public int getPont() {
		System.out.println("Pont"+'\t'+"getPont()");
		System.out.println(pont);
		return pont;
	}
	
	   /**
	   * Pontot ad a jatekosnak.
	   */
	public void PontotAd() {
		pont++;
	}
	
}
