package poker;

/**
 * Si usa l'ordine dei semi italiano (che non è quello inglese)
 * @author piffy
 */
public enum Seme {
    FIORI("♣"),QUADRI("♦"),CUORI("♥"),PICCHE("♠");
    
    public final String simbolo;
    

    Seme(String s){
        simbolo=s;
    };
    
/**
 * Resistuisce il simbolo del seme. 
 * Per avere il nome completo, usare .name()
 */
    @Override
    public String toString() {
    return simbolo;}
}


