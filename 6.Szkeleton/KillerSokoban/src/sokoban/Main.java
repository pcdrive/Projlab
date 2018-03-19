/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018-02-09
 */


package sokoban;

import Test.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {



    /**
     * Main fuggveny, ami a jatekot futtatja.
     */
    public static void main(String[] args) {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        

        try {
	        while(!(line.equals("exit"))) {
	        	System.out.println("Melyik tesztet szeretn�d el�rni?");
	        	System.out.println("�rj \"help\"-et a lehets�ges parancsok�rt �s tesztsz�mok�rt, \"exit\"-et a kil�p�s�rt ");
	        	line=br.readLine();
	        	
	        	switch(line) {
	        	case "help" : Main.help(); break;
	        	case "all" : Main.testall(); break;
	        	case "1.1" : Test_1 t1=new Test_1(); t1.Test_1_1(); break;
	        	case "1.2" : t1=new Test_1(); t1.Test_1_2(); break;
	        	case "1.3" : t1=new Test_1(); t1.Test_1_3(); break;
	        	case "1.4" : t1=new Test_1(); t1.Test_1_4(); break;
	        	case "2.1.1.1" : Test_2 t2=new Test_2(); t2.Test_2_1_1(); break;
	        	case "2.1.1.2" : t2=new Test_2(); t2.Test_2_1_2(); break;
	        	case "2.1.1.3" : t2=new Test_2(); t2.Test_2_1_3(); break;
	        	case "2.1.1.4" : t2=new Test_2(); t2.Test_2_1_4(); break;
	        	case "2.1.2.1" : t2=new Test_2(); t2.Test_2_2_1(); break;
	        	case "2.1.2.2" : t2=new Test_2(); t2.Test_2_2_2(); break;
	        	case "2.1.2.3" : t2=new Test_2(); t2.Test_2_2_3(); break;
	        	case "2.1.2.4" : t2=new Test_2(); t2.Test_2_2_4(); break;
	        	case "3.2.1.1" : Test_3 t3=new Test_3(); t3.Test_3_1_1(); break;
	        	case "3.2.1.2" : t3=new Test_3(); t3.Test_3_1_2(); break;
	        	case "3.2.1.3" : t3=new Test_3(); t3.Test_3_1_3(); break;
	        	case "3.2.1.4" : t3=new Test_3(); t3.Test_3_1_4(); break;
	        	case "3.2.2.1" : t3=new Test_3(); t3.Test_3_2_1(); break;
	        	case "3.2.2.2" : t3=new Test_3(); t3.Test_3_2_2(); break;
	        	case "3.2.2.3" : t3=new Test_3(); t3.Test_3_2_3(); break;
	        	case "3.2.2.4" : t3=new Test_3(); t3.Test_3_2_4(); break;
	        	case "4.2.1.1" : Test_4 t4=new Test_4(); t4.Test_4_1_1(); break;
	        	case "4.2.1.2" : t4=new Test_4(); t4.Test_4_1_2(); break;
	        	case "4.2.1.3" : t4=new Test_4(); t4.Test_4_1_3(); break;
	        	case "4.2.1.4" : t4=new Test_4(); t4.Test_4_1_4(); break;
	        	case "4.2.2.1" : t4=new Test_4(); t4.Test_4_2_1(); break;
	        	case "4.2.2.2" : t4=new Test_4(); t4.Test_4_2_2(); break;
	        	case "4.2.2.3" : t4=new Test_4(); t4.Test_4_2_3(); break;
	        	case "4.2.2.4" : t4=new Test_4(); t4.Test_4_2_4(); break;
	        	case "5.1.1" : Test_5 t5=new Test_5(); t5.Test_5_1_1(); break;
	        	case "5.1.2" : t5=new Test_5(); t5.Test_5_1_2(); break;
	        	case "5.1.3" : t5=new Test_5(); t5.Test_5_1_3(); break;
	        	case "5.1.4" : t5=new Test_5(); t5.Test_5_1_4(); break;
	        	case "5.2.1" : t5=new Test_5(); t5.Test_5_2_1(); break;
	        	case "5.2.2" : t5=new Test_5(); t5.Test_5_2_2(); break;
	        	case "5.2.3" : t5=new Test_5(); t5.Test_5_2_3(); break;
	        	case "5.2.4" : t5=new Test_5(); t5.Test_5_2_4(); break;
	        	case "6.1.1" : Test_6 t6=new Test_6(); t6.Test_6_1_1(); break;
	        	case "6.1.2" : t6=new Test_6(); t6.Test_6_1_2(); break;
	        	case "6.1.3" : t6=new Test_6(); t6.Test_6_1_3(); break;
	        	case "6.1.4" : t6=new Test_6(); t6.Test_6_1_4(); break;
	        	case "6.2.1" : t6=new Test_6(); t6.Test_6_2_1(); break;
	        	case "6.2.2" : t6=new Test_6(); t6.Test_6_2_2(); break;
	        	case "6.2.3" : t6=new Test_6(); t6.Test_6_2_3(); break;
	        	case "6.2.4" : t6=new Test_6(); t6.Test_6_2_4(); break;
	        	case "7.1.1" : Test_7 t7=new Test_7(); t7.Test_7_1_1(); break;
	        	case "7.1.2" : t7=new Test_7(); t7.Test_7_1_2(); break;
	        	case "7.1.3" : t7=new Test_7(); t7.Test_7_1_3(); break;
	        	case "7.1.4" : t7=new Test_7(); t7.Test_7_1_4(); break;
	        	case "7.2.1" : t7=new Test_7(); t7.Test_7_2_1(); break;
	        	case "7.2.2" : t7=new Test_7(); t7.Test_7_2_2(); break;
	        	case "7.2.3" : t7=new Test_7(); t7.Test_7_2_3(); break;
	        	case "7.2.4" : t7=new Test_7(); t7.Test_7_2_4(); break;
	        	case "8.1" : Test_8 t8=new Test_8(); t8.TEST_8_1(); break;
	        	case "8.2" : t8=new Test_8(); t8.TEST_8_2(); break;
	        	case "8.3" : t8=new Test_8(); t8.TEST_8_3(); break;
	        	case "8.4" : t8=new Test_8(); t8.TEST_8_4(); break;
	        	case "8.5" : t8=new Test_8(); t8.TEST_8_5(); break;
	        	case "8.6" : t8=new Test_8(); t8.TEST_8_6(); break;
	        	case "8.7" : t8=new Test_8(); t8.TEST_8_7(); break;
	        	
	        	}
	        	
	        }
        }catch(IOException e) {
        	e.printStackTrace();
        }
        
        try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        
    }
    
    /**
     * Lehets�ges parancsok list�z�sa
     */
	public static void help() {
		System.out.println("exit : kil�p�s");
		System.out.println("all : minden teszt futtat�sa");
		
		System.out.println("1.1");
		System.out.println("1.2");
		System.out.println("1.3");
		System.out.println("1.4");
		System.out.println("2.1.1.1");
		System.out.println("2.1.1.2");
		System.out.println("2.1.1.3");
		System.out.println("2.1.1.4");
		System.out.println("2.1.2.1");
		System.out.println("2.1.2.2");
		System.out.println("2.1.2.3");
		System.out.println("2.1.2.4");
		System.out.println("3.2.1.1");
		System.out.println("3.2.1.2");
		System.out.println("3.2.1.3");
		System.out.println("3.2.1.4");
		System.out.println("3.2.2.1");
		System.out.println("3.2.2.2");
		System.out.println("3.2.2.3");
		System.out.println("3.2.2.4");
		System.out.println("4.2.1.1");
		System.out.println("4.2.1.2");
		System.out.println("4.2.1.3");
		System.out.println("4.2.1.4");
		System.out.println("4.2.2.1");
		System.out.println("4.2.2.2");
		System.out.println("4.2.2.3");
		System.out.println("4.2.2.4");
		System.out.println("5.1.1");
		System.out.println("5.1.2");
		System.out.println("5.1.3");
		System.out.println("5.1.4");
		System.out.println("5.2.1");
		System.out.println("5.2.2");
		System.out.println("5.2.3");
		System.out.println("5.2.4");
		System.out.println("6.1.1");
		System.out.println("6.1.2");
		System.out.println("6.1.3");
		System.out.println("6.1.4");
		System.out.println("6.2.1");
		System.out.println("6.2.2");
		System.out.println("6.2.3");
		System.out.println("6.2.4");
		System.out.println("7.1.1");
		System.out.println("7.1.2");
		System.out.println("7.1.3");
		System.out.println("7.1.4");
		System.out.println("7.2.1");
		System.out.println("7.2.2");
		System.out.println("7.2.3");
		System.out.println("7.2.4");
		System.out.println("8.1");
		System.out.println("8.2");
		System.out.println("8.3");
		System.out.println("8.4");
		System.out.println("8.5");
		System.out.println("8.6");
		System.out.println("8.7");
		
		System.out.println("exit : kil�p�s");
		System.out.println("all : minden teszt futtat�sa");
	}
	
    /**
     * Minden teszt megh�v�sa
     */
	public static void testall() {
        Test_1 t1=new Test_1(); t1.Test_1_1(); 
        t1=new Test_1(); t1.Test_1_2();
        t1=new Test_1(); t1.Test_1_3(); 
        t1=new Test_1(); t1.Test_1_4(); 
        Test_2 t2=new Test_2(); t2.Test_2_1_1();
        t2=new Test_2(); t2.Test_2_1_2();
        t2=new Test_2(); t2.Test_2_1_3();
        t2=new Test_2(); t2.Test_2_1_4();
        t2=new Test_2(); t2.Test_2_2_1();
        t2=new Test_2(); t2.Test_2_2_2();
        t2=new Test_2(); t2.Test_2_2_3();
        t2=new Test_2(); t2.Test_2_2_4();
        Test_3 t3=new Test_3(); t3.Test_3_1_1();
        t3=new Test_3(); t3.Test_3_1_2();
        t3=new Test_3(); t3.Test_3_1_3();
        t3=new Test_3(); t3.Test_3_1_4();
        t3=new Test_3(); t3.Test_3_2_1();
        t3=new Test_3(); t3.Test_3_2_2();
        t3=new Test_3(); t3.Test_3_2_3();
        t3=new Test_3(); t3.Test_3_2_4();
        Test_4 t4=new Test_4(); t4.Test_4_1_1(); 
        t4=new Test_4(); t4.Test_4_1_2(); 
        t4=new Test_4(); t4.Test_4_1_3(); 
        t4=new Test_4(); t4.Test_4_1_4(); 
        t4=new Test_4(); t4.Test_4_2_1(); 
        t4=new Test_4(); t4.Test_4_2_2(); 
        t4=new Test_4(); t4.Test_4_2_3(); 
        t4=new Test_4(); t4.Test_4_2_4(); 
        Test_5 t5=new Test_5(); t5.Test_5_1_1(); 
        t5=new Test_5(); t5.Test_5_1_2(); 
        t5=new Test_5(); t5.Test_5_1_3(); 
        t5=new Test_5(); t5.Test_5_1_4(); 
        t5=new Test_5(); t5.Test_5_2_1(); 
        t5=new Test_5(); t5.Test_5_2_2(); 
        t5=new Test_5(); t5.Test_5_2_3(); 
        t5=new Test_5(); t5.Test_5_2_4(); 
        Test_6 t6=new Test_6(); t6.Test_6_1_1(); 
        t6=new Test_6(); t6.Test_6_1_2(); 
        t6=new Test_6(); t6.Test_6_1_3(); 
        t6=new Test_6(); t6.Test_6_1_4(); 
        t6=new Test_6(); t6.Test_6_2_1(); 
        t6=new Test_6(); t6.Test_6_2_2(); 
        t6=new Test_6(); t6.Test_6_2_3(); 
        t6=new Test_6(); t6.Test_6_2_4(); 
        Test_7 t7=new Test_7(); t7.Test_7_1_1(); 
        t7=new Test_7(); t7.Test_7_1_2(); 
        t7=new Test_7(); t7.Test_7_1_3(); 
        t7=new Test_7(); t7.Test_7_1_4(); 
        t7=new Test_7(); t7.Test_7_2_1(); 
        t7=new Test_7(); t7.Test_7_2_2(); 
        t7=new Test_7(); t7.Test_7_2_3(); 
        t7=new Test_7(); t7.Test_7_2_4(); 
        Test_8 t8=new Test_8(); t8.TEST_8_1(); 
        t8=new Test_8(); t8.TEST_8_2(); 
        t8=new Test_8(); t8.TEST_8_3(); 
        t8=new Test_8(); t8.TEST_8_4(); 
        t8=new Test_8(); t8.TEST_8_5(); 
        t8=new Test_8(); t8.TEST_8_6(); 
        t8=new Test_8(); t8.TEST_8_7();
	}

}
