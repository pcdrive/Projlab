package Tools;
import org.junit.Test;
import sokoban.*;
public class Test1{
    @Test
    public void Test_1_0_0(){
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
    }
    @Test
    public void Test_1_0_1(){
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
    }
    @Test
    public void Test_1_0_2(){
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
    }
    @Test
    public void Test_1_0_3(){
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
    }
    @Test
    public void Test_1_0_4(){
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
    }
    @Test
    public void Test_1_0_5(){
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
    }
    @Test
    public void Test_1_0_6(){
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
    }
    @Test
    public void Test_1_1_0(){
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
    }
    @Test
    public void Test_1_1_1(){
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
    }
    @Test
    public void Test_1_1_2(){
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
    }
    @Test
    public void Test_1_1_3(){
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
    }
    @Test
    public void Test_1_1_4(){
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
    }
    @Test
    public void Test_1_1_5(){
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
    }
    @Test
    public void Test_1_1_6(){
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
    }
    @Test
    public void Test_1_2_0(){
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
    }
    @Test
    public void Test_1_2_1(){
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
    }
    @Test
    public void Test_1_2_2(){
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
    }
    @Test
    public void Test_1_2_3(){
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
    }
    @Test
    public void Test_1_2_4(){
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
    }
    @Test
    public void Test_1_2_5(){
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
    }
    @Test
    public void Test_1_2_6(){
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
    }
    @Test
    public void Test_1_3_0(){
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
    }
    @Test
    public void Test_1_3_1(){
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
    }
    @Test
    public void Test_1_3_2(){
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
    }
    @Test
    public void Test_1_3_3(){
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
    }
    @Test
    public void Test_1_3_4(){
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
    }
    @Test
    public void Test_1_3_5(){
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
    }
    @Test
    public void Test_1_3_6(){
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
    }
}
