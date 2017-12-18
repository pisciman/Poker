/**
 * @author Alessio Torricelli
 * @version 1.0
**/
package poker;

public class Mazzo
{
    private final int MAX = 52;
    private final int MIN = 13;
    private Carta[] mazzo = new Carta[MAX];
    
    public static void main(String[] args)
    {
        Mazzo m = new Mazzo();
        
        System.out.println(m.toString());
        
        m.mescolaMazzo();
        
        System.out.println(m.toString());
    }
    
    public Mazzo()
    {
        /* Carte Totali, Simbolo e Seme */
        for(int[] i = {0, 0, 0}; i[0] < MAX; i[0]++, i[1]++)
        {
            if(i[1] < MIN)
            {
                mazzo[i[0]] = new Carta(i[1], i[2], false);
            }
            else
            {
                i[1] = 0; i[2]++;
                mazzo[i[0]] = new Carta(i[1], i[2], false);
            }
        }
    }
    
    public void mescolaMazzo()
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
    
    @Override
    public String toString()
    {
        String str = "";
        
        for(Carta a : mazzo) str += "\n    " + a;
        
        return "Mazzo\n{" + str + "\n}";
    }
}