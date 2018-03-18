package Test;

import org.junit.Test;

import Tools.Printer;
import sokoban.Doboz;
import sokoban.Irany;
import sokoban.Jatek;
import sokoban.Jatekos;
import sokoban.JeloltDoboz;
import sokoban.Palya;
import sokoban.UresMezo;

public class Test_10 {
	
	@Test
    public void Test_3_2_3_1_1_1_1() {
		
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.BALRA, null);
        celmezo2.SetSzomszed(Irany.JOBBRA, null);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);
        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_1 ==================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
}
