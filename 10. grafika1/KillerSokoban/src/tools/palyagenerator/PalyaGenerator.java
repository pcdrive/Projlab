package tools.palyagenerator;

import server.PalyaAdat;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.mezok.*;
import tools.Printer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
 * @since 2018.03.30.
 */
public class PalyaGenerator {

    private static Fal fal = new Fal();
    private static UresMezo uresMezo = new UresMezo();
    private static Lyuk lyuk = new Lyuk();
    private static Kapcsolo kapcsolo = new Kapcsolo();
    private static Csapdaajto csapdaajto = new Csapdaajto();
    private static Celhely celhely = new Celhely();

    public static void main(String[] args) {
        try {
            Printer.DisablePrint();
            int x = 10;
            int y = 10;
            int csapdaajtok[] = new int[2];
            FileOutputStream fileOutputStream = new FileOutputStream("ujpalya.mocsi");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            int[] palya = new int[x * y];
            
            for (int i = 0; i < x; i++) {
                palya[i] = fal.getID();
                palya[y * x - 1 - i] = fal.getID();
            }
            for (int i = 0; i < y; i++) {
                palya[i * x] = fal.getID();
                palya[(i + 1) * x - 1] = fal.getID();
            }

            for (int i = 0; i < x * y; i++) {
                if (palya[i] != fal.getID()) {
                    palya[i] = uresMezo.getID();
                }
            }


            //START_OF_CREATION
            //INSERT YOUR COSTUM PÁLYÁZ KÓD HÍR


            uresMezo.Fogad(0, null, new Jatekos(null, null, null), null);
            palya[13] = palya[15] = palya[18] = uresMezo.getID();
            uresMezo.Enged();
            uresMezo.Fogad(0, null, new Doboz(null,null), null);
            palya[55] = uresMezo.getID();
            palya[85] = celhely.getID();


            //END_OF_CREATION

            PalyaAdat palyaAdat = new PalyaAdat(3, palya, csapdaajtok, x, y);
            objectOutputStream.writeObject(palyaAdat);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}