package Test;

import Tools.Printer;
import org.junit.*;
import sokoban.*;

public class Test_1 {
    @Test
    public void Test_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> UresMezo ");
        System.out.println("  UresMezo");
        
        System.out.println("<========================== START OF TEST_1_1 ==========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }
}
