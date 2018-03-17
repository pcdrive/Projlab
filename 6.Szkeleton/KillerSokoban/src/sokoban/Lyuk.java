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

public class Lyuk extends UresMezo {
	
	   /**
	   * Az osztaly konstruktora.
	   */
	public Lyuk() {
		super();
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
		System.out.println("Lyuk"+'\t'+"Fogad(Jatekos)");
		j.Halal();		
		System.out.println(true);
		return true;
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
		System.out.println("Lyuk"+'\t'+"Fogad(Doboz,Jatekos)");
		d.Halal();
		System.out.println(true);
		return true;
	}
	
}
