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

public class Csapdaajto extends UresMezo {

	private boolean nyitva;
	
	   /**
	   * Az osztaly konstruktora. Beallitja az ajtot.
	   */
	public Csapdaajto(){
		super();
		nyitva=false;
	}
	
	
	   /**
	   * Kinyitja az ajtót, az erre a célra fentartott boolean erteket valtoztatva
	   */	
	public void Nyit() {
		System.out.println("Csapdaajto"+'\t'+"Nyit()");
	}
	
	   /**
	   * Becsukja az ajtót, az erre a célra fentartott boolean erteket valtoztatva
	   */	
	public void Csuk() {
		System.out.println("Csapdaajto"+'\t'+"Csuk()");
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
		System.out.println("Csapdaajto"+'\t'+"Fogad(Jatekos)");
		if(nyitva==true) {
			aktj.Halal();
			System.out.println(true);
		return true;
		}else {
			boolean success=super.Fogad(i,aktj,j);
			System.out.println(success);
			return success;
		}
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
		System.out.println("Csapdaajto"+'\t'+"Fogad(Doboz, Jatekos)");
		if(nyitva==true) {
			d.Halal();
			System.out.println(true);
		return true;
		}
		else {
			boolean success=super.Fogad(i, d, j);
			System.out.println(success);
			return success;
		}
	}
	

}
