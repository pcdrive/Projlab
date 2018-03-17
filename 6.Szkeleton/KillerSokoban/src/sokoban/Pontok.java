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

import java.util.ArrayList;

public class Pontok {

	private ArrayList<Pont> pontok;
	   
	   /**
	   * Az osztaly konstruktora. Letrehozza a pontok listajat.
	   */	
	public Pontok() 
	{ 
		pontok = new ArrayList<Pont>();
	}
	
	   /**
	   * A jatekos pontszerzeset kezeli. Ez tovabbhivja pontok osztaly pontot kap
	   * metodusat.
	   * 
	   * @param nev A jatekos neve, aki a pontot kapja.
	   */
	public void PontotKap(String nev) {
		System.out.println("Pontok"+'\t'+"PontotKap(Jatekos)");
		
		for (Pont p: pontok) 
		{
			if (p.getNev()==nev) 
			{
				p.PontotAd();
			}
		}
		
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
		
		for (Pont p: pontok) 
		{
			if (p.getNev()==nev) 
			{
				return p.getPont();
			}
		}
		
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
