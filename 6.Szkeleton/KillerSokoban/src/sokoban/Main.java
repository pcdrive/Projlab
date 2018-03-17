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

public class Main {
	
	
	   /**
	   * Main fuggveny, ami a jatekot futtatja.
	   */
	public static void main(String[] args) {
		Jatek j = new Jatek();
		j.StartGame();
	}

}
