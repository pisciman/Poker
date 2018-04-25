package poker;

import java.util.Random;

/**
* Contiene tutti i valori delle carte.
*
* @author m.santosuosso
* @author m.missiroli (il main di prova)
*/
public enum Valore {
    ASSO("A"), DUE("2"), TRE("3"), QUATTRO("4"), CINQUE("5"), SEI("6"), SETTE("7"), OTTO("8"), NOVE("9"), DIECI("10"), JACK("J"), DONNA("Q"), RE("K"); 
    public final String valore;

    public static void main(String args[])
    {
        for (Valore i:Valore.values())
        System.out.println(i.name() + ": " + i + " Valore: "+i.getValore());
    }

    Valore (String valore){
        this.valore = valore;
    }

    /**
    * Per avere il nome completo, usare .name().
    *
    * @return il valore della carta
    */
    @Override
    public String toString() {
        return valore;
    }

    /**
    * @return il valore intero della carta
    */
    public int getValore() {
        return (this.ordinal() + 1);
    }
    /**
     * 
     * @return Restituisce un valore casuale 
     */
    public static Valore genera_Valore_Casuale() {
        return Valore.values()[new Random().nextInt(Valore.values().length)];
}
}
