package sokoban;

public class Doboz extends Leptetheto {

	public Doboz(Palya p) {
		super();
		palya=p;
	}
	
	public boolean Vege() {
		System.out.println("Doboz"+'\t'+"Vege()");
		System.out.println(true);
		return true;
	}
	
	public void Halal() {
		System.out.println("Doboz"+'\t'+"Halal()");
		palya.Halal(this);
	}
	
	public boolean Utkozik(Irany i, Jatekos j) {
		System.out.println("Doboz"+'\t'+"Utkozik(Irany, Jatekos)");
		UresMezo celmezo=mezo.GetSzomszed(i);
		boolean success=celmezo.Fogad(this, j);
		if(success==true)
		mezo.Enged(this);
		System.out.println(success);
		return success;
	}
	
	public boolean Tol(Irany i, Jatekos j) {
		System.out.println("Doboz"+'\t'+"Tol(Irany, Jatekos)");
		UresMezo celmezo=mezo.GetSzomszed(i);
		boolean success=celmezo.Fogad(this, j);
		if(success==true)
		mezo.Enged(this);
		System.out.println(success);
		return success;
	}
	
}
