package Tools;

import org.junit.Test;
import sokoban.*;

public class Test2 {
    @Test
    public void Test_2_1_1_1_1() {
        System.out.println("<===================== START OF TEST_2_1_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_2() {
        System.out.println("<===================== START OF TEST_2_1_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_3() {
        System.out.println("<===================== START OF TEST_2_1_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_4() {
        System.out.println("<===================== START OF TEST_2_1_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_5() {
        System.out.println("<===================== START OF TEST_2_1_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_6() {
        System.out.println("<===================== START OF TEST_2_1_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_1_7() {
        System.out.println("<===================== START OF TEST_2_1_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_1() {
        System.out.println("<===================== START OF TEST_2_1_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_2() {
        System.out.println("<===================== START OF TEST_2_1_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_3() {
        System.out.println("<===================== START OF TEST_2_1_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_4() {
        System.out.println("<===================== START OF TEST_2_1_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_5() {
        System.out.println("<===================== START OF TEST_2_1_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_6() {
        System.out.println("<===================== START OF TEST_2_1_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_2_7() {
        System.out.println("<===================== START OF TEST_2_1_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_1() {
        System.out.println("<===================== START OF TEST_2_1_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_2() {
        System.out.println("<===================== START OF TEST_2_1_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_3() {
        System.out.println("<===================== START OF TEST_2_1_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_4() {
        System.out.println("<===================== START OF TEST_2_1_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_5() {
        System.out.println("<===================== START OF TEST_2_1_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_6() {
        System.out.println("<===================== START OF TEST_2_1_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_3_7() {
        System.out.println("<===================== START OF TEST_2_1_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_1() {
        System.out.println("<===================== START OF TEST_2_1_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_2() {
        System.out.println("<===================== START OF TEST_2_1_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_3() {
        System.out.println("<===================== START OF TEST_2_1_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_4() {
        System.out.println("<===================== START OF TEST_2_1_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_5() {
        System.out.println("<===================== START OF TEST_2_1_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_6() {
        System.out.println("<===================== START OF TEST_2_1_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_1_4_7() {
        System.out.println("<===================== START OF TEST_2_1_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_1() {
        System.out.println("<===================== START OF TEST_2_1_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_2() {
        System.out.println("<===================== START OF TEST_2_1_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_3() {
        System.out.println("<===================== START OF TEST_2_1_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_4() {
        System.out.println("<===================== START OF TEST_2_1_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_5() {
        System.out.println("<===================== START OF TEST_2_1_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_6() {
        System.out.println("<===================== START OF TEST_2_1_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_1_7() {
        System.out.println("<===================== START OF TEST_2_1_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_1() {
        System.out.println("<===================== START OF TEST_2_1_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_2() {
        System.out.println("<===================== START OF TEST_2_1_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_3() {
        System.out.println("<===================== START OF TEST_2_1_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_4() {
        System.out.println("<===================== START OF TEST_2_1_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_5() {
        System.out.println("<===================== START OF TEST_2_1_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_6() {
        System.out.println("<===================== START OF TEST_2_1_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_2_7() {
        System.out.println("<===================== START OF TEST_2_1_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_1() {
        System.out.println("<===================== START OF TEST_2_1_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_2() {
        System.out.println("<===================== START OF TEST_2_1_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_3() {
        System.out.println("<===================== START OF TEST_2_1_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_4() {
        System.out.println("<===================== START OF TEST_2_1_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_5() {
        System.out.println("<===================== START OF TEST_2_1_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_6() {
        System.out.println("<===================== START OF TEST_2_1_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_3_7() {
        System.out.println("<===================== START OF TEST_2_1_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_1() {
        System.out.println("<===================== START OF TEST_2_1_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_2() {
        System.out.println("<===================== START OF TEST_2_1_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_3() {
        System.out.println("<===================== START OF TEST_2_1_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_4() {
        System.out.println("<===================== START OF TEST_2_1_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_5() {
        System.out.println("<===================== START OF TEST_2_1_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_6() {
        System.out.println("<===================== START OF TEST_2_1_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_2_4_7() {
        System.out.println("<===================== START OF TEST_2_1_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_1() {
        System.out.println("<===================== START OF TEST_2_1_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_2() {
        System.out.println("<===================== START OF TEST_2_1_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_3() {
        System.out.println("<===================== START OF TEST_2_1_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_4() {
        System.out.println("<===================== START OF TEST_2_1_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_5() {
        System.out.println("<===================== START OF TEST_2_1_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_6() {
        System.out.println("<===================== START OF TEST_2_1_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_1_7() {
        System.out.println("<===================== START OF TEST_2_1_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_1() {
        System.out.println("<===================== START OF TEST_2_1_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_2() {
        System.out.println("<===================== START OF TEST_2_1_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_3() {
        System.out.println("<===================== START OF TEST_2_1_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_4() {
        System.out.println("<===================== START OF TEST_2_1_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_5() {
        System.out.println("<===================== START OF TEST_2_1_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_6() {
        System.out.println("<===================== START OF TEST_2_1_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_2_7() {
        System.out.println("<===================== START OF TEST_2_1_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_1() {
        System.out.println("<===================== START OF TEST_2_1_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_2() {
        System.out.println("<===================== START OF TEST_2_1_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_3() {
        System.out.println("<===================== START OF TEST_2_1_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_4() {
        System.out.println("<===================== START OF TEST_2_1_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_5() {
        System.out.println("<===================== START OF TEST_2_1_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_6() {
        System.out.println("<===================== START OF TEST_2_1_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_3_7() {
        System.out.println("<===================== START OF TEST_2_1_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_1() {
        System.out.println("<===================== START OF TEST_2_1_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_2() {
        System.out.println("<===================== START OF TEST_2_1_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_3() {
        System.out.println("<===================== START OF TEST_2_1_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_4() {
        System.out.println("<===================== START OF TEST_2_1_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_5() {
        System.out.println("<===================== START OF TEST_2_1_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_6() {
        System.out.println("<===================== START OF TEST_2_1_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_3_4_7() {
        System.out.println("<===================== START OF TEST_2_1_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_1() {
        System.out.println("<===================== START OF TEST_2_1_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_2() {
        System.out.println("<===================== START OF TEST_2_1_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_3() {
        System.out.println("<===================== START OF TEST_2_1_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_4() {
        System.out.println("<===================== START OF TEST_2_1_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_5() {
        System.out.println("<===================== START OF TEST_2_1_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_6() {
        System.out.println("<===================== START OF TEST_2_1_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_1_7() {
        System.out.println("<===================== START OF TEST_2_1_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_1() {
        System.out.println("<===================== START OF TEST_2_1_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_2() {
        System.out.println("<===================== START OF TEST_2_1_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_3() {
        System.out.println("<===================== START OF TEST_2_1_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_4() {
        System.out.println("<===================== START OF TEST_2_1_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_5() {
        System.out.println("<===================== START OF TEST_2_1_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_6() {
        System.out.println("<===================== START OF TEST_2_1_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_2_7() {
        System.out.println("<===================== START OF TEST_2_1_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_1() {
        System.out.println("<===================== START OF TEST_2_1_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_2() {
        System.out.println("<===================== START OF TEST_2_1_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_3() {
        System.out.println("<===================== START OF TEST_2_1_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_4() {
        System.out.println("<===================== START OF TEST_2_1_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_5() {
        System.out.println("<===================== START OF TEST_2_1_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_6() {
        System.out.println("<===================== START OF TEST_2_1_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_3_7() {
        System.out.println("<===================== START OF TEST_2_1_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_1() {
        System.out.println("<===================== START OF TEST_2_1_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_2() {
        System.out.println("<===================== START OF TEST_2_1_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_3() {
        System.out.println("<===================== START OF TEST_2_1_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_4() {
        System.out.println("<===================== START OF TEST_2_1_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_5() {
        System.out.println("<===================== START OF TEST_2_1_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_6() {
        System.out.println("<===================== START OF TEST_2_1_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_1_4_4_7() {
        System.out.println("<===================== START OF TEST_2_1_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Jatekos leptetheto = new Jatekos(null, new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_1() {
        System.out.println("<===================== START OF TEST_2_2_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_2() {
        System.out.println("<===================== START OF TEST_2_2_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_3() {
        System.out.println("<===================== START OF TEST_2_2_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_4() {
        System.out.println("<===================== START OF TEST_2_2_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_5() {
        System.out.println("<===================== START OF TEST_2_2_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_6() {
        System.out.println("<===================== START OF TEST_2_2_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_1_7() {
        System.out.println("<===================== START OF TEST_2_2_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_1() {
        System.out.println("<===================== START OF TEST_2_2_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_2() {
        System.out.println("<===================== START OF TEST_2_2_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_3() {
        System.out.println("<===================== START OF TEST_2_2_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_4() {
        System.out.println("<===================== START OF TEST_2_2_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_5() {
        System.out.println("<===================== START OF TEST_2_2_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_6() {
        System.out.println("<===================== START OF TEST_2_2_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_2_7() {
        System.out.println("<===================== START OF TEST_2_2_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_1() {
        System.out.println("<===================== START OF TEST_2_2_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_2() {
        System.out.println("<===================== START OF TEST_2_2_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_3() {
        System.out.println("<===================== START OF TEST_2_2_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_4() {
        System.out.println("<===================== START OF TEST_2_2_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_5() {
        System.out.println("<===================== START OF TEST_2_2_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_6() {
        System.out.println("<===================== START OF TEST_2_2_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_3_7() {
        System.out.println("<===================== START OF TEST_2_2_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_1() {
        System.out.println("<===================== START OF TEST_2_2_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_2() {
        System.out.println("<===================== START OF TEST_2_2_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_3() {
        System.out.println("<===================== START OF TEST_2_2_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_4() {
        System.out.println("<===================== START OF TEST_2_2_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_5() {
        System.out.println("<===================== START OF TEST_2_2_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_6() {
        System.out.println("<===================== START OF TEST_2_2_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_1_4_7() {
        System.out.println("<===================== START OF TEST_2_2_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_1() {
        System.out.println("<===================== START OF TEST_2_2_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_2() {
        System.out.println("<===================== START OF TEST_2_2_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_3() {
        System.out.println("<===================== START OF TEST_2_2_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_4() {
        System.out.println("<===================== START OF TEST_2_2_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_5() {
        System.out.println("<===================== START OF TEST_2_2_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_6() {
        System.out.println("<===================== START OF TEST_2_2_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_1_7() {
        System.out.println("<===================== START OF TEST_2_2_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_1() {
        System.out.println("<===================== START OF TEST_2_2_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_2() {
        System.out.println("<===================== START OF TEST_2_2_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_3() {
        System.out.println("<===================== START OF TEST_2_2_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_4() {
        System.out.println("<===================== START OF TEST_2_2_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_5() {
        System.out.println("<===================== START OF TEST_2_2_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_6() {
        System.out.println("<===================== START OF TEST_2_2_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_2_7() {
        System.out.println("<===================== START OF TEST_2_2_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_1() {
        System.out.println("<===================== START OF TEST_2_2_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_2() {
        System.out.println("<===================== START OF TEST_2_2_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_3() {
        System.out.println("<===================== START OF TEST_2_2_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_4() {
        System.out.println("<===================== START OF TEST_2_2_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_5() {
        System.out.println("<===================== START OF TEST_2_2_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_6() {
        System.out.println("<===================== START OF TEST_2_2_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_3_7() {
        System.out.println("<===================== START OF TEST_2_2_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_1() {
        System.out.println("<===================== START OF TEST_2_2_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_2() {
        System.out.println("<===================== START OF TEST_2_2_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_3() {
        System.out.println("<===================== START OF TEST_2_2_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_4() {
        System.out.println("<===================== START OF TEST_2_2_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_5() {
        System.out.println("<===================== START OF TEST_2_2_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_6() {
        System.out.println("<===================== START OF TEST_2_2_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_2_4_7() {
        System.out.println("<===================== START OF TEST_2_2_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_1() {
        System.out.println("<===================== START OF TEST_2_2_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_2() {
        System.out.println("<===================== START OF TEST_2_2_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_3() {
        System.out.println("<===================== START OF TEST_2_2_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_4() {
        System.out.println("<===================== START OF TEST_2_2_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_5() {
        System.out.println("<===================== START OF TEST_2_2_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_6() {
        System.out.println("<===================== START OF TEST_2_2_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_1_7() {
        System.out.println("<===================== START OF TEST_2_2_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_1() {
        System.out.println("<===================== START OF TEST_2_2_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_2() {
        System.out.println("<===================== START OF TEST_2_2_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_3() {
        System.out.println("<===================== START OF TEST_2_2_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_4() {
        System.out.println("<===================== START OF TEST_2_2_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_5() {
        System.out.println("<===================== START OF TEST_2_2_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_6() {
        System.out.println("<===================== START OF TEST_2_2_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_2_7() {
        System.out.println("<===================== START OF TEST_2_2_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_1() {
        System.out.println("<===================== START OF TEST_2_2_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_2() {
        System.out.println("<===================== START OF TEST_2_2_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_3() {
        System.out.println("<===================== START OF TEST_2_2_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_4() {
        System.out.println("<===================== START OF TEST_2_2_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_5() {
        System.out.println("<===================== START OF TEST_2_2_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_6() {
        System.out.println("<===================== START OF TEST_2_2_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_3_7() {
        System.out.println("<===================== START OF TEST_2_2_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_1() {
        System.out.println("<===================== START OF TEST_2_2_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_2() {
        System.out.println("<===================== START OF TEST_2_2_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_3() {
        System.out.println("<===================== START OF TEST_2_2_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_4() {
        System.out.println("<===================== START OF TEST_2_2_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_5() {
        System.out.println("<===================== START OF TEST_2_2_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_6() {
        System.out.println("<===================== START OF TEST_2_2_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_3_4_7() {
        System.out.println("<===================== START OF TEST_2_2_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_1() {
        System.out.println("<===================== START OF TEST_2_2_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_2() {
        System.out.println("<===================== START OF TEST_2_2_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_3() {
        System.out.println("<===================== START OF TEST_2_2_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_4() {
        System.out.println("<===================== START OF TEST_2_2_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_5() {
        System.out.println("<===================== START OF TEST_2_2_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_6() {
        System.out.println("<===================== START OF TEST_2_2_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_1_7() {
        System.out.println("<===================== START OF TEST_2_2_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_1() {
        System.out.println("<===================== START OF TEST_2_2_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_2() {
        System.out.println("<===================== START OF TEST_2_2_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_3() {
        System.out.println("<===================== START OF TEST_2_2_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_4() {
        System.out.println("<===================== START OF TEST_2_2_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_5() {
        System.out.println("<===================== START OF TEST_2_2_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_6() {
        System.out.println("<===================== START OF TEST_2_2_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_2_7() {
        System.out.println("<===================== START OF TEST_2_2_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_1() {
        System.out.println("<===================== START OF TEST_2_2_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_2() {
        System.out.println("<===================== START OF TEST_2_2_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_3() {
        System.out.println("<===================== START OF TEST_2_2_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_4() {
        System.out.println("<===================== START OF TEST_2_2_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_5() {
        System.out.println("<===================== START OF TEST_2_2_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_6() {
        System.out.println("<===================== START OF TEST_2_2_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_3_7() {
        System.out.println("<===================== START OF TEST_2_2_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_1() {
        System.out.println("<===================== START OF TEST_2_2_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_2() {
        System.out.println("<===================== START OF TEST_2_2_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_3() {
        System.out.println("<===================== START OF TEST_2_2_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_4() {
        System.out.println("<===================== START OF TEST_2_2_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_5() {
        System.out.println("<===================== START OF TEST_2_2_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_6() {
        System.out.println("<===================== START OF TEST_2_2_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_2_4_4_7() {
        System.out.println("<===================== START OF TEST_2_2_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        Doboz leptetheto = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_1() {
        System.out.println("<===================== START OF TEST_2_3_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_2() {
        System.out.println("<===================== START OF TEST_2_3_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_3() {
        System.out.println("<===================== START OF TEST_2_3_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_4() {
        System.out.println("<===================== START OF TEST_2_3_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_5() {
        System.out.println("<===================== START OF TEST_2_3_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_6() {
        System.out.println("<===================== START OF TEST_2_3_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_1_7() {
        System.out.println("<===================== START OF TEST_2_3_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_1() {
        System.out.println("<===================== START OF TEST_2_3_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_2() {
        System.out.println("<===================== START OF TEST_2_3_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_3() {
        System.out.println("<===================== START OF TEST_2_3_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_4() {
        System.out.println("<===================== START OF TEST_2_3_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_5() {
        System.out.println("<===================== START OF TEST_2_3_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_6() {
        System.out.println("<===================== START OF TEST_2_3_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_2_7() {
        System.out.println("<===================== START OF TEST_2_3_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_1() {
        System.out.println("<===================== START OF TEST_2_3_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_2() {
        System.out.println("<===================== START OF TEST_2_3_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_3() {
        System.out.println("<===================== START OF TEST_2_3_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_4() {
        System.out.println("<===================== START OF TEST_2_3_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_5() {
        System.out.println("<===================== START OF TEST_2_3_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_6() {
        System.out.println("<===================== START OF TEST_2_3_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_3_7() {
        System.out.println("<===================== START OF TEST_2_3_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_1() {
        System.out.println("<===================== START OF TEST_2_3_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_2() {
        System.out.println("<===================== START OF TEST_2_3_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_3() {
        System.out.println("<===================== START OF TEST_2_3_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_4() {
        System.out.println("<===================== START OF TEST_2_3_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_5() {
        System.out.println("<===================== START OF TEST_2_3_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_6() {
        System.out.println("<===================== START OF TEST_2_3_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_1_4_7() {
        System.out.println("<===================== START OF TEST_2_3_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_1() {
        System.out.println("<===================== START OF TEST_2_3_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_2() {
        System.out.println("<===================== START OF TEST_2_3_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_3() {
        System.out.println("<===================== START OF TEST_2_3_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_4() {
        System.out.println("<===================== START OF TEST_2_3_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_5() {
        System.out.println("<===================== START OF TEST_2_3_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_6() {
        System.out.println("<===================== START OF TEST_2_3_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_1_7() {
        System.out.println("<===================== START OF TEST_2_3_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_1() {
        System.out.println("<===================== START OF TEST_2_3_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_2() {
        System.out.println("<===================== START OF TEST_2_3_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_3() {
        System.out.println("<===================== START OF TEST_2_3_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_4() {
        System.out.println("<===================== START OF TEST_2_3_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_5() {
        System.out.println("<===================== START OF TEST_2_3_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_6() {
        System.out.println("<===================== START OF TEST_2_3_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_2_7() {
        System.out.println("<===================== START OF TEST_2_3_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_1() {
        System.out.println("<===================== START OF TEST_2_3_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_2() {
        System.out.println("<===================== START OF TEST_2_3_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_3() {
        System.out.println("<===================== START OF TEST_2_3_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_4() {
        System.out.println("<===================== START OF TEST_2_3_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_5() {
        System.out.println("<===================== START OF TEST_2_3_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_6() {
        System.out.println("<===================== START OF TEST_2_3_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_3_7() {
        System.out.println("<===================== START OF TEST_2_3_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_1() {
        System.out.println("<===================== START OF TEST_2_3_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_2() {
        System.out.println("<===================== START OF TEST_2_3_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_3() {
        System.out.println("<===================== START OF TEST_2_3_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_4() {
        System.out.println("<===================== START OF TEST_2_3_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_5() {
        System.out.println("<===================== START OF TEST_2_3_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_6() {
        System.out.println("<===================== START OF TEST_2_3_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_2_4_7() {
        System.out.println("<===================== START OF TEST_2_3_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo1 = new Celhely();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_1() {
        System.out.println("<===================== START OF TEST_2_3_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_2() {
        System.out.println("<===================== START OF TEST_2_3_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_3() {
        System.out.println("<===================== START OF TEST_2_3_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_4() {
        System.out.println("<===================== START OF TEST_2_3_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_5() {
        System.out.println("<===================== START OF TEST_2_3_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_6() {
        System.out.println("<===================== START OF TEST_2_3_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_1_7() {
        System.out.println("<===================== START OF TEST_2_3_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_1() {
        System.out.println("<===================== START OF TEST_2_3_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_2() {
        System.out.println("<===================== START OF TEST_2_3_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_3() {
        System.out.println("<===================== START OF TEST_2_3_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_4() {
        System.out.println("<===================== START OF TEST_2_3_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_5() {
        System.out.println("<===================== START OF TEST_2_3_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_6() {
        System.out.println("<===================== START OF TEST_2_3_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_2_7() {
        System.out.println("<===================== START OF TEST_2_3_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_1() {
        System.out.println("<===================== START OF TEST_2_3_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_2() {
        System.out.println("<===================== START OF TEST_2_3_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_3() {
        System.out.println("<===================== START OF TEST_2_3_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_4() {
        System.out.println("<===================== START OF TEST_2_3_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_5() {
        System.out.println("<===================== START OF TEST_2_3_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_6() {
        System.out.println("<===================== START OF TEST_2_3_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_3_7() {
        System.out.println("<===================== START OF TEST_2_3_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_1() {
        System.out.println("<===================== START OF TEST_2_3_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_2() {
        System.out.println("<===================== START OF TEST_2_3_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_3() {
        System.out.println("<===================== START OF TEST_2_3_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_4() {
        System.out.println("<===================== START OF TEST_2_3_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_5() {
        System.out.println("<===================== START OF TEST_2_3_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_6() {
        System.out.println("<===================== START OF TEST_2_3_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_3_4_7() {
        System.out.println("<===================== START OF TEST_2_3_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo1 = new Csapdaajto();
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_1() {
        System.out.println("<===================== START OF TEST_2_3_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_2() {
        System.out.println("<===================== START OF TEST_2_3_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_3() {
        System.out.println("<===================== START OF TEST_2_3_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_4() {
        System.out.println("<===================== START OF TEST_2_3_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_5() {
        System.out.println("<===================== START OF TEST_2_3_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_6() {
        System.out.println("<===================== START OF TEST_2_3_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_1_7() {
        System.out.println("<===================== START OF TEST_2_3_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_1() {
        System.out.println("<===================== START OF TEST_2_3_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_2() {
        System.out.println("<===================== START OF TEST_2_3_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_3() {
        System.out.println("<===================== START OF TEST_2_3_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_4() {
        System.out.println("<===================== START OF TEST_2_3_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_5() {
        System.out.println("<===================== START OF TEST_2_3_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_6() {
        System.out.println("<===================== START OF TEST_2_3_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_2_7() {
        System.out.println("<===================== START OF TEST_2_3_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_1() {
        System.out.println("<===================== START OF TEST_2_3_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_2() {
        System.out.println("<===================== START OF TEST_2_3_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_3() {
        System.out.println("<===================== START OF TEST_2_3_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_4() {
        System.out.println("<===================== START OF TEST_2_3_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_5() {
        System.out.println("<===================== START OF TEST_2_3_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_6() {
        System.out.println("<===================== START OF TEST_2_3_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_3_7() {
        System.out.println("<===================== START OF TEST_2_3_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_1() {
        System.out.println("<===================== START OF TEST_2_3_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        UresMezo celmezo2 = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_2() {
        System.out.println("<===================== START OF TEST_2_3_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Celhely celmezo2 = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_3() {
        System.out.println("<===================== START OF TEST_2_3_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        celmezo2.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_4() {
        System.out.println("<===================== START OF TEST_2_3_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo2 = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_5() {
        System.out.println("<===================== START OF TEST_2_3_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo2 = new Kapcsolo();
        celmezo2.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_6() {
        System.out.println("<===================== START OF TEST_2_3_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Lyuk celmezo2 = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }

    @Test
    public void Test_2_3_4_4_7() {
        System.out.println("<===================== START OF TEST_2_3_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo1 = new Kapcsolo();
        celmezo1.AddCsapda(new Csapdaajto());
        Fal celmezo2 = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo1.SetSzomszed(Irany.BALRA, null);
        celmezo1.SetSzomszed(Irany.JOBBRA, null);
        celmezo1.SetSzomszed(Irany.LE, kiindulomezo);
        celmezo2.SetSzomszed(Irany.LE, celmezo1);
        JeloltDoboz leptetheto = new JeloltDoboz(new Palya(new Jatek()), celmezo2);
        celmezo1.Fogad(null, leptetheto, null);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
}
