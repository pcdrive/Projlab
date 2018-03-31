/*
  A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
  A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.

  @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018-02-09
 */

package server;

import data.Data;
import javafx.util.Pair;
import sokoban.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;

//import Tools.Printer;

public class Szerver {
	
	private Jatek jatek;
	private LinkedList<Kapcsolat> kapcsolatok;
	private Palya palya;
	

	private ServerSocket socket;
	private String ip;
	private Szerver This=this;
	private int port;
	private Thread lobby;
	private PalyaAdat startadat;
	
	private boolean run=true;
	
	private FIFO fifo;


    /**
     * Az osztaly konstruktora.
     * 
     * @param j A jatek osztï¿½ly referenciaja.
     */
	public Szerver(Jatek j, String p) 
	{
		fifo = new FIFO();
		
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
		fifo.push(i, nev);
	}

    /**
     * Az adatokat tovabbitja a szerver jatekosa ez a kliensek fele.
     *
     * @param k	Jatekadatok, amiket tovabbitani kell.
     */
	public void SendAdat(KliensAdat k)
	{
		jatek.Print(k);
		for (Kapcsolat aKapcsolatok : kapcsolatok) aKapcsolatok.sendAdat(k);
	}

    /**
     * A szerver jatekinditasert felelos fuggvenye. bezarja a lobbit, es elinditja a jatekot a
     * kivalasztott terkepfajl alapjan.
     * 
     * @param name A szerver játékosának neve.
     */
	public void Start(String name) 
	{
		ArrayList<String> nevek = new ArrayList<String>();
		
		if(startadat.jsz != 0)
		{			
			nevek.add(name);
		}
		for (int i=0;i<kapcsolatok.size();i++) 
		{
			kapcsolatok.get(i).sendAdat(new KliensAdat(null, null, Data.PalyaX, Data.PalyaY));
			
			while (fifo.isEmpty()) 
			{
			}
			nevek.add(fifo.pull().getValue());
		}
		
		run = false;
		palya = new Palya(this, startadat, nevek.toArray(new String[0]));
		Data.PalyaY = startadat.y;
		Data.PalyaX = startadat.x;


		lobby = new Thread(){
			public void run() {	
				while (!run)
				{
					if (!fifo.isEmpty()) 
					{
						Pair<Irany, String> pair = fifo.pull();
						palya.Leptet(pair.getKey(), pair.getValue());
					}
					
					try {
						sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		lobby.start();
	}

    /**
     * A szerver lobbiert felelos fuggvenye. Elindï¿½tja a lobbit, ami alatt
     * a kliensek csatlakozni tudnak.
	 *
	 * @param file	File amibol az adatokat be kell tolteni.
     */
	public void Fut(String file) 
	{
		try {
			FileInputStream fileInputStream = null;
			
			fileInputStream = new FileInputStream(file + ".mocsi");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			startadat = (PalyaAdat) objectInputStream.readObject();

			objectInputStream.close();
			fileInputStream.close();
			
			Data.PalyaX = startadat.x;
			Data.PalyaY = startadat.y;
			System.out.println("[SERVER]: Lehetséges játékésok száma: " + startadat.jsz);
			lobby = new Thread(){
				public void run() {
					while (run)
					{
	    			  if(kapcsolatok.size()< startadat.jsz)
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
			lobby.start();
			if (!run) {lobby=null;}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

    /**
     * A jatek vegen az informaciot a palyatol a jatek fele tovabbitja, igy
     * zarva le a jatekot.
     */
	public void End() {
		run=true; 
		lobby=null;
		for (Kapcsolat kapcs : kapcsolatok)
		{
			kapcs.remKapcs();
		}
		jatek.EndGame();
	}

    /**
     * A kliensek kapcsolatanak megszakadasakor eltavolitja oket a listabol.
     */
	public void RemKapcs(Kapcsolat k)
	{
		kapcsolatok.remove(k);
	}
}
