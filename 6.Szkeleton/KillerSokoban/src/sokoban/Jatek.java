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

import Tools.Printer;
import data.Data;
import server.KliensAdat;

public class Jatek {

    Jatek jatek;

    /**
     * Az osztaly konstruktora.
     */
    public Jatek() {
    }

    /**
     * Elkezdi a jatekot. Letrehozza a palyat, es annak tartalmat.
     */
    public void StartGame() {
        Printer.PrintTabIn("Jatek" + '\t' + "StartGame()");
        Printer.PrintTabOut("Return");
    }

    /**
     * Befejezi a jatekot. Torli a palyat, es annak tartalmat.
     */
    public void EndGame() {
        Printer.PrintTabIn("Jatek" + '\t' + "EndGame()");
        Printer.PrintTabOut("Return");
    }

    public void Print(KliensAdat kliensAdat) {
        for (int i = 0; i < Data.PalyaY; i++) {
            for (int j = 0; j < Data.PalyaX; j++) {
                System.out.print("\t" + kliensAdat.palya[i * Data.PalyaX + j]);
            }
            System.out.println();
        }
    }
}
