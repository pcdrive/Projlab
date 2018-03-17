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

public class Kapcsolo extends UresMezo {
	
	private Csapdaajto csapdak[];
	
	   /**
	   * Az osztaly konstruktora. Letrehozza a tombbot amiben a szomszedokat taroljuk.
	   */
	public Kapcsolo(){
		super();
		csapdak = new Csapdaajto[4];
	}
	
	   /**
	   * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a 
	   * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
	   * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
	   * a pontot erte.
	   * 
	   * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
	   * @param aktj Jatekos, ami a mezore kivan lepni
	   * @param j  Jatekos, aki lepest tette.
	   * 
	   * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
	   */
	public boolean Fogad(Irany i, Jatekos aktj, Jatekos j) {
		System.out.println("Kapcsolo"+'\t'+"Fogad(Jatekos)");
		boolean success=super.Fogad(i,aktj,j);
		
		if(success==true) {
			for(Csapdaajto c: csapdak) {
				c.Csuk();
			}
		}
		System.out.println(success);
		return success;
	}
	
	   /**
	   * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a 
	   * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
	   * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
	   * a pontot erte.
	   * 
	   * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
	   * @param d Doboz, ami a mezore kivan lepni
	   * @param j  Jatekos, aki lepest tette.
	   * 
	   * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
	   */
	public boolean Fogad(Irany i, Doboz d, Jatekos j) {
		System.out.println("Kapcsolo"+'\t'+"Fogad(Doboz,Jatekos)");
		boolean success=super.Fogad(i, d, j);
		
		if(success==true) {
		for(Csapdaajto c: csapdak) {
			c.Nyit();
		}
		}
		System.out.println(success);
		return success;
	}
	
	
	
}
