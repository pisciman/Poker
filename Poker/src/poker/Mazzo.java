package poker;

/**
 * Regola il mazzo di carte con cui giocare
 *
 * @author m.santosuosso
 * @author m.missiroli (adattamento genera(), da testare)
 */
public class Mazzo {
    /**Mazzo da gioco*/
    private Carta mazzo[] = new Carta[52];
    
    
/*--Variabili-----------------------------------------------------------------*/

    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public void genera() {
       for (Seme seme : Seme.values())
            for (Valore valore:Valore.values())
                mazzo[valore.ordinal() + (13 * seme.ordinal())] = new Carta(seme, valore, true);
    }
    
/*--Metodo genera-------------------------------------------------------------*/
}