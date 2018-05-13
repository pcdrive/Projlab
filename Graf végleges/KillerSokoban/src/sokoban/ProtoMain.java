/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018-02-09
 */


package sokoban;

import tools.Printer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProtoMain {

	private static Jatek j;

    /**
     * ProtoMain fuggveny, ami a jatekot futtatja.
     * 
     * @param args	parancssori argumentumok
     */

    /**
     * Lehetseges parancsok listazasa
     */

	public static void main(String[] args)
	{
		Printer.DisablePrint();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line="";

        while (!line.toUpperCase().equals("Q")) {
	        System.out.print("[MENU]: Opciok: \n[MENU]:  1, Start szerver <S>\n[MENU]:  2, Kapcsolodas <K>\n[MENU]:  3, Quit <Q>\n[MENU]: ");
	    	try {
				 line = br.readLine();

				switch (String.valueOf(line.toUpperCase()))
				{
				case "S": {j = new Jatek(); j.SzerverMod();} break;
				case "K": {j = new Jatek(); j.KliensMod();} break;
				case "Q": System.exit(0); break;
				}
			} catch (IOException e) {
				System.out.println("Beolvasasi hiba");
				return;
			}
        }
	}
}
