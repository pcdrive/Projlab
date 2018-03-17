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

public class UresMezo {

	private UresMezo szomszed[];
	protected Leptetheto leptetheto;
	
	public UresMezo() 
	{
		szomszed = new UresMezo[4];
	}
	
	
	   /**
	   * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a 
	   * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
	   * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
	   * a pontot erte.
	   * 
	   * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
	   * @param jd JeloltDoboz, ami a mezore kivan lepni
	   * @param j  Jatekos, aki lepest tette.
	   * 
	   * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
	   */
	public boolean Fogad(Irany i, JeloltDoboz jd, Jatekos j) {
		System.out.println("UresMezo"+'\t'+"Fogad(JeloltDoboz, Jatekos)");
		boolean success = this.Fogad(i, (Doboz)jd, j);
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
	   * @param aktj Jatekos, ami a mezore kivan lepni
	   * @param j  Jatekos, aki lepest tette.
	   * 
	   * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
	   */
	public boolean Fogad(Irany i, Jatekos aktj, Jatekos j) {
		System.out.println("UresMezo"+'\t'+"Fogad(Jatekos)");
		if(leptetheto==null) {
			return true;
		}
		boolean success=leptetheto.Tol(i, j);
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
		System.out.println("UresMezo"+'\t'+"Fogad(Doboz, Jatekos)");
		if(leptetheto==null) {
			System.out.println(true);
			return true;
		}
		boolean success=leptetheto.Utkozik(i, j);
		System.out.println(success);
		return success;
	}
	
	   /**
	   * Elengedi a leptethetot, amikor az ellep a mezorol.
	   */
	public void Enged() {
		System.out.println("UresMezo"+'\t'+"Enged(Leptetheto)");
		leptetheto = null; 
	}
	
	   /**
	   * Megadja a szomszedos mezot az adott iranyba.
	   * 
	   * @param i Az irany amiben a szomszedos mezot keressuk.
	   * 
	   * @return UresMezo A szomszedos mezo.
	   */
	public UresMezo GetSzomszed(Irany i) {
		System.out.println("UresMezo"+'\t'+"GetSzomszed(Irany)");
		return szomszed[i.ordinal()];
	}
	
	   /**
	   * Beallitja a szomszedos mezot az adott iranyba.
	   * 
	   * @param i Az irany amiben a szomszedos mezot keressuk.
	   * @param u A mezo amit beallitunk.
	   */
	public void SetSzomszed(Irany i, UresMezo u) {
		System.out.println("UresMezo"+'\t'+"SetSzomszed(Irany, UresMezo)");
		szomszed[i.ordinal()] = u;
	}
	
}
