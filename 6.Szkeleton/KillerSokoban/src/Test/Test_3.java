package Test;

import Tools.Printer;
import org.junit.Test;
import sokoban.*;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.mezok.*;


public class Test_3 {
    @Test
    public void Test_3_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> UresMezo");
        System.out.println("  UresMezo     UresMezo");
        
        System.out.println("<======================== START OF TEST_3_1_1 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_1_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Kapcsolo");
        System.out.println("  UresMezo     UresMezo");
        
        System.out.println("<======================== START OF TEST_3_1_2 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_1_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Lyuk");
        System.out.println("  UresMezo     UresMezo");
        
        System.out.println("<======================== START OF TEST_3_1_3 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_1_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Fal");
        System.out.println("  UresMezo     UresMezo");
        
        System.out.println("<======================== START OF TEST_3_1_4 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_2_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> UresMezo");
        System.out.println("  UresMezo     Kapcsolo");
        
        System.out.println("<======================== START OF TEST_3_2_1 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_2_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Kapcsolo");
        System.out.println("  UresMezo     Kapcsolo");
        
        System.out.println("<======================== START OF TEST_3_2_2 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_2_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Lyuk");
        System.out.println("  UresMezo     Kapcsolo");
        
        System.out.println("<======================== START OF TEST_3_2_3 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_3_2_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> Fal");
        System.out.println("  UresMezo     Kapcsolo");
        
        System.out.println("<======================== START OF TEST_3_2_4 ========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }
    
}
