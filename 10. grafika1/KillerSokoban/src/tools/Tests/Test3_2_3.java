package tools.Tests;
public class Test3_2_3 {}
//package tools.tests;
//
//import tools.Printer;
//import org.junit.test;
//import server.Szerver;
//import sokoban.Irany;
//import sokoban.Jatek;
//import sokoban.Palya;
//import sokoban.leptethetok.Doboz;
//import sokoban.leptethetok.Jatekos;
//import sokoban.leptethetok.JeloltDoboz;
//import sokoban.mezok.*;
//
//public class Test3_2_3 {
//    @test
//    public void Test_3_2_3_1_1_1_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_1_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_1() {
//        System.out.println("Test_3_2_3_1_1_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_2() {
//        System.out.println("Test_3_2_3_1_1_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_3() {
//        System.out.println("Test_3_2_3_1_1_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_4() {
//        System.out.println("Test_3_2_3_1_1_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_5() {
//        System.out.println("Test_3_2_3_1_1_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_6() {
//        System.out.println("Test_3_2_3_1_1_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_2_7() {
//        System.out.println("Test_3_2_3_1_1_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_3_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_1_4_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_1_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_1_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_1() {
//        System.out.println("Test_3_2_3_1_2_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_2() {
//        System.out.println("Test_3_2_3_1_2_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_3() {
//        System.out.println("Test_3_2_3_1_2_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_4() {
//        System.out.println("Test_3_2_3_1_2_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_5() {
//        System.out.println("Test_3_2_3_1_2_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_6() {
//        System.out.println("Test_3_2_3_1_2_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_2_7() {
//        System.out.println("Test_3_2_3_1_2_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_3_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_2_4_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_2_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_1_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_1() {
//        System.out.println("Test_3_2_3_1_3_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_2() {
//        System.out.println("Test_3_2_3_1_3_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_3() {
//        System.out.println("Test_3_2_3_1_3_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_4() {
//        System.out.println("Test_3_2_3_1_3_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_5() {
//        System.out.println("Test_3_2_3_1_3_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_6() {
//        System.out.println("Test_3_2_3_1_3_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_2_7() {
//        System.out.println("Test_3_2_3_1_3_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_3_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_3_4_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_3_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_1_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_1() {
//        System.out.println("Test_3_2_3_1_4_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_2() {
//        System.out.println("Test_3_2_3_1_4_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_3() {
//        System.out.println("Test_3_2_3_1_4_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_4() {
//        System.out.println("Test_3_2_3_1_4_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_5() {
//        System.out.println("Test_3_2_3_1_4_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_6() {
//        System.out.println("Test_3_2_3_1_4_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_2_7() {
//        System.out.println("Test_3_2_3_1_4_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_3_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_1() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_2() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_3() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_4() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_5() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_6() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_1_4_4_7() {
//        Printer.DisablePrint();
//        UresMezo kiindulomezo = new UresMezo();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_1_4_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_1_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_1() {
//        System.out.println("Test_3_2_3_2_1_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_2() {
//        System.out.println("Test_3_2_3_2_1_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_3() {
//        System.out.println("Test_3_2_3_2_1_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_4() {
//        System.out.println("Test_3_2_3_2_1_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_5() {
//        System.out.println("Test_3_2_3_2_1_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_6() {
//        System.out.println("Test_3_2_3_2_1_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_2_7() {
//        System.out.println("Test_3_2_3_2_1_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_3_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_1_4_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_1_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_1_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_1() {
//        System.out.println("Test_3_2_3_2_2_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_2() {
//        System.out.println("Test_3_2_3_2_2_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_3() {
//        System.out.println("Test_3_2_3_2_2_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_4() {
//        System.out.println("Test_3_2_3_2_2_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_5() {
//        System.out.println("Test_3_2_3_2_2_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_6() {
//        System.out.println("Test_3_2_3_2_2_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_2_7() {
//        System.out.println("Test_3_2_3_2_2_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_3_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_2_4_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_2_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_1_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_1() {
//        System.out.println("Test_3_2_3_2_3_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_2() {
//        System.out.println("Test_3_2_3_2_3_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_3() {
//        System.out.println("Test_3_2_3_2_3_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_4() {
//        System.out.println("Test_3_2_3_2_3_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_5() {
//        System.out.println("Test_3_2_3_2_3_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_6() {
//        System.out.println("Test_3_2_3_2_3_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_2_7() {
//        System.out.println("Test_3_2_3_2_3_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_3_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_3_4_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_3_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_1_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_1() {
//        System.out.println("Test_3_2_3_2_4_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_2() {
//        System.out.println("Test_3_2_3_2_4_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_3() {
//        System.out.println("Test_3_2_3_2_4_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_4() {
//        System.out.println("Test_3_2_3_2_4_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_5() {
//        System.out.println("Test_3_2_3_2_4_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_6() {
//        System.out.println("Test_3_2_3_2_4_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_2_7() {
//        System.out.println("Test_3_2_3_2_4_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_3_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_1() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_2() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_3() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_4() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_5() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_6() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_2_4_4_7() {
//        Printer.DisablePrint();
//        Celhely kiindulomezo = new Celhely();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_2_4_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_1_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_1() {
//        System.out.println("Test_3_2_3_3_1_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_2() {
//        System.out.println("Test_3_2_3_3_1_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_3() {
//        System.out.println("Test_3_2_3_3_1_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_4() {
//        System.out.println("Test_3_2_3_3_1_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_5() {
//        System.out.println("Test_3_2_3_3_1_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_6() {
//        System.out.println("Test_3_2_3_3_1_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_2_7() {
//        System.out.println("Test_3_2_3_3_1_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_3_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_1_4_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_1_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_1_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_1() {
//        System.out.println("Test_3_2_3_3_2_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_2() {
//        System.out.println("Test_3_2_3_3_2_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_3() {
//        System.out.println("Test_3_2_3_3_2_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_4() {
//        System.out.println("Test_3_2_3_3_2_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_5() {
//        System.out.println("Test_3_2_3_3_2_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_6() {
//        System.out.println("Test_3_2_3_3_2_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_2_7() {
//        System.out.println("Test_3_2_3_3_2_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_3_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_2_4_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_2_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_1_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_1() {
//        System.out.println("Test_3_2_3_3_3_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_2() {
//        System.out.println("Test_3_2_3_3_3_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_3() {
//        System.out.println("Test_3_2_3_3_3_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_4() {
//        System.out.println("Test_3_2_3_3_3_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_5() {
//        System.out.println("Test_3_2_3_3_3_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_6() {
//        System.out.println("Test_3_2_3_3_3_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_2_7() {
//        System.out.println("Test_3_2_3_3_3_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_3_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_3_4_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_3_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_1_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_1() {
//        System.out.println("Test_3_2_3_3_4_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_2() {
//        System.out.println("Test_3_2_3_3_4_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_3() {
//        System.out.println("Test_3_2_3_3_4_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_4() {
//        System.out.println("Test_3_2_3_3_4_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_5() {
//        System.out.println("Test_3_2_3_3_4_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_6() {
//        System.out.println("Test_3_2_3_3_4_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_2_7() {
//        System.out.println("Test_3_2_3_3_4_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_3_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_1() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_2() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_3() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_4() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_5() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_6() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_3_4_4_7() {
//        Printer.DisablePrint();
//        Csapdaajto kiindulomezo = new Csapdaajto();
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_3_4_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_1_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_1() {
//        System.out.println("Test_3_2_3_4_1_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_2() {
//        System.out.println("Test_3_2_3_4_1_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_3() {
//        System.out.println("Test_3_2_3_4_1_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_4() {
//        System.out.println("Test_3_2_3_4_1_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_5() {
//        System.out.println("Test_3_2_3_4_1_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_6() {
//        System.out.println("Test_3_2_3_4_1_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_2_7() {
//        System.out.println("Test_3_2_3_4_1_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_3_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_1_4_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        UresMezo celmezo1 = new UresMezo();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_1_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_1_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_1() {
//        System.out.println("Test_3_2_3_4_2_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_2() {
//        System.out.println("Test_3_2_3_4_2_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_3() {
//        System.out.println("Test_3_2_3_4_2_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_4() {
//        System.out.println("Test_3_2_3_4_2_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_5() {
//        System.out.println("Test_3_2_3_4_2_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_6() {
//        System.out.println("Test_3_2_3_4_2_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_2_7() {
//        System.out.println("Test_3_2_3_4_2_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_3_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_2_4_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Celhely celmezo1 = new Celhely();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_2_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_1_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_1() {
//        System.out.println("Test_3_2_3_4_3_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_2() {
//        System.out.println("Test_3_2_3_4_3_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_3() {
//        System.out.println("Test_3_2_3_4_3_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_4() {
//        System.out.println("Test_3_2_3_4_3_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_5() {
//        System.out.println("Test_3_2_3_4_3_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_6() {
//        System.out.println("Test_3_2_3_4_3_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_2_7() {
//        System.out.println("Test_3_2_3_4_3_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_3_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_3_4_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo1 = new Csapdaajto();
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_3_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_1_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        UresMezo celmezo2 = new UresMezo();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_1_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_1() {
//        System.out.println("Test_3_2_3_4_4_2_1 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_2() {
//        System.out.println("Test_3_2_3_4_4_2_2 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_3() {
//        System.out.println("Test_3_2_3_4_4_2_3 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_4() {
//        System.out.println("Test_3_2_3_4_4_2_4 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_5() {
//        System.out.println("Test_3_2_3_4_4_2_5 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_6() {
//        System.out.println("Test_3_2_3_4_4_2_6 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_2_7() {
//        System.out.println("Test_3_2_3_4_4_2_7 kihagyva, mert jelölt doboz nem kerülhet alapértelmezetten célhelyre");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_3_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo2 = new Csapdaajto();
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_3_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_1() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        UresMezo celmezo3 = new UresMezo();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_1 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_2() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Celhely celmezo3 = new Celhely();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_2 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_3() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        celmezo3.Nyit();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_3 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_4() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Csapdaajto celmezo3 = new Csapdaajto();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_4 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_5() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo3 = new Kapcsolo();
//        celmezo3.AddCsapda(new Csapdaajto());
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_5 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_6() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Lyuk celmezo3 = new Lyuk();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_6 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//
//    @test
//    public void Test_3_2_3_4_4_4_7() {
//        Printer.DisablePrint();
//        Kapcsolo kiindulomezo = new Kapcsolo();
//        kiindulomezo.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo1 = new Kapcsolo();
//        celmezo1.AddCsapda(new Csapdaajto());
//        Kapcsolo celmezo2 = new Kapcsolo();
//        celmezo2.AddCsapda(new Csapdaajto());
//        Fal celmezo3 = new Fal();
//        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
//        kiindulomezo.SetSzomszed(Irany.BALRA, null);
//        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
//        kiindulomezo.SetSzomszed(Irany.LE, null);
//        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
//        celmezo1.SetSzomszed(Irany.BALRA, null);
//        celmezo1.SetSzomszed(Irany.JOBBRA, null);
//        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
//        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
//        celmezo2.SetSzomszed(Irany.BALRA, null);
//        celmezo2.SetSzomszed(Irany.JOBBRA, null);
//        celmezo2.SetSzomszed(Irany.LE, celmezo1);
//        celmezo3.SetSzomszed(Irany.LE, celmezo2);
//        Jatekos jatekos1 = new Jatekos(null, new Palya(new Szerver(new Jatek(), null), null), kiindulomezo);
//        kiindulomezo.Fogad(10, null, jatekos1, null);
//        Doboz leptetheto1 = new Doboz(new Palya(new Szerver(new Jatek(), null), null), celmezo1);
//        celmezo1.Fogad(10, null, leptetheto1, null);
//        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Szerver(new Jatek(), null), null), celmezo2);
//        celmezo2.Fogad(10, null, leptetheto2, null);
//        System.out.println("\n<================== START OF Test_3_2_3_4_4_4_7 ==================>");
//        Printer.EnablePrint();
//        jatekos1.Lepes(Irany.FEL);
//        System.out.println("<========================== END OF TEST ==========================>");
//    }
//}