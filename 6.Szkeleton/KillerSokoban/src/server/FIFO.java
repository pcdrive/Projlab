package server;

import java.util.LinkedList;

import javafx.util.Pair;
import sokoban.Irany;

public class FIFO {
	
	LinkedList<Pair<Irany, String>> commands; 
	
	public FIFO() 
	{
		commands = new LinkedList<Pair<Irany, String>>();
	}
	
	public void push(Irany i, String nev) {commands.add(new Pair<Irany, String>(i,nev));}
	
	public Pair<Irany, String> pull(Irany i, String nev) {return commands.removeFirst();}

}
