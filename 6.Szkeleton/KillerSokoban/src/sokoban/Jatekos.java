package sokoban;

public class Jatekos extends Leptetheto{
	private final String nev;
	
	public Jatekos(String nev, Palya p) {
		super();
		this.nev=nev;
		palya=p;
	}
	
	public String getNev() {
		System.out.println("Jatekos"+'\t'+"getNev()");
		System.out.println(nev);
		return nev;
	}
	
	public void Lepes(Irany i) {
		System.out.println("Jatekos"+'\t'+"Lepes(Irany)");
		UresMezo celmezo=mezo.GetSzomszed(i);
		boolean success=celmezo.Fogad(this);
		
		if(success==true) {
			mezo.Enged(this);
		}
		
		palya.Vegellenorzes();
			
	}
	
	public void PontotKap() {
		System.out.println("Jatekos"+'\t'+"PontotKap()");
		palya.PontotKap(this);
	}
	
	public void Halal() {
		System.out.println("Jatekos"+'\t'+"Halal()");
		palya.Halal(this);
	}
	
	public boolean Utkozik(Irany i, Jatekos j) {
		System.out.println("Jatekos"+'\t'+"Utkozik(Irany, Jatekos)");
		for(Irany option: Irany.values()) {
			UresMezo celmezo=mezo.GetSzomszed(option);
			boolean success=celmezo.Fogad(this);
			if(success==true) {
			mezo.Enged(this);
			System.out.println(true);
			return true;
			}
		}
		
		Halal();
		System.out.println(false);
		return false;
	}
	
	public boolean Tol(Irany i, Jatekos j) {
		System.out.println("Jatekos"+'\t'+"Tol(Irany, Jatekos)");
		UresMezo celmezo=mezo.GetSzomszed(i);
		boolean success=celmezo.Fogad(this);
		if(success==true)
		mezo.Enged(this);
		System.out.println(success);
		return success;
	}
	
}
