package sokoban;

public class Pontok {

	private Pont pontok[];
	
	public void PontotKap(Jatekos j) {
		System.out.println("Pontok"+'\t'+"PontotKap(Jatekos)");
	}
	
	public Pont getPont(int i) {
		System.out.println("Pontok"+'\t'+"getPont(int)");
		System.out.println(pontok[i]);
		return pontok[i];
	}
	
	public int getHossz() {
		System.out.println("Pontok"+'\t'+"getHossz()");
		System.out.println(pontok.length);
		return pontok.length;
	}
	
}
