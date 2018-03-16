package sokoban;

public class Kapcsolo extends UresMezo {
	
	private Csapdaajto csapdak[];
	
	public Kapcsolo(){
		super();
	}
	
	public boolean Fogad(Jatekos j) {
		System.out.println("Kapcsolo"+'\t'+"Fogad(Jatekos)");
		boolean success=super.Fogad(j);
		
		if(success==true) {
			for(Csapdaajto c: csapdak) {
				c.Csuk();
			}
		}
		System.out.println(success);
		return success;
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("Kapcsolo"+'\t'+"Fogad(Doboz,Jatekos)");
		boolean success=super.Fogad(d, j);
		
		if(success==true) {
		for(Csapdaajto c: csapdak) {
			c.Nyit();
		}
		}
		System.out.println(success);
		return success;
	}
	
	
	
}
