package Test;

import org.junit.Test;

import Tools.Printer;
import sokoban.*;

public class Test_8 {
	
	@Test
    public void TEST_8_1() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new Fal();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Jatekos leptetheto2 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto2, null);
        
        Doboz leptetheto3 = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto3, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos -> Jatekos  -> Doboz -> Fal \n");
        System.out.println("\n<================== START OF TEST_8_1 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
	
	@Test
    public void TEST_8_2() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new Celhely();
        UresMezo celmezo3 = new Fal();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        JeloltDoboz leptetheto2 = new JeloltDoboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto2, null);
        
        Jatekos leptetheto3 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto3, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos -> JeloltDoboz -> Doboz Celhelyen -> Fal \n>");
        System.out.println("\n<================== START OF TEST_8_2 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
	
	@Test
    public void TEST_8_3() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new Celhely();
        UresMezo celmezo3 = new Celhely();
        UresMezo celmezo4 = new Fal();
         
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo3.SetSzomszed(Irany.FEL, celmezo4);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Jatekos leptetheto1 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        
        Doboz leptetheto2 = new Doboz(new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);

        Jatekos leptetheto3 = new Jatekos("Jatekos_3", new Palya(new Jatek()), celmezo3);
        celmezo3.Fogad(null, leptetheto3, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos - Jatekos  - Doboz - Jatekos - Fal \n");
        System.out.println("\n<================== START OF TEST_8_3 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
	
	@Test
    public void TEST_8_4() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        UresMezo celmezo4 = new Fal();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo3.SetSzomszed(Irany.FEL, celmezo4);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        
        Jatekos leptetheto2 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);
        
        Doboz leptetheto3 = new Doboz(new Palya(new Jatek()), celmezo3);
        celmezo3.Fogad(null, leptetheto3, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos - Doboz  - Jatekos - Doboz - Fal \n");
        System.out.println("\n<================== START OF TEST_8_4 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
	
	@Test
    public void TEST_8_5() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        UresMezo celmezo4 = new Fal();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo3.SetSzomszed(Irany.FEL, celmezo4);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        
        Jatekos leptetheto2 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);
        
        Jatekos leptetheto3 = new Jatekos("Jatekos_3", new Palya(new Jatek()), celmezo3);
        celmezo3.Fogad(null, leptetheto3, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos - Doboz  - Jatekos - Jatekos - Fal \n");
        System.out.println("\n<================== START OF TEST_8_5 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }

	
	@Test
    public void TEST_8_6() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        UresMezo celmezo4 = new UresMezo();
        UresMezo celmezo5 = new Fal();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo3.SetSzomszed(Irany.FEL, celmezo4);
        celmezo4.SetSzomszed(Irany.FEL, celmezo5);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        
        Jatekos leptetheto2 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);
        
        Jatekos leptetheto3 = new Jatekos("Jatekos_3", new Palya(new Jatek()), celmezo3);
        celmezo3.Fogad(null, leptetheto3, null);
        
        Doboz leptetheto4 = new Doboz(new Palya(new Jatek()), celmezo4);
        celmezo4.Fogad(null, leptetheto4, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos - Doboz  - Jatekos - Jatekos - Doboz - Fal \n");
        System.out.println("\n<================== START OF TEST_8_6 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
	
	@Test
    public void TEST_8_7() {
		
        Printer.DisablePrint();
        
        UresMezo kiindulomezo = new UresMezo();
        UresMezo celmezo1 = new UresMezo();
        UresMezo celmezo2 = new UresMezo();
        UresMezo celmezo3 = new UresMezo();
        UresMezo celmezo4 = new UresMezo();
        UresMezo celmezo5 = new Celhely();
        
        kiindulomezo.SetSzomszed(Irany.FEL, celmezo1);
        celmezo1.SetSzomszed(Irany.FEL, celmezo2);
        celmezo2.SetSzomszed(Irany.FEL, celmezo3);
        celmezo3.SetSzomszed(Irany.FEL, celmezo4);
        celmezo4.SetSzomszed(Irany.FEL, celmezo5);
        
        Jatekos jatekos1 = new Jatekos("Jatekos_1", new Palya(new Jatek()), kiindulomezo);
        kiindulomezo.Fogad(null, jatekos1, null);
        
        Doboz leptetheto1 = new Doboz(new Palya(new Jatek()), celmezo1);
        celmezo1.Fogad(null, leptetheto1, null);
        
        Jatekos leptetheto2 = new Jatekos("Jatekos_2", new Palya(new Jatek()), celmezo2);
        celmezo2.Fogad(null, leptetheto2, null);
        
        Jatekos leptetheto3 = new Jatekos("Jatekos_3", new Palya(new Jatek()), celmezo3);
        celmezo3.Fogad(null, leptetheto3, null);
        
        JeloltDoboz leptetheto4 = new JeloltDoboz(new Palya(new Jatek()), celmezo4);
        celmezo4.Fogad(null, leptetheto4, null);

        System.out.println("<===================== DESCRIPTION ======================>");
        System.out.println("  Speciális eset: Lánctolás");
        System.out.println("  Jatekos - Doboz  - Jatekos - Jatekos - JeloltDoboz - Celhely \n");
        System.out.println("\n<================== START OF TEST_8_7 ==================>");
        
        Printer.EnablePrint();
        jatekos1.Lepes(Irany.FEL);
        
        System.out.println("<========================== END OF TEST ==========================>");
        
    }
}
