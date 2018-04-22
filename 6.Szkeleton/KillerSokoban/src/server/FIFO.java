package server;

import java.util.LinkedList;

import javafx.util.Pair;
import sokoban.Irany;

public class FIFO {
	
	private LinkedList<Pair<Irany, String>> commands; 

    /**
     * Az osztaly konstruktora. Beallitja a listát.
     */
	public FIFO() 
	{
		commands = new LinkedList<Pair<Irany, String>>();
	}

    /**
     * Uj parancsot ad a megfelelo jatekos nevevel a listahoz.
     *
     * @param i	A parancs.
     * @param nev	A jatekos neve.
     */
	public void push(Irany i, String nev) {commands.add(new Pair<Irany, String>(i,nev));}

    /**
     * A lista kovetkezo elemet keri le es veszi ki a listabol.
     *
     * @return	A parancs-nev paros ami a lista legoregebb eleme.
     */
	public Pair<Irany, String> pull() {return commands.removeFirst();}

    /**
     * Lekerdezi, hogy a lista ures-e.
     *
     * @return	Ures-e vagy sem.
     */
	public boolean isEmpty() {return commands.size()==0;}

}
