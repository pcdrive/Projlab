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

public class Doboz extends Leptetheto {
	
	   /**
	   * Az osztaly konstruktora. Beallitja a mezot es a palyat.
	   * 
	   * @param p A palya.
	   * @param m A mezo, amin all.
	   */
	public Doboz(Palya p, UresMezo m) {
		super(p,m);
	}

	   /**
	   * A doboz mozgathatosagat kerdezi le.
	   * 
	   * @return boolean Annak az erteke, hogy mozgathato-e.
	   */	
	public boolean Vege() {
		System.out.println("Doboz"+'\t'+"Vege()");
		System.out.println(true);
		return true;
	}

	   /**
	   * megoli a dobozt, a palya megfelelo fuggvenyenek hivasaval.
	   */	
	public void Halal() {
		System.out.println("Doboz"+'\t'+"Halal()");
		palya.Halal(this);
	}
	
	   /**
	   * Az objektumot egy doboz tolta meg, és az ezzel valo interakciot kezeli.
	   * 
	   * @param i Irany amerre a dobozt tolták
	   * @param j  Jatekos, aki tolást kezdte
	   * 
	   * @return boolean Annak az erteke, hogy a doboz tolhato-e.
	   */
	public boolean Utkozik(Irany i, Jatekos j) {
		System.out.println("Doboz"+'\t'+"Utkozik(Irany, Jatekos)");
		boolean success=mezo.GetSzomszed(i).Fogad(i, this, j);
		if(success==true)
		mezo.Enged();
		System.out.println(success);
		return success;
	}
	
	   /**
	   * Az objektumot egy jatekos tolta meg, és az ezzel valo interakciot kezeli.
	   * 
	   * @param i Irany amerre a dobozt tolták
	   * @param j  Jatekos, aki tolást kezdte
	   * 
	   * @return boolean Annak az erteke, hogy a doboz tolhato-e.
	   */
	public boolean Tol(Irany i, Jatekos j) {
		System.out.println("Doboz"+'\t'+"Tol(Irany, Jatekos)");
		boolean success=mezo.GetSzomszed(i).Fogad(i, this, j);
		if(success==true)
		mezo.Enged();
		System.out.println(success);
		return success;
	}
	
}
