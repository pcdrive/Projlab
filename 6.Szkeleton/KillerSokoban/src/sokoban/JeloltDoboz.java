package sokoban;

public class JeloltDoboz extends Doboz {
	private boolean jel;
	
	
	public JeloltDoboz(Palya p) {
		super(p);
		jel=true;
	}
	
	public void JeletTorol() {
		System.out.println("JeloltDoboz"+'\t'+"JeletTorol()");
	}
	
	public boolean getJel() {
		System.out.println("JeloltDoboz"+'\t'+"JeletTorol()");
		System.out.println(jel);
		return jel;
	}

}
