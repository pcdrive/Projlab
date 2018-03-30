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

import java.io.ObjectInputStream;

public class SzerverOlvaso extends Thread {
	
	Kapcsolat c;
	
	boolean fut;
	ObjectInputStream in;

    /**
     * Az osztaly konstruktora.
     * 
     * @param ois A klienstol bejovo objektum folyam (ObjectInputStream).
     * @param c A kapcsolat referenciaja, amihez a folyam tartozik.
     */
	public SzerverOlvaso(ObjectInputStream ois, Kapcsolat c) 
	{
		fut=true;
		in = ois;
		this.c=c;	
	}
	
    /**
     * Az osztaly futtatando resze. A szal folyamatosan olvas a bemeneten,
     * az erkezo adatokat, pedig rogton tovabbitja a jatek fele.
     * Csatlakozasi 
     * problema eseten kiveteti a kapcsolatot a szerver listajabol.
     */
	public void run() 
	{
		while(fut) {
			try {
				Object n = in.readObject();		
				if (n!=null) 
				{
					c.Leptet(((ParancsAdat)n).i, ((ParancsAdat)n).nev);
				} 
	
			} catch (Exception e) {
				c.remKapcs();
			}		
		}
	}

    /**
     * Az osztaly futasat allitja le, ezzel veget vetve a szalnak.
     */
	public void Kill() {fut = false;}
}
