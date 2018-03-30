package Test;

import Tools.Printer;
import org.junit.Test;
import server.Szerver;
import sokoban.Irany;
import sokoban.Jatek;
import sokoban.Palya;
import sokoban.leptethetok.Jatekos;
import sokoban.mezok.*;

public class Test_1 {
    @Test
    public void Test_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Szerver(new Jatek()), null), kiindulomezo);
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
    @Test
    public void Test_1_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Szerver(new Jatek()), null), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");

        System.out.println("  Jatekos -===> Kapcsolo ");
        System.out.println("  UresMezo");

        System.out.println("<========================== START OF TEST_1_1 ==========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_1_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Szerver(new Jatek()), null), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");

        System.out.println("  Jatekos -===> Lyuk ");
        System.out.println("  UresMezo");

        System.out.println("<========================== START OF TEST_1_1 ==========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_1_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Szerver(new Jatek()), null), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");

        System.out.println("  Jatekos -===> Fal ");
        System.out.println("  UresMezo");

        System.out.println("<========================== START OF TEST_1_1 ==========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }
}
