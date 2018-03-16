package sokoban;


public class Palya{
	private Jatek jatek;
	private UresMezo mezok[];
	private Pontok pontok;
	private Doboz dobozok[];
	private Jatekos jatekosok[];
	
	public Palya(Jatek j) {
		jatek=j;
		pontok = new Pontok();
	}
	
	public void Leptet() {
		System.out.println("Palya"+'\t'+"Leptet()");
	}
	
	public void Halal(Jatekos j) {
		System.out.println("Palya"+'\t'+"Halal(Jatekos)");
	}
	
	public void Halal(Doboz d) {
		System.out.println("Palya"+'\t'+"Halal(Doboz)");
	}
	
	public void PontotKap(Jatekos j) {
		System.out.println("Palya"+'\t'+"PontotKap(Jatekos)");
		pontok.PontotKap(j);
	}
	
	public void Vegellenorzes() {
		System.out.println("Palya"+'\t'+"Vegellenorzes()");
		
		for(Doboz d: dobozok) {
			boolean mozgathato=d.Vege();
			if(mozgathato==true) {
				return;
			}
		}
		int hossz=pontok.getHossz();
		for(int i=0; i<hossz; i++) {
			pontok.getPont(i);
		}
		jatek.EndGame();
		return;
	}
	
}
