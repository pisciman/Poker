/**
 * @author Alessio Torricelli
 * @version 1.0
 * @since 07-12-2017
**/
package poker;

public class Mazzo
{
    private final int MAX1 = 52;
    /*private final int MAX2 = 13;*/
    private Object[] mazzo;
    
    public static void main(String[] args)
    {
        Mazzo m = new Mazzo();
        
        System.out.println(m.toString());
    }
    
    public Mazzo()
    {
        for(int i = 0; i < MAX1; i++)
        {
            mazzo[i] = new Carta(i, false);
        }
    }
    /*
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
        String a = new String();
        
        for(int o = 0; o < 52; o++)
        {
            a += " " + mazzo[o];
        }
        return "Mazzo{" + "mazzo=" + a + '}';
    }*/
}