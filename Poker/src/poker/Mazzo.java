package poker;

import java.util.Arrays;
import java.util.Collections;

/**
* Regola il mazzo di carte con cui giocare
*
* @author m.santosuosso
* @author a.torricelli (Costruttore e toString)
* @author m.missiroli (main)
* @author s.nicolini
* @author m.missiroli (adattamento genera(), da testare)
*/
public class Mazzo {
    /* Mazzo da gioco */
    private final int MAX = 52;
    private Carta mazzo[] = new Carta[MAX];
    private int icarte = MAX;

    /**
     * Costruttore del Mazzo
     */
    public Mazzo() {
        genera();
        mescola();
    }
    
    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public void genera() {
        for (Seme seme : Seme.values())
        for (Valore valore: Valore.values())
        mazzo[valore.ordinal() + (13 * seme.ordinal())] = new Carta(seme, valore, true);
    }

    /**
     * Stampa 52 carte da poker coperte
     * TODO: Migliorare l'aspetto
     * @return (<code>String</code>)
     */
    @Override
    public String toString() {
        String str = "Mazzo {";

        for(Carta c : mazzo)
            str += "\n    " + c.toString();
        
        return str + "\n}";
    }

    /**
     * Funzione che mescola la carta
     */
    private void mescola() {
        Collections.shuffle(Arrays.asList(mazzo));
    }

    /**
     * Pesca una carta
     */
    public Carta pesca(){
        icarte--;
        return mazzo[icarte];
    }

    public static void main (String args[]) {
        Mazzo m = new Mazzo();
        System.out.println(m.toString());
    }
}