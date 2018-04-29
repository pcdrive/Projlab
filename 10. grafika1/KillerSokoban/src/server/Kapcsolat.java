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
     * @param sz A szerver osztaly referenciaja.
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
			System.out.println("[SERVER]: A kapcsolat a klienssel letrejott!");
		} catch (IOException e) {
			System.out.println("[SERVER]: A kapcsolatot nem sikerult letrehozni!");
			if (rdr!=null)
				rdr.Kill();
			sz.RemKapcs(this);
		}
	}

    /**
     * A jatekos leptetesenek folyamataban jatszik szerepet. tovabbitja a jatekosok kereset, 
     * a kliensek jatekosaitol.
     *
     * @param i   Parancs amit a jatekos vegrehajtani szeretne.
     * @param nev  A jatekos neve.
     */
	public void Leptet(Irany i, String nev) 
	{
		szerver.Leptet(i, nev);
	}

    /**
     * Az adatokat tovabbitja a kliensek fele. Csatlakozasi 
     * problema eseten kiveteti a kapcsolatot a szerver listajabol, 
     * és leallitja az olvasot..
     *
     * @param k	Jatekadatok, amiket tovabbitani kell.
     */
	public void sendAdat(KliensAdat k) 
	{
		try {
			out.writeObject(k);
			out.flush();
		} catch (Exception e) {
			System.out.println("[SERVER]: Megszakadt a kapcsolat a klienssel!");
			if (rdr!=null)
				rdr.Kill();
			szerver.RemKapcs(this);
		}
	}

    /**
     * A kliensek kapcsolatanak megszakadasakor eltavolittatja oket a szerver listajabol, 
     * es leallitja az olvasot.
     */
	public void remKapcs() 
	{
		rdr.Kill();
		szerver.RemKapcs(this);
	}
}
