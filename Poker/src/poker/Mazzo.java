package poker;

import java.util.Arrays;
import java.util.Collections;

/**
 * Regola il mazzo di carte con cui giocare
 *
 * @author m.santosuosso
 * @author a.torricelli
 * @author m.missiroli (main)
 * @author s.nicolini
 */
public class Mazzo {
    /**Mazzo da gioco*/
    private final int MAX = 52;
    private Carta mazzo[] = new Carta[MAX];
    private int icarte=MAX;
    
    public Mazzo() {
        genera();
        mescola();
    }  
    
    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public void genera() {
       for (Seme seme : Seme.values())
            for (int Valore = 0; Valore < 13; Valore++)
                mazzo[Valore + (13 * seme.ordinal())] = new Carta(seme, Valore, true);
    }
    
    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     * TODO: Migliorare l'aspetto
     */
    
    @Override
    public String toString() {
        String str = "";
        
        for(Carta c : mazzo) 
            str += "\n    " + c;
        
        return "Mazzo\n{" + str + "\n}";
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
    public Carta pesca() {
        icarte--;
        return mazzo[icarte];
    }

    // DA COME SI VEDE, QUESTO ANCORA NON FUNZIONA.
    public static void main (String args[]) {
        Mazzo m = new Mazzo();
        System.out.println(m);
    }
}