/**
 * @author Alessio Torricelli
 * @version 1.0
 * @since 07-12-2017
**/
package poker;

public class Carta
{
    private static final String[] simboli = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private String simbolo;
    private Seme seme;
    private boolean stato;
    
    public Carta(int i, boolean stato)
    {
        switch(i)
        {
            case 0: { this.seme = Seme.CUORI;  }
            case 12: { this.seme = Seme.FIORI;  }
            case 25: { this.seme = Seme.PICCHE; }
            case 38: { this.seme = Seme.QUADRI; }
        }
        this.simbolo = simboli[i];
        this.stato = stato;
    }

    public String getSimbolo()
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

    public void setSimbolo(String simbolo)
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
        return "Carta{" + "simbolo=" + simbolo + ", seme=" + seme + ", stato=" + stato + '}';
    }
    
    
}