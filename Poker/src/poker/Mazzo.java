package poker;

/**
 * Regola il mazzo di carte con cui giocare
 *
 * @author m.santosuosso
 * @author a.torricelli
 * @author m.missiroli (main) 
 */
public class Mazzo {
    /**Mazzo da gioco*/
    private final int MAX = 52;
    private Carta mazzo[] = new Carta[MAX];
    
    
    /**
     * Genera in modo ordinato il mazzo di 52 carte da poker coperte
     */
    public void genera() {
       for (Seme seme : Seme.values())
            for (int Valore = 0; Valore < 13; Valore++)
                mazzo[Valore + (13 * seme.ordinal())] = new Carta(seme, Valore, true);
    }
    
    public String toString()
    {
        String str = "";
        
        for(Carta c : mazzo) str += "\n    " + c;
        
        return "Mazzo\n{" + str + "\n}";
    }
    
    /**
     * Metodo mescola Mazzo
     * AMPIAMENTE RIFATTORIZZABILE
     */
    public void mescola()
    {
        Carta scambio;
        int[] pos = {0, 0};
        /* Ripetizione Scambio di pos da 100 a 1000 */
        int rip = (int) (Math.random() * 901 + 100);
        
        for(int i = 0; i < rip; i++)
        {
            pos[0] = (int) (Math.random() * MAX);
            pos[1] = (int) (Math.random() * MAX);
            
            scambio = mazzo[pos[0]];
            mazzo[pos[0]] = mazzo[pos[1]];
            mazzo[pos[1]] = scambio;
        }
    }

    // DA COME SI VEDE, QUESTO ANCORA NON FUNZIONA.
    public static void main (String args[]) {
        Mazzo m = new Mazzo();
        System.out.println(m);
    }
    
    }