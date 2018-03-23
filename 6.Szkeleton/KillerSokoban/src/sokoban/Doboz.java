/**
 * A KillerSokoban egy jatek, ahol a jatekos egy raktari munkast alakit.
 * A cel, hogy minden mas jatekosnal tobb megjelolt ladat tolj a helyere.
 *
 * @author Horvath Gergo
 * @author Mocsari Andras
 * @author Zsiros Balint
 * @author Bottlik Judit
 * @author Holub Csongor
 * @version 1.0
 * @since 2018-02-09
 */


package sokoban;

import Tools.Printer;

public class Doboz extends Leptetheto {
	
	protected float tapadas=0.8f;

    /**
     * Az osztaly konstruktora. Beallitja a mezot es a palyat.
     *
     * @param p A palya.
     * @param m A mezo, amin all.
     */
    public Doboz(Palya p, UresMezo m) {
        super(p, m);
    }

    /**
     * A doboz mozgathatosagat kerdezi le.
     *
     * @return boolean Annak az erteke, hogy mozgathato-e.
     */
    public boolean Vege() {
        Printer.PrintTabIn("Doboz" + '\t' + "Vege()");
        Printer.PrintTabOut("Return: " + Boolean.toString(true));
        return true;
    }

    /**
     * megoli a dobozt, a palya megfelelo fuggvenyenek hivasaval.
     */
    @Override
    public void Halal() {
        Printer.PrintTabIn("Doboz" + '\t' + "Halal()");
        palya.Halal(this);
        Printer.PrintTabOut("Return");
    }

    /**
     * Az objektumot egy doboz tolta meg, �s az ezzel valo interakciot kezeli.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param surl	A mezo surlodasa, amin all.
     * @param i Irany amerre a dobozt tolt�k
     * @param j Jatekos, aki tol�st kezdte
     * @return boolean Annak az erteke, hogy a doboz tolhato-e.
     */
    @Override
    public boolean Utkozik(float ero, float surl, Irany i, Jatekos j) {
    	
        Printer.PrintTabIn("Doboz" + '\t' + "Utkozik(float, float, Irany, Jatekos)");
        
    	if (ero>surl+tapadas*mezo.getSurl()) {
    		
	        boolean success = mezo.GetSzomszed(i).Fogad(ero, surl, i, this, j);
	        
	        if (success)
	            mezo.Enged();
	        
	        Printer.PrintTabOut("Return: " + Boolean.toString(success));
	        return success;
    	}
    	
    	Printer.PrintTabOut("Return: " + Boolean.toString(false));
    	
    	return false;
    }

    /**
     * Az objektumot egy jatekos tolta meg, �s az ezzel valo interakciot kezeli.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param surl	A mezo surlodasa, amin all.
     * @param i Irany amerre a dobozt tolt�k
     * @param j Jatekos, aki tol�st kezdte
     * @return boolean Annak az erteke, hogy a doboz tolhato-e.
     */
    @Override
    public boolean Tol(float ero, float surl, Irany i, Jatekos j) {

        Printer.PrintTabIn("Doboz" + '\t' + "Tol(float, float, Irany, Jatekos)");
        
    	if (ero>surl+tapadas*mezo.getSurl()) {

	        boolean success = mezo.GetSzomszed(i).Fogad(ero, surl, i, this, j);
	        if (success)
	            mezo.Enged();
	        Printer.PrintTabOut("Return: " + Boolean.toString(success));
	        return success;
		}
		
		Printer.PrintTabOut("Return: " + Boolean.toString(false));
		
		return false;
    }

}
