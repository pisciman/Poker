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
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public Mazzo() {
        int i=0;
        for (Seme seme : Seme.values())
        for (Valore valore: Valore.values())
        mazzo[i++] = new Carta(seme, valore, false);
    }

    /**
     * Stampa 52 carte da poker coperte
     * TODO: Così la stampa fa veramente schifo ed è inutile
     * Vedie issue #54
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
    public void mescola() {
        Collections.shuffle(Arrays.asList(mazzo));
    }

    /**
     * Pesca una carta
     */
    public Carta pesca(){
        if (icarte >0) {
            return mazzo[--icarte];
        }
        else
            return null;
    }
    
    public Carta[] getMazzo() {
        return mazzo;
    }
    

    public static void main (String args[]) {
        Mazzo m = new Mazzo();
        System.out.println(m.toString());
    }

}