package Tools.Tests;


import data.Data;
import org.junit.Test;
import server.KliensAdat;
import sokoban.Jatek;
import sokoban.mezok.UresMezo;

public class MocsiTests {
    @Test
    public void PrintTest() {
        KliensAdat kliensAdat = new KliensAdat();
        kliensAdat.palya = new int[Data.PalyaX * Data.PalyaY];
        for (int i = 0; i < Data.PalyaY; i++)
            for (int j = 0; j < Data.PalyaX; j++)
                kliensAdat.palya[i * Data.PalyaX + j] = i;
        Jatek jatek = new Jatek();
        jatek.Print(kliensAdat);
    }


    @Test
    public void MezoIdTest(){
        UresMezo uresMezo = new UresMezo();
//        uresMezo.Fogad(new Jatekos("jatekos1",new Palya(new Jatek()), uresMezo));
    }
}
