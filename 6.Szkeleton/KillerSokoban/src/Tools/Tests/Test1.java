package Tools.Tests;

import Tools.Printer;
import org.junit.Test;
import server.Szerver;
import sokoban.Irany;
import sokoban.Jatek;
import sokoban.Palya;
import sokoban.leptethetok.Jatekos;
import sokoban.mezok.*;

public class Test1 {
    @Test
    public void Test_1_1_1() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1;
        jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_1 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_2() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_2 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_3() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_3 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_4() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_4 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_5() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_5 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_6() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_6 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_1_7() {
        Printer.DisablePrint();
        UresMezo kiindulomezo = new UresMezo();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_1_7 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_1() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_1 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_2() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_2 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_3() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_3 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_4() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_4 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_5() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_5 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_6() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_6 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_2_7() {
        Printer.DisablePrint();
        Celhely kiindulomezo = new Celhely();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_2_7 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_1() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_1 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_2() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_2 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_3() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_3 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_4() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_4 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_5() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_5 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_6() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_6 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_3_7() {
        Printer.DisablePrint();
        Csapdaajto kiindulomezo = new Csapdaajto();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_3_7 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_1() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_1 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_2() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_2 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_3() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_3 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_4() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_4 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_5() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_5 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_6() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_6 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_1_4_7() {
        Printer.DisablePrint();
        Kapcsolo kiindulomezo = new Kapcsolo();
        for (int i = 0; i < 5; i++) {
            kiindulomezo.AddCsapda(new Csapdaajto());
        }
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek())), kiindulomezo);
        kiindulomezo.Fogad(10,null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        System.out.println("\n<===================== START OF TEST_1_4_7 =====================>");
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
}
