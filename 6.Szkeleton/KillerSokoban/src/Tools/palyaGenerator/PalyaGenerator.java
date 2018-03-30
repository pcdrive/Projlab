package Tools.palyaGenerator;

import server.PalyaAdat;
import sokoban.mezok.*;

import java.io.*;

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

    public static void main(String[] args){
        try {
            int x = 5;
            int y = 5;
            FileOutputStream fileOutputStream = new FileOutputStream("palya.mocsi");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            int[] palya = new int[x*y];
//            for(int i = 0; i<x; i++){
//                for(int j = 0; j<y; j++){
//                    palya[i* Data.PalyaX + j] = fal.getID();
//                }
//            }



            PalyaAdat kliensAdat = new PalyaAdat(0,palya, null, x, y);
            objectOutputStream.writeObject(kliensAdat);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
