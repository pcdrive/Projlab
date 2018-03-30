package Test;

import Tools.Printer;
import org.junit.Test;
import sokoban.*;
import sokoban.leptethetok.Doboz;
import sokoban.leptethetok.Jatekos;
import sokoban.leptethetok.JeloltDoboz;
import sokoban.mezok.*;


public class Test_7 {

    @Test
    public void Test_7_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> UresMezo");
        System.out.println("  UresMezo    UresMezo       UresMezo");
        
        System.out.println("<========================= START OF TEST_7_1_1 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_1_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Kapcsolo celmezo3 = new Kapcsolo();
        celmezo3.AddCsapda(new Csapdaajto());
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Kapcsolo");
        System.out.println("  UresMezo    UresMezo       UresMezo");
        
        System.out.println("<========================= START OF TEST_7_1_2 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_1_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Lyuk celmezo3 = new Lyuk();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Lyuk");
        System.out.println("  UresMezo    UresMezo       UresMezo");
        
        System.out.println("<========================= START OF TEST_7_1_3 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_1_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Fal celmezo3 = new Fal();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Fal");
        System.out.println("  UresMezo    UresMezo       UresMezo");
        
        System.out.println("<========================= START OF TEST_7_1_4 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_2_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        UresMezo celmezo3 = new UresMezo();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> UresMezo");
        System.out.println("  UresMezo    UresMezo       Kapcsolo");
        
        System.out.println("<========================= START OF TEST_7_2_1 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_2_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo3 = new Kapcsolo();
        celmezo3.AddCsapda(new Csapdaajto());
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Kapcsolo");
        System.out.println("  UresMezo    UresMezo       Kapcsolo");
        
        System.out.println("<========================= START OF TEST_7_2_2 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_2_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Lyuk celmezo3 = new Lyuk();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Lyuk");
        System.out.println("  UresMezo    UresMezo       Kapcsolo");
        
        System.out.println("<========================= START OF TEST_7_2_3 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }

    @Test
    public void Test_7_2_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Fal celmezo3 = new Fal();
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        celmezo3.SetSzomszed(Irany.LE, celmezo2);
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(10,null, leptetheto1, null);
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(10,null, leptetheto2, null);
        System.out.println("");
        System.out.println("<============================= DESCRIPTION =============================>");
        
        System.out.println("  Jatekos -===> Doboz -===> JeloltDoboz -===> Fal");
        System.out.println("  UresMezo    UresMezo       Kapcsolo");
        
        System.out.println("<========================= START OF TEST_7_2_4 =========================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<============================= END OF TEST =============================>");
    }



}
