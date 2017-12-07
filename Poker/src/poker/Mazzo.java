/**
 * @author Alessio Torricelli
 * @version 1.0
 * @since 07-12-2017
**/
package poker;

public class Mazzo
{
    private final int MAX1 = 52;
    private final int MAX2 = 13;
    private Carta[] mazzo;

    public Mazzo(Carta[] mazzo)
    {
        this.mazzo = mazzo;
    }
    
    public void creaMazzo()
    {
        String[] simboli = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        /* Indice del Mazzo [0], Indice dei Simboli [1], Indice del Seme [2] */
        for(int[] i = {0, 0, 0}; i[0] < MAX1; i[0]++)
        {
            mazzo[i[0]] = new Carta(simboli[i[1]], i[2], false);
            
            if(i[1] == MAX2) { i[1] = 0; i[2]++; }
        }
    }
}
