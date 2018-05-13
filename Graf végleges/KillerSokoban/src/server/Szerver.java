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

//import tools.Printer;

public class Szerver {
	
	private Jatek jatek;
	private LinkedList<Kapcsolat> kapcsolatok;
	private Palya palya;
	private FIFO fifo;
	

	private ServerSocket socket;
	private int port;
	private PalyaAdat startadat;
	

	private Szerver This=this;
	private Thread lobby;
	private boolean run=true;	
	private String ip;


    /**
     * Az osztaly konstruktora. letrehozza a a fifo csatornat a kesobbi parancsoknak, 
     * a kapcsolatok listajat, 
     * 
     * @param j A jatek osztaly referenciaja.
     * @param p A port szama, amin a beerkezo kapcsolatokat varjuk.
     */
	public Szerver(Jatek j, String p) 
	{
		fifo = new FIFO();
		
		jatek=j;
		kapcsolatok = new LinkedList<Kapcsolat>();
		

		this.ip="127.0.0.1";
		try {
			this.port=Integer.parseInt(p);
		} catch (Exception e) 
		{
			//ha ilyen van az gaz, mert akkor hibas ip ment at az ellenorzesen. ( de nem fog =) )
    		System.out.println("Az IP nem helyes!");
		}

		try {
			
			socket = new ServerSocket();
			socket.bind(new InetSocketAddress(ip,port));

		} catch (IOException e) {
			//elviekben elofordulhat, de ez nem a mi hibank. ( nem fog =) )
    		System.out.println("A socketet nem lehet letrehozni!");
		}
	}

    /**
     * A jatekos leptetesenek folyamataban jatszik szerepet. A jatekosok kereseit
     * teszi be a parancsokat FIFO cstornababa.
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
     * @param name A szerver jatekosanak neve.
     * @param name2 A szerver m�sodik jatekosanak neve.
     */
	public void Start(String name, String name2) 
	{
		ArrayList<String> nevek = new ArrayList<String>();
		
		if(startadat.jsz != 0)
		{			
			nevek.add(name);
			if (!name2.equals(""))
				nevek.add(name2);
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

		if (lobby!=null)
			lobby.interrupt();
		
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
						// Aludni tudni kell....
					}
				}
			}
		};
		
		lobby.start();
	}

    /**
     * A szerver lobbiert felelos fuggvenye. Elinditja a lobbit, ami alatt
     * a kliensek csatlakozni tudnak.
	 *
	 * @param file	File amibol az adatokat be kell tolteni.
     */
	public void Fut(String file) 
	{
		try {
			FileInputStream fileInputStream = null;
			
			fileInputStream = new FileInputStream(file);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			startadat = (PalyaAdat) objectInputStream.readObject();

			objectInputStream.close();
			fileInputStream.close();
			
			Data.PalyaX = startadat.x;
			Data.PalyaY = startadat.y;
			System.out.println("[SZERVER]: Lehetseges jatekosok szama: " + startadat.jsz);
			lobby = new Thread(){
				public void run() {
					while (run)
					{
	    			  if(kapcsolatok.size()< startadat.jsz-jatek.jatekossz())
						try {
							Socket connection = socket.accept();

							Kapcsolat c = new Kapcsolat(This, connection);

							kapcsolatok.add(c);
							
						} catch (IOException e) {
							//System.out.println("[SERVER]: Egy uj kliens csatlakozasa sikertelen!");
						}

					}
				}
			};
			lobby.start();
			if (!run) {lobby=null;}
		} catch (IOException | ClassNotFoundException e) {
			//tobb hibalehetoseg is van. nem fordul majd elo.
			System.out.println("[SERVER]: A szerver futtatasa sikertelen!");
		}
	}

    /**
     * A jatek vegen az informaciot a palyatol a jatek fele tovabbitja, igy
     * zarva le a jatekot.
     */
	public void End() {
		run=false; 
		lobby=null;
		for (Kapcsolat kapcs : kapcsolatok)
		{
			kapcs.remKapcs();
		}
		
		try 
		{
			if (!socket.isClosed())
				socket.close();
		} catch (Exception e) {}
		
		jatek.EndGame();
	}

    /**
     * A kliensek kapcsolatanak megszakadasakor eltavolitja oket a listabol.
     * 
     * @param k A kapcsolat amit ki kell torolni a listabol.
     */
	public void RemKapcs(Kapcsolat k)
	{
		kapcsolatok.remove(k);
	}
}
