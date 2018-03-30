package Tools.Tests;


import data.Data;
import org.junit.Test;
import server.KliensAdat;
import server.Szerver;
import sokoban.Irany;
import sokoban.Jatek;
import sokoban.Palya;
import sokoban.leptethetok.Jatekos;
import sokoban.mezok.Csapdaajto;

public class MocsiTests {
    @Test
    public void PrintTest() {
        int[] palya = new int[Data.PalyaX * Data.PalyaY];
        for (int i = 0; i < Data.PalyaY; i++)
            for (int j = 0; j < Data.PalyaX; j++)
                palya[i * Data.PalyaX + j] = i;
        KliensAdat kliensAdat = new KliensAdat(palya, null);        
        Jatek jatek = new Jatek();
        jatek.Print(kliensAdat);
    }


    @Test
    public void MezoIdTest(){
        Csapdaajto uresMezo = new Csapdaajto();
        uresMezo.Fogad(1, Irany.BALRA, new Jatekos("jatekos1",new Palya(new Szerver(new Jatek(), null), null), uresMezo), new Jatekos("jatekos1",new Palya(new Szerver(new Jatek(), null), null), uresMezo));
        uresMezo.AddMez();
        uresMezo.Csuk();
        System.out.print(uresMezo.getID());
    }
}
