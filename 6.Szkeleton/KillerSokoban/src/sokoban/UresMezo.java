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

public class UresMezo {

    protected Leptetheto leptetheto;
    private UresMezo szomszed[];
    
    protected float surlodas;
    private boolean olaj;
    private boolean mez;

    /**
     * Az osztaly konstruktora. beallítja az alapertekeket.
     */
    public UresMezo() {
        szomszed = new UresMezo[4];
        surlodas = 0.5f;
        olaj = false;
        mez = false;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i  Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param jd JeloltDoboz, ami a mezore kivan lepni
     * @param j  Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(float ero, Irany i, JeloltDoboz jd, Jatekos j) {
        Printer.PrintTabIn("UresMezo" + '\t' + "Fogad(Irany, JeloltDoboz, Jatekos)");
        if (leptetheto == null) {
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            leptetheto = jd;
            return true;
        }
        boolean success = leptetheto.Utkozik(ero, surlodas, i, j);
        if (success) {
            leptetheto = jd;
        }
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i    Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param aktj Jatekos, ami a mezore kivan lepni
     * @param j    Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(float ero, Irany i, Jatekos aktj, Jatekos j) {
        Printer.PrintTabIn("UresMezo" + '\t' + "Fogad(Irany, Jatekos, Jatekos)");
        if (leptetheto == null) {
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            leptetheto = aktj;
            return true;
        }
        boolean success = leptetheto.Tol(ero, surlodas, i, j);
        if (success) {
            leptetheto = aktj;
        }
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * A fogad fuggveny kezeli a leptetheto objektumok mezore lepeset, es a
     * mar mezon levo dolgok utkozeset. A jelen lepest vegzo jatekos nevet
     * tovabbitjuk a megtolt objektum fele, hogy a megfelelo jatekos kaphassa
     * a pontot erte.
     *
     * @param ero    az ero amivel a jatekos a sort megtolta.
     * @param i Irany amerre az esetleges mezon levo dolgot tolni kell
     * @param d Doboz, ami a mezore kivan lepni
     * @param j Jatekos, aki lepest tette.
     * @return boolean Annak az erteke, hogy a lepni kivano objektum elvegezheti-e a lepest
     */
    public boolean Fogad(float ero, Irany i, Doboz d, Jatekos j) {
        Printer.PrintTabIn("UresMezo" + '\t' + "Fogad(Irany, Doboz, Jatekos)");
        if (leptetheto == null) {
            Printer.PrintTabOut("Return: " + Boolean.toString(true));
            leptetheto = d;
            return true;
        }
        boolean success = leptetheto.Utkozik(ero, surlodas, i, j);
        if (success) {
            leptetheto = d;
        }
        Printer.PrintTabOut("Return: " + Boolean.toString(success));
        return success;
    }

    /**
     * Elengedi a leptethetot, amikor az ellep a mezorol.
     */
    public void Enged() {
        Printer.PrintTabIn("UresMezo" + '\t' + "Enged()");
        leptetheto = null;
        Printer.PrintTabOut("Return");
    }

    /**
     * Megadja a szomszedos mezot az adott iranyba.
     *
     * @param i Az irany amiben a szomszedos mezot keressuk.
     * @return UresMezo A szomszedos mezo.
     */
    public UresMezo GetSzomszed(Irany i) {
        Printer.PrintTabIn("UresMezo" + '\t' + "GetSzomszed(Irany)");
        Printer.PrintTabOut("Return: " + szomszed[i.ordinal()]);
        return szomszed[i.ordinal()];
    }

    /**
     * Beallitja a szomszedos mezot az adott iranyba.
     *
     * @param i Az irany amiben a szomszedos mezot keressuk.
     * @param u A mezo amit beallitunk.
     */
    public void SetSzomszed(Irany i, UresMezo u) {
        Printer.PrintTabIn("UresMezo" + '\t' + "SetSzomszed(Irany, UresMezo)");
        szomszed[i.ordinal()] = u;
        Printer.PrintTabOut("Return");
    }

    /**
     * Olajositja a mezot. Jobban csuszik tole.
     */
    public void setOlaj() {olaj=true; surlodas*=0.8f;}
    
    /**
     * Mezesiti a mezot. Jobban tapad tole.
     */
    public void setMez() {mez=true; surlodas*=1.2f;}

    /**
     * Olajosítva volt-e a mezo.
     * 
     * @return boolean Annak az erteke, hogy volt-e olaj a mezon.
     */
    public boolean getOlaj() {return olaj;}

    /**
     * Mezesitve volt-e a mezo.
     * 
     * @return boolean Annak az erteke, hogy volt-e mez a mezon.
     */
    public boolean getMez() {return mez;}

    /**
     * A mezo surlodasat adja vissza.
     * 
     * @return float Annak az erteke, hogy mekkora a mezo surlodasa.
     */
    public float getSurl() {return surlodas;}

}
