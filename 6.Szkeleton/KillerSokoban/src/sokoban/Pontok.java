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

import java.util.List;

public class Pontok {

	private List<Pont> pontok;
	   
	   /**
	   * Az osztaly konstruktora. Letrehozza a pontok listajat.
	   */	
	public Pontok() 
	{
	}
	
	   /**
	   * A jatekos pontszerzeset kezeli. Ez tovabbhivja pontok osztaly pontot kap
	   * metodusat.
	   */
	public void PontotKap(Jatekos j) {
		System.out.println("Pontok"+'\t'+"PontotKap(Jatekos)");
	}
	
	   /**
	   * A jatekos pontszerzeset kezeli. Ez tovabbhivja pontok osztaly pontot kap
	   * metodusat.
	   * 
	   * @param nev A jatekos neve.
	   * 
	   * @return int A pontok szama.
	   */
	public int getPont(String nev) {
		System.out.println("Pontok"+'\t'+"getPont(int)");
		System.out.println("A jatekos pontjainak szama");
		return 0;
	}
	
	   /**
	   * A pontok listajanak hossza.
	   * 
	   * @return int A lista hossza.
	   */
	public int getHossz() {
		System.out.println("Pontok"+'\t'+"getHossz()");
		System.out.println(pontok.size());
		return pontok.size();
	}
	
}
