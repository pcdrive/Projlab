package tools.palyagenerator;

import server.PalyaAdat;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;
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
            int x = 20;
            int y = 19;
            int csapdaajtok[] = new int[15];
            FileOutputStream fileOutputStream = new FileOutputStream("demopalya.mocsi");
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
            palya[33] = palya[35] = uresMezo.getID();
            uresMezo.Enged();
            uresMezo.Fogad(0, null, new Doboz(null, null), null);
            palya[45] = palya[50] = palya[62] = palya[71] = palya[129] = palya[135] = palya[146] = palya[172] = palya[184] = palya[187] = palya[216] = palya[290] = palya[323] = palya[354] = uresMezo.getID();
            uresMezo.Enged();
            uresMezo.Fogad(0, null, new JeloltDoboz(null, null), null);
            palya[61] = palya[69] = palya[114] = palya[186] = palya[205] = palya[297] = uresMezo.getID();

            palya[52] = palya[67] = palya[96] = palya[105] = palya[106] = palya[116] = palya[136] = palya[156] = palya[125] = palya[145] = palya[150] = palya[171] = palya[182] = palya[183] = palya[188] = palya[208] = palya[209] = palya[213] = palya[237] = palya[255] = palya[246] = palya[284] = palya[285] = palya[309] = palya[310] = palya[330] = palya[355] = palya[356] = palya[357] = fal.getID();

            palya[43] = palya[76] = palya[123] = palya[141] = palya[170] = palya[189] = palya[218] = palya[264] = palya[307] = palya[329] = palya[332] = lyuk.getID();

            palya[68] = palya[92] = palya[107] = palya[249] = palya[282] = palya[271] = celhely.getID();

            int i = 0;
            csapdaajtok[i++] = palya[64] = kapcsolo.getID();
            palya[77] = palya[90] = palya[148] = palya[231] = palya[262] = palya[336] = csapdaajto.getID();

                csapdaajtok[i++] = 77;
            csapdaajtok[i++] = 90;

            csapdaajtok[i++] =148;
            csapdaajtok[i++] =231;
            csapdaajtok[i++] =262;
            csapdaajtok[i++] =336;

            csapdaajtok[i++] = palya[153] = kapcsolo.getID();
            palya[45] = palya[93] = palya[157] = palya[215] = palya[233] = palya[268] = palya[293] = csapdaajto.getID();


            csapdaajtok[i++] =45;
            csapdaajtok[i++] =93;
            csapdaajtok[i++] =157;
            csapdaajtok[i++] =215;
            csapdaajtok[i++] =233;
            csapdaajtok[i++] =268;
            csapdaajtok[i++] =293;

            //END_OF_CREATION

            PalyaAdat palyaAdat = new PalyaAdat(2, palya, csapdaajtok, x, y);
            objectOutputStream.writeObject(palyaAdat);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}