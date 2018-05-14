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

import data.Data;
import sokoban.Jatek;

public class KliensOlvaso extends Thread {
	
	Jatek j;
	
	boolean fut;
	ObjectInputStream in;

    /**
     * Az osztaly konstruktora.
     * 
     * @param ois A szervertol bejovo objektum folyam (ObjectInputStream).
     * @param j A jatek referenciaja.
     */
	public KliensOlvaso(ObjectInputStream ois, Jatek j) 
	{
		fut=true;
		in = ois;
		this.j=j;	
	}

    /**
     * Az osztaly futtatando resze. A szal folyamatosan olvas a bemeneten,
     * az erkezo adatokat, pedig rogton tovabbitja a jatek fele. Halozati
     * problema eseten bezarja a kapcsolatot es leallitja az olvasot.
     */
	public void run() 
	{
		try {
			in.readObject();
			j.sendParancs(null);
		} catch (Exception e1) {
			j.KliensDC();
			fut=false;
		}
		
		while(fut) {
			try {
				Object n = in.readObject();		
				if (n!=null && (KliensAdat)n != null) 
				{
					if (((KliensAdat)n).x!=0 && ((KliensAdat)n).y!=0) 
					{
						Data.PalyaX = ((KliensAdat)n).x;
						Data.PalyaY = ((KliensAdat)n).y;
						j.Print((KliensAdat)n);
					}
				} 
	
			} catch (Exception e) {
				e.printStackTrace();
				j.KliensDC();
				fut=false;
			}		
		}
	}

    /**
     * Az osztaly futasat allitja le, ezzel veget vetve a szalnak.
     */
	public void Kill() {
		fut = false;
		this. interrupt();
	}
	
}
