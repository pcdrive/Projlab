package sokoban;

public class Fal extends UresMezo {
	
	public Fal(){
		super();
	}

	public boolean Fogad(Jatekos j) {
		System.out.println("Fal"+'\t'+"Fogad(Jatekos)");
		System.out.println(false);
		return false;
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("Fal"+'\t'+"Fogad(Doboz,Jatekos)");
		System.out.println(false);
		return false;
	}
	
}
