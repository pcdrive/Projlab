package sokoban;

public class Pont {

	private final String nev;
	private int pont;
	
	public Pont(String nev, int pont) {
		this.nev=nev;
		this.pont=pont;
	}

	public String getNev() {
		System.out.println("Pont"+'\t'+"getNev()");
		System.out.println(nev);
		return nev;
	}

	public int getPont() {
		System.out.println("Pont"+'\t'+"getPont()");
		System.out.println(pont);
		return pont;
	}
	
}
