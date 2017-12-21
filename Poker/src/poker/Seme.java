package poker;

/**
 * Contiene tutti i semi delle carte
 * Si usa l'ordine dei semi italiano (che non è quello inglese).
 * 
 * @author piffy
 * @author m.santosuosso
 */
public enum Seme {
    FIORI("♣"),QUADRI("♦"),CUORI("♥"),PICCHE("♠");
    
    public final String seme;
    
    Seme(String seme){
        this.seme = seme;
    };
    
/**
 * Per avere il nome completo, usare .name().
 * 
 * @return simbolo del seme
 */
    @Override
    public String toString() {
        return seme;
    }
}