/**
 * @author Alessio Torricelli
 * @version 1.0
**/
package poker;

public enum Seme
{
    FIORI('♣'), CUORI('♥'), PICCHE('♠'), QUADRI('♦');
    
    private final char seme;
    
    Seme(char b)
    {
        seme = b;
    }
    
    public char getSeme()
    {
        return seme;
    }
    
    @Override
    public String toString() { return "" + seme ; }

    
    public static void main(String args[])
    {
        for (Seme i:Seme.values())
            System.out.println(i.name() + ": " + i + " Ordinale: "+i.ordinal());
    }
}