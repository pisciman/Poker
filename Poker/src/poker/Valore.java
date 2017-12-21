package poker;

/**
 * Contiene tutti i valori delle carte.
 * 
 * @author m.santosuosso
 */
public enum Valore {
    ASSO("A"), DUE("2"), TRE("3"), QUATTRO("4"), CINQUE("5"), SEI("6"), SETTE("7"), OTTO("8"), NOVE("9"), DIECI("10"), JACK("J"), DONNA("Q"), RE("K"); 
    
    public final String valore;
    
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
    
}
