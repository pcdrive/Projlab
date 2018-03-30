package Tools.Tests;


import data.Consts;
import org.junit.Test;
import server.KliensAdat;
import sokoban.Jatek;

public class MocsiTests {
    @Test
    public void PrintTest(){
        KliensAdat kliensAdat = new KliensAdat();
        kliensAdat.palya = new int[Consts.PalyaX*Consts.PalyaY];
        for(int i = 0; i< Consts.PalyaY; i++)
            for(int j = 0; j<Consts.PalyaX; j++)
                kliensAdat.palya[i*Consts.PalyaX+j] = i;
        Jatek jatek = new Jatek();
        jatek.Print(kliensAdat);
    }
}
