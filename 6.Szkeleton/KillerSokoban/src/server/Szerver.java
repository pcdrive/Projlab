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

package server;

import java.net.Socket;
import java.util.LinkedList;

//import Tools.Printer;
import sokoban.*;

import java.io.IOException;
import java.net.*;

public class Szerver {
	
	Jatek jatek;
	LinkedList<Kapcsolat> kapcsolatok;
	Palya palya;
	

	ServerSocket socket;
	String ip;
	Szerver This=this;
	int port;	
	int number;	
	Thread lobby;
	KliensAdat startadat;
	
	boolean run=true;


    /**
     * Az osztaly konstruktora.
     * 
     * @param j A jatek oszt�ly referenciaja.
     */
	public Szerver(Jatek j, String p) 
	{
		jatek=j;
		kapcsolatok = new LinkedList<Kapcsolat>();
		

		this.ip="127.0.0.1";
		try {
			this.port=Integer.parseInt(p);
		} catch (Exception e) {}

		try {
			
			socket = new ServerSocket();
			socket.bind(new InetSocketAddress(ip,port));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    /**
     * A jatekos leptetesenek folyamataban jatszik szerepet. tovabbitja a jatekosok kereset,
     * a kliensek es a szerver jatekosatol.
     *
     * @param i   Irany amerre a jatekost leptetni kell
     * @param nev  A jatekos neve.
     */
	public void Leptet(Irany i, String nev) 
	{
		palya.Leptet(i, nev);
	}

    /**
     * Az adatokat tovabbitja a szerver jatekosa ez a kliensek fele.
     *
     * @param k	Jatekadatok, amiket tovabbitani kell.
     */
	public void sendAdat(KliensAdat k) 
	{
		jatek.Print(k);
		for (int i=0;i<kapcsolatok.size();i++)
			kapcsolatok.get(i).sendAdat(k);
	}

    /**
     * A szerver jatekinditasert felelos fuggvenye. bezarja a lobbit, es elinditja a jatekot a
     * kivalasztott terkepfajl alapjan.
     *
     * @param file	File amibol az adatokat be kell tolteni.
     */
	public void Start() 
	{
		run = false;
		palya = new Palya(this, startadat);
	}

    /**
     * A szerver lobbiert felelos fuggvenye. Elind�tja a lobbit, ami alatt
     * a kliensek csatlakozni tudnak.
     */
	public void Fut(String file) 
	{
		
	      startadat = cucc;//things... TODO: ide k�ne az beolvas�sos cuccos...
		
	      lobby = new Thread(){
	    	  public void run() {
	    		  
	    		  lobby.start();
	    		  
	    		  while (run) 
				  {
	    			  if(kapcsolatok.size()<= startadat.jsz)
					  try {
						  Socket connection = socket.accept();
						
					  	  Kapcsolat c = new Kapcsolat(This, connection);
						
						  kapcsolatok.add(c);
						
					  } catch (IOException e) {
						  // TODO Auto-generated catch block
					  }
					  
				  }
	          }
	      };
	      if (run=false) {lobby=null;}
	}

    /**
     * A jatek vegen az informaciot a palyatol a jatek fele tovabbitja, igy
     * zarva le a jatekot.
     */
	public void End() {jatek.EndGame();}

    /**
     * A kliensek kapcsolatanak megszakadasakor eltavolitja oket a listabol.
     */
	public void remKapcs(Kapcsolat k) 
	{
		kapcsolatok.remove(k);
	}
}
