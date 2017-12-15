package poker;

/**
 * Regola il mazzo di carte con cui giocare
 *
 * @author m.santosuosso
 */
public class Mazzo {
    /**Mazzo da gioco*/
    private Carta mazzo[] = new Carta[52];
    
    
    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public void genera() {
       for (Seme seme : Seme.values())
            for (int Valore = 0; Valore < 13; Valore++)
                mazzo[Valore + (13 * seme.ordinal())] = new Carta(seme, Valore, true);
    }

}