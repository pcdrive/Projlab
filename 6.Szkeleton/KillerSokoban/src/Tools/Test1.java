package Tools;

import org.junit.Test;
import sokoban.*;
public class Test1{
    @Test
    public void Test_1_1_1(){
        System.out.println("<===================== START OF TEST_1_1_1 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_2(){
        System.out.println("<===================== START OF TEST_1_1_2 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_3(){
        System.out.println("<===================== START OF TEST_1_1_3 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_4(){
        System.out.println("<===================== START OF TEST_1_1_4 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_5(){
        System.out.println("<===================== START OF TEST_1_1_5 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_6(){
        System.out.println("<===================== START OF TEST_1_1_6 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_1_7(){
        System.out.println("<===================== START OF TEST_1_1_7 =====================>");
        UresMezo kiindulomezo = new UresMezo();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_1(){
        System.out.println("<===================== START OF TEST_1_2_1 =====================>");
        Celhely kiindulomezo = new Celhely();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_2(){
        System.out.println("<===================== START OF TEST_1_2_2 =====================>");
        Celhely kiindulomezo = new Celhely();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_3(){
        System.out.println("<===================== START OF TEST_1_2_3 =====================>");
        Celhely kiindulomezo = new Celhely();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_4(){
        System.out.println("<===================== START OF TEST_1_2_4 =====================>");
        Celhely kiindulomezo = new Celhely();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_5(){
        System.out.println("<===================== START OF TEST_1_2_5 =====================>");
        Celhely kiindulomezo = new Celhely();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_6(){
        System.out.println("<===================== START OF TEST_1_2_6 =====================>");
        Celhely kiindulomezo = new Celhely();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_2_7(){
        System.out.println("<===================== START OF TEST_1_2_7 =====================>");
        Celhely kiindulomezo = new Celhely();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_1(){
        System.out.println("<===================== START OF TEST_1_3_1 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_2(){
        System.out.println("<===================== START OF TEST_1_3_2 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_3(){
        System.out.println("<===================== START OF TEST_1_3_3 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_4(){
        System.out.println("<===================== START OF TEST_1_3_4 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_5(){
        System.out.println("<===================== START OF TEST_1_3_5 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_6(){
        System.out.println("<===================== START OF TEST_1_3_6 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_3_7(){
        System.out.println("<===================== START OF TEST_1_3_7 =====================>");
        Csapdaajto kiindulomezo = new Csapdaajto();
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_1(){
        System.out.println("<===================== START OF TEST_1_4_1 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        UresMezo celmezo = new UresMezo();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_2(){
        System.out.println("<===================== START OF TEST_1_4_2 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Celhely celmezo = new Celhely();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_3(){
        System.out.println("<===================== START OF TEST_1_4_3 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo = new Csapdaajto();
        celmezo.Nyit();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_4(){
        System.out.println("<===================== START OF TEST_1_4_4 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Csapdaajto celmezo = new Csapdaajto();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_5(){
        System.out.println("<===================== START OF TEST_1_4_5 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Kapcsolo celmezo = new Kapcsolo();
        celmezo.AddCsapda(new Csapdaajto());
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_6(){
        System.out.println("<===================== START OF TEST_1_4_6 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Lyuk celmezo = new Lyuk();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
    @Test
    public void Test_1_4_7(){
        System.out.println("<===================== START OF TEST_1_4_7 =====================>");
        Kapcsolo kiindulomezo = new Kapcsolo();
        kiindulomezo.AddCsapda(new Csapdaajto());
        Fal celmezo = new Fal();
        Jatekos jatekos1 = new Jatekos(null, new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo);
        kiindulomezo.SetSzomszed(Irany.BALRA, null);
        kiindulomezo.SetSzomszed(Irany.JOBBRA, null);
        kiindulomezo.SetSzomszed(Irany.LE, null);
        celmezo.SetSzomszed(Irany.LE, kiindulomezo);
        jatekos1.Lepes(Irany.FEL);
        System.out.println("<========================= END OF TEST =========================>");
    }
}
