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

import sokoban.Irany;
import java.io.*;
import java.net.Socket;

public class Kapcsolat {
	
	Szerver szerver;

	Socket socket;
	
	ObjectOutputStream out;
	ObjectInputStream in;
	SzerverOlvaso rdr;

    /**
     * Az osztaly konstruktora.
     * 
     * @param sz A szerver oszt�ly referenciaja.
     * @param sock A socket, amin a  kapcsolat letrejott.
     */
	public Kapcsolat(Szerver sz, Socket sock) 
	{
		szerver = sz;
		socket = sock;
		
		try {
			out = new ObjectOutputStream(socket.getOutputStream());
			out.writeObject(0);
			in = new ObjectInputStream(socket.getInputStream());
			rdr = new SzerverOlvaso(in,this);
			rdr.start();
			System.out.println("[SERVER]: Client connected!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
	}

    /**
     * A jatekos leptetesenek folyamataban jatszik szerepet. tovabbitja a jatekosok kereset,
     * a kliensek jatekosaitol.
     *
     * @param i   Irany amerre a jatekost leptetni kell
     * @param nev  A jatekos neve.
     */
	public void Leptet(Irany i, String nev) 
	{
		szerver.Leptet(i, nev);
	}

    /**
     * Az adatokat tovabbitja a kliensek fele. Csatlakozasi 
     * problema eseten kiveteti a kapcsolatot a szerver listajabol.
     *
     * @param k	Jatekadatok, amiket tovabbitani kell.
     */
	public void sendAdat(KliensAdat k) 
	{
		try {
			out.writeObject(k);
			out.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("[SERVER]: Client disconnected!");
			rdr.Kill();
			szerver.RemKapcs(this);
		}
	}

    /**
     * A kliensek kapcsolatanak megszakadasakor eltavolittatja oket a szerver listajabol.
     */
	public void remKapcs() 
	{
		rdr.Kill();
		szerver.RemKapcs(this);
	}
}
