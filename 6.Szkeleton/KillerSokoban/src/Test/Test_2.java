package Test;

import Tools.Printer;
import org.junit.Test;
import sokoban.*;


public class Test_2 {

    @Test
    public void Test_2_1_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_1_1 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_1_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_1_2 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_1_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_1_3 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_1_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_1_4 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_2_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_2_1 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_2_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_2_2 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_2_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_2_3 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }

    @Test
    public void Test_2_1_2_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos("jatekos1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        Jatekos leptetheto = new Jatekos("jatekos2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto, null);
        System.out.println("\n<==================== START OF TEST_2_1_2_4 ====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================== END OF TEST ==========================>");
    }
    
}