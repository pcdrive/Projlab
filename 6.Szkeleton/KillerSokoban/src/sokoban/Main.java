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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Test.*;

public class Main {


    /**
     * Main fuggveny, ami a jatekot futtatja.
     */
    public static void main(String[] args) {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line="";
        

        try {
	        while(!(line.equals("exit"))) {
	        	System.out.println("Melyik tesztet szeretnéd elérni?");
	        	line=br.readLine();
	        	
	        	switch(line) {
	        	case "1.1" : Test_1 t1=new Test_1(); t1.Test_1_1(); break;
	        	case "2.1.1.1" : Test_2 t2=new Test_2(); t2.Test_2_1_1_1(); break;
	        	case "2.1.1.2" : t2=new Test_2(); t2.Test_2_1_1_2(); break;
	        	case "2.1.1.3" : t2=new Test_2(); t2.Test_2_1_1_3(); break;
	        	case "2.1.1.4" : t2=new Test_2(); t2.Test_2_1_1_4(); break;
	        	case "2.1.2.1" : t2=new Test_2(); t2.Test_2_1_2_1(); break;
	        	case "2.1.2.2" : t2=new Test_2(); t2.Test_2_1_2_2(); break;
	        	case "2.1.2.3" : t2=new Test_2(); t2.Test_2_1_2_3(); break;
	        	case "2.1.2.4" : t2=new Test_2(); t2.Test_2_1_2_4(); break;
	        	case "3.2.1.1" : Test_3 t3=new Test_3(); t3.Test_3_2_1_1(); break;
	        	case "3.2.1.2" : t3=new Test_3(); t3.Test_3_2_1_2(); break;
	        	case "3.2.1.3" : t3=new Test_3(); t3.Test_3_2_1_3(); break;
	        	case "3.2.1.4" : t3=new Test_3(); t3.Test_3_2_1_4(); break;
	        	case "3.2.2.1" : t3=new Test_3(); t3.Test_3_2_2_1(); break;
	        	case "3.2.2.2" : t3=new Test_3(); t3.Test_3_2_2_2(); break;
	        	case "3.2.2.3" : t3=new Test_3(); t3.Test_3_2_2_3(); break;
	        	case "3.2.2.4" : t3=new Test_3(); t3.Test_3_2_2_4(); break;
	        	case "4.2.1.1" : Test_4 t4=new Test_4(); t4.Test_4_2_1_1(); break;
	        	case "4.2.1.2" : t4=new Test_4(); t4.Test_4_2_1_2(); break;
	        	case "4.2.1.3" : t4=new Test_4(); t4.Test_4_2_1_3(); break;
	        	case "4.2.1.4" : t4=new Test_4(); t4.Test_4_2_1_4(); break;
	        	case "4.2.2.1" : t4=new Test_4(); t4.Test_4_2_2_1(); break;
	        	case "4.2.2.2" : t4=new Test_4(); t4.Test_4_2_2_2(); break;
	        	case "4.2.2.3" : t4=new Test_4(); t4.Test_4_2_2_3(); break;
	        	case "4.2.2.4" : t4=new Test_4(); t4.Test_4_2_2_4(); break;
	        	case "5.1.1" : Test_5 t5=new Test_5(); t5.Test_5_1_1(); break;
	        	case "5.1.2" : t5=new Test_5(); t5.Test_5_1_2(); break;
	        	case "5.1.3" : t5=new Test_5(); t5.Test_5_1_3(); break;
	        	case "5.1.4" : t5=new Test_5(); t5.Test_5_1_4(); break;
	        	case "5.2.1" : t5=new Test_5(); t5.Test_5_2_1(); break;
	        	case "5.2.2" : t5=new Test_5(); t5.Test_5_2_2(); break;
	        	case "5.2.3" : t5=new Test_5(); t5.Test_5_2_3(); break;
	        	
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

}
