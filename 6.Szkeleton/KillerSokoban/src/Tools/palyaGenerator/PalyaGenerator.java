package Tools.palyaGenerator;

import server.PalyaAdat;
import sokoban.Irany;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;
import sokoban.mezok.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;

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

            for(int i = 0; i<x; i++){
                palya[i] = fal.getID();
                palya[24-i] = fal.getID();
            }
            for(int i = 0; i<y; i++){
                palya[i*x] = fal.getID();
                palya[(i+1)*x-1] = fal.getID();
            }

            for(int i = 0; i<palya.length; i++){
                if(palya[i] != fal.getID()){
                    //START_OF_CREATION

                    Random random = new Random();
                    switch (random.nextInt(5)){
                        case 0:
                            switch (random.nextInt(3)){
                                case 1:
                                    uresMezo.Fogad(1, Irany.BALRA, new Jatekos(null, null, null), null);
                                    break;
                                case 2:
                                    uresMezo.Fogad(1, Irany.BALRA, new Doboz(null, null), null);
                                    break;
                                case 3:
                                    uresMezo.Fogad(1, Irany.BALRA, new JeloltDoboz(null, null), null);
                                    break;
                                default:
                                        break;
                            }
                            palya[i] = uresMezo.getID();
                            break;
                        case 1:
                            palya[i] = fal.getID();
                            break;
                        case 2:
                            palya[i] = lyuk.getID();
                            break;
                        case 3:
                            switch (random.nextInt(3)){
                                case 1:
                                    celhely.Fogad(1, Irany.BALRA, new Jatekos(null, null, null), null);
                                    break;
                                case 2:
                                    celhely.Fogad(1, Irany.BALRA, new Doboz(null, null), null);
                                    break;
                                default:
                                    break;
                            }
                            palya[i] = celhely.getID();
                            break;
                        case 4:
                            switch (random.nextInt(3)){
                                case 1:
                                    csapdaajto.Fogad(1, Irany.BALRA, new Jatekos(null, null, null), null);
                                    break;
                                case 2:
                                    csapdaajto.Fogad(1, Irany.BALRA, new Doboz(null, null), null);
                                    break;
                                case 3:
                                    csapdaajto.Fogad(1, Irany.BALRA, new JeloltDoboz(null, null), null);
                                    break;
                                default:
                                    break;
                            }
                            palya[i] = csapdaajto.getID();
                            break;
                        case 5:
                            switch (random.nextInt(3)){
                                case 1:
                                    kapcsolo.Fogad(1, Irany.BALRA, new Jatekos(null, null, null), null);
                                    break;
                                case 2:
                                    kapcsolo.Fogad(1, Irany.BALRA, new Doboz(null, null), null);
                                    break;
                                case 3:
                                    kapcsolo.Fogad(1, Irany.BALRA, new JeloltDoboz(null, null), null);
                                    break;
                                default:
                                    break;
                            }
                            palya[i] = kapcsolo.getID();
                            break;
                    }
                    uresMezo.Enged();
                    kapcsolo.Enged();
                    fal.Enged();
                    csapdaajto.Enged();
                    lyuk.Enged();
                    celhely.Enged();
                    //END_OF_CREATION
                }
            }

            PalyaAdat palyaAdat = new PalyaAdat(0,palya, null, x, y);
            objectOutputStream.writeObject(palyaAdat);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
