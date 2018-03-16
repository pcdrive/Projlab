package sokoban;

public class Celhely extends UresMezo {
	
	private boolean jel;
	
	public Celhely(){
		super();
		jel=true;
	}
	
	
	public boolean Fogad(JeloltDoboz jd, Jatekos j) {
		System.out.println("Celhely"+'\t'+"Fogad(JeloltDoboz,Jatekos)");
		boolean success=super.Fogad(jd, j);
		if(jel==false || jd.getJel()==false) {
			return success;
		}
		
		if(success==true) {		
		jd.JeletTorol();
		j.PontotKap();
		}
		System.out.println(success);
		return success;
	}
	
	public boolean Fogad(Jatekos j) {
		System.out.println("Celhely"+ '\t'+ "Fogad(Jatekos)");
		boolean success=super.Fogad(j);
		System.out.println(success);
		return success;
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("Celhely"+ '\t'+ "Fogad(Doboz,Jatekos)");
		boolean success=super.Fogad(d,j);
		System.out.println(success);
		return success;
	}
	
}
