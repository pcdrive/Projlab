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

import Tools.Printer;
import data.Data;
import server.KliensAdat;
import server.KliensOlvaso;
import server.ParancsAdat;
import server.Szerver;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
// import sokoban.*;

public class Jatek {
	
	//szervermod atts
	Szerver szerver;
	KliensOlvaso kOlvaso;
	
	//kliensmod atts
	String name="";
	Socket socket;
	ObjectOutputStream out;
	ObjectInputStream in;
	int maxConnTime=5000;
	boolean fut;

    /**
     * Az osztaly konstruktora.
     */
    public Jatek() {
    }

    /**
     * Elkezdi a jatekot. Letrehozza a palyat, es annak tartalmat.
     */
    public void StartGame() {
        Printer.PrintTabIn("Jatek" + '\t' + "StartGame()");
        Printer.PrintTabOut("Return");
    }

    /**
     * Befejezi a jatekot. Torli a palyat, es annak tartalmat.
     */
    public void EndGame() {
        Printer.PrintTabIn("Jatek" + '\t' + "EndGame()");
        Printer.PrintTabOut("Return");
    }

    /**
     * A kimenetre irja a jatekadatokat.
     * 
     * @param kliensAdat	A jatekadatok, amiket ki kell irni.
     */
    public void Print(KliensAdat kliensAdat) {
        for (int i = 0; i < Data.PalyaY; i++) {
            for (int j = 0; j < Data.PalyaX; j++) {
                System.out.print(" " + String.format("%08d",kliensAdat.palya[i * Data.PalyaX + j]));
            }
            System.out.println();
        }
    }

    /**
     * A jatekot szervermodba teszi. Azaz elinditja a jatekot
     * szerverkent. Letrehozza a lobbit, felk�sz�l a csatlakozo 
     * kliensekre.
     */
    public void SzerverMod() throws IOException 
    {

        System.out.print("\n SZERVER MOD ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
    	String port = "";
        try {	        
	        System.out.print("\nPort (4 digit number): ");
	        port = br.readLine();
        } catch (Exception e) {}
    	
        System.out.print("\nFile path: ");
        String line1 = br.readLine();
        
    	szerver = new Szerver(this, port);
    	szerver.Fut(line1);

        System.out.print("\nAny input to start the game: ");
        br.readLine();
        
        szerver.Start();
    }

    /**
     * A jatekot kliensmodba teszi. Felkesz�l, es csatlakozik a szerverre.
     * @throws IOException 
     */
    public void KliensMod() 
    {        
		fut = true;
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line1="";
        String line2="";
        
        try {
	        System.out.print("\n KLIENS MOD ");
	        System.out.print("\nJatekos neve: ");
	        name = br.readLine();
	        
	        System.out.print("\nHost IP (3 digit numbers in n:n:n:n format): ");
	        line1 = br.readLine();
	        
	        System.out.print("\nPort (4 digit number): ");
	        line2 = br.readLine();
        } catch (Exception e) {}
		
		String ip = line1;
		int port=8000;
		try
		{
			port = Integer.parseInt(line2);
		} catch (Exception e) {e.printStackTrace(); return;}
		

		try {
			socket = new Socket();
			socket.connect(new InetSocketAddress(ip,port),maxConnTime);
			
			System.out.println("[Client]: Connecting to server...");
			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());
			System.out.println("[Client]: Connected to server!");

			kOlvaso = new KliensOlvaso(in, this);
			kOlvaso.start();
		} catch (IOException e) {
			//e.printStackTrace();
			return;
		}
		
		while (fut) 
		{
			try {
				String com = br.readLine();
				
				switch (com) 
				{
					case "w" : sendParancs(Irany.FEL);  break;
					case "a" : sendParancs(Irany.BALRA); break;
					case "s" : sendParancs(Irany.LE); break;
					case "d" : sendParancs(Irany.JOBBRA); break;
					case "exit" : break;
				}
			} catch (Exception e) {}
		}
    }

    /**
     * Elk�ldi a parancsokat a szervernek.
     * 
     * @param i	Irany amerre lepni akarunk.
     */
    public void sendParancs(Irany i) throws IOException 
    {
    	out.writeObject(new ParancsAdat(i, name));;
    }
}
