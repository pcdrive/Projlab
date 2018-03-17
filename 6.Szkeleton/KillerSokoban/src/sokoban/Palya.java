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


@SuppressWarnings("unused")

public class Palya{
	private Jatek jatek;
	private UresMezo mezok[];
	private Pontok pontok;
	private Doboz dobozok[];
	private Jatekos jatekosok[];
	
	   /**
	   * Az osztaly konstruktora. Letrehozza a pontok osztalyt, és beallitja a jatekot.
	   */
	public Palya(Jatek j) {
		jatek=j;
		pontok = new Pontok();
	}
	

	   /**
	   * A jatekos lepeset inditja el.
	   * 
	   * @param i Irany amerre lepni akarunk
	   * @param nev A jatekos neve, azonositoja, akit leptetni akarunk.
	   */
	public void Leptet(Irany i, String nev) {
		System.out.println("Palya"+'\t'+"Leptet()");
	}

	   /**
	   * A jatekost torli a listabol.
	   * 
	   * @param j A jatekos akinek meg kell halnia.
	   */
	public void Halal(Jatekos j) {
		System.out.println("Palya"+'\t'+"Halal(Jatekos)");
	}

	   /**
	   * A dobozt torli a listabol.
	   * 
	   * @param j A doboz akinek meg kell halnia.
	   */
	public void Halal(Doboz d) {
		System.out.println("Palya"+'\t'+"Halal(Doboz)");
	}
	
	   /**
	   * A jatekos pontszerzeset kezeli. Ez tovabbhivja pontok osztaj pontot kap
	   * metodusat.
	   */
	public void PontotKap(Jatekos j) {
		System.out.println("Palya"+'\t'+"PontotKap(Jatekos)");
		pontok.PontotKap(j);
	}
	
	   /**
	   * Vegignezi a dobozokat, es ellenorzi a jatek veget.
	   */
	public void Vegellenorzes() {
		System.out.println("Palya"+'\t'+"Vegellenorzes()");
		
		for(Doboz d: dobozok) {
			boolean mozgathato=d.Vege();
			if(mozgathato==true) {
				return;
			}
		}
		
		jatek.EndGame();
		return;
	}
	
}
