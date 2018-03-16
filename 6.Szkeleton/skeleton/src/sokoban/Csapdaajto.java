package sokoban;

public class Csapdaajto extends UresMezo {

	private boolean nyitva;
	
	public Csapdaajto(){
		super();
	}
	
	public void Nyit() {
		System.out.println("Csapdaajto"+'\t'+"Nyit()");
	}
	
	public void Csuk() {
		System.out.println("Csapdaajto"+'\t'+"Csuk()");
	}
	
	public boolean Fogad(Jatekos j) {
		System.out.println("Csapdaajto"+'\t'+"Fogad(Jatekos)");
		if(nyitva==true) {
			j.Halal();
			System.out.println(true);
		return true;
		}else {
			boolean success=super.Fogad(j);
			System.out.println(success);
			return success;
		}
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("Csapdaajto"+'\t'+"Fogad(Doboz, Jatekos)");
		if(nyitva==true) {
			d.Halal();
			System.out.println(true);
		return true;
		}
		else {
			boolean success=super.Fogad(d, j);
			System.out.println(success);
			return success;
		}
	}
	

}
