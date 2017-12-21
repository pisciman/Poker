
package poker;

/**
 * Si usa l'ordine dei semi italiano (che non è quello inglese)
 * @author piffy
 * @author Torricelli (il main di prova)
 */
public enum Seme {
    FIORI("♣"),QUADRI("♦"),CUORI("♥"),PICCHE("♠");
    
    public final String simbolo;
    

    Seme(String s){
        simbolo=s;
    };
    
/**
 * Resituisce il simbolo del seme. 
 * Per avere il nome completo, usare .name()
 */
    @Override
    public String toString() {
    return simbolo;}

    public static void main(String args[])
    {
        for (Seme i:Seme.values())
            System.out.println(i.name() + ": " + i + " Ordinale: "+i.ordinal());
    }
    
}