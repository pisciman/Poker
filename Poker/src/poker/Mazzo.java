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
    
    public static void main(String[] args)
    {
        Mazzo m = new Mazzo();
        System.out.println(m.toString());
        m.creaMazzo();
        System.out.println(m.toString());
    }
    
    public void creaMazzo()
    {
        String[] simboli = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        
        /* Indice del Mazzo [0], Indice dei Simboli [1], Indice del Seme [2] */
        for(int[] i = {0, 0, 0}; i[0] < MAX1; i[0]++, i[1]++)
        {
            mazzo[i[0]] = new Carta(simboli[i[1]], i[2], false);
            
            //if(i[1] < MAX2 - 1) { i[1] = 0; i[2]++; }
        }
    }
    
    public void mescolaMazzo()
    {
        Carta scambio;
        int[] pos = {0, 0};
        
        for(int i = 0; i < 100; i++)
        {
            pos[0] = (int) (Math.random() * MAX1);
            pos[1] = (int) (Math.random() * MAX1);
            
            scambio = mazzo[pos[0]];
            mazzo[pos[0]] = mazzo[pos[1]];
            mazzo[pos[1]] = scambio;
        }
    }

    @Override
    public String toString()
    {
        return "Mazzo{" + "mazzo=" + mazzo + '}';
    }
}