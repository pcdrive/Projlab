package sokoban;

public class UresMezo {

	private UresMezo szomszed[];
	protected Leptetheto leptetheto;
	
	
	public boolean Fogad(JeloltDoboz jd, Jatekos j) {
		System.out.println("UresMezo"+'\t'+"Fogad(JeloltDoboz, Jatekos)");
		boolean success=this.Fogad((Doboz)jd, j);
		System.out.println(success);
		return success;
	}
	
	public boolean Fogad(Jatekos j) {
		System.out.println("UresMezo"+'\t'+"Fogad(Jatekos)");
		if(leptetheto==null) {
			return true;
		}
		boolean success=leptetheto.Tol(Irany.Balra, j);
		System.out.println(success);
		return success;
	}
	
	public boolean Fogad(Doboz d, Jatekos j) {
		System.out.println("UresMezo"+'\t'+"Fogad(Doboz, Jatekos)");
		if(leptetheto==null) {
			System.out.println(true);
			return true;
		}
		boolean success=leptetheto.Utkozik(Irany.Balra, j);
		System.out.println(success);
		return success;
	}
	
	public void Enged(Leptetheto l) {
		System.out.println("UresMezo"+'\t'+"Enged(Leptetheto)");
	}
	
	public UresMezo GetSzomszed(Irany i) {
		System.out.println("UresMezo"+'\t'+"GetSzomszed(Irany)");
		return szomszed[i.ordinal()];
	}
	
	public void SetSzomszed(Irany i, UresMezo u) {
		System.out.println("UresMezo"+'\t'+"SetSzomszed(Irany, UresMezo)");
	}
	
	public Leptetheto getLeptetheto() {
		System.out.println("UresMezo"+'\t'+"getLeptetheto()");
		return leptetheto;
	}
	
}
