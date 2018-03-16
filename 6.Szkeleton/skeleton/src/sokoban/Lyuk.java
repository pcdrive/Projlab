package sokoban;

public class Lyuk extends UresMezo {
	
	public Lyuk() {
		super();
	}
	
	public boolean Fogad(Jatekos j) {
		System.out.println("Lyuk"+'\t'+"Fogad(Jatekos)");
		j.Halal();		
		System.out.println(true);
		return true;
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("Lyuk"+'\t'+"Fogad(Doboz,Jatekos)");
		d.Halal();
		System.out.println(true);
		return true;
	}
	
}
