/**
 * @author Alessio Torricelli
 * @version 1.0
**/
package poker;

public class Carta
{
    private final char[] simboli =
    {
        'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'
    };
    private char simbolo;
    private Seme seme;
    private boolean stato;
    
    public Carta(int sim, int sem, boolean stato)
    {
        this.simbolo = simboli[sim];
        this.seme = initSeme(sem);
        this.stato = stato;
    }
    
    private Seme initSeme(int n)
    {
        switch(n)
        {
            case 0: { return Seme.CUORI; }
            case 1: { return Seme.FIORI; }
            case 2: { return Seme.PICCHE; }
            default: { return Seme.QUADRI; }
            //case 3: { return Seme.QUADRI; }
        }
        
        //return Error();
    }

    public char getSimbolo()
    {
        return simbolo;
    }

    public Seme getSeme()
    {
        return seme;
    }

    public boolean isStato()
    {
        return stato;
    }

    public void setSimbolo(char simbolo)
    {
        this.simbolo = simbolo;
    }

    public void setSeme(Seme seme)
    {
        this.seme = seme;
    }

    public void setStato(boolean stato)
    {
        this.stato = stato;
    }
    
    @Override
    public String toString()
    {
        if(stato)
            return "Carta{Simbolo: " + simbolo + ", Seme: " + seme + ", Stato: Scoperta}";
        else
            return "Carta{Simbolo: " + simbolo + ", Seme: " + seme + ", Stato: Coperta}";
    }
}