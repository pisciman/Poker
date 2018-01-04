package poker;

/**
 * @author Torricelli Alessio
 * @author Umberto Pollarini
 */
public class Giocatore 
{
    /*
        Metodi da Creare : 
            - Inserimento nome
            - Maschio o Femmina
            - Controllo per età minima per giocare(18 anni)
            - Carte in Mano
            - Budget Disponibile
    */
    private String nomeGiocatore;
    private char sesso;
    private int età;
    private int nCarte;
    private int soldi;

    // INSERIMENTO NOME GIOCATORE
    
    public void setNomeGiocatore(String nomeGiocatore) 
    {
        this.nomeGiocatore = nomeGiocatore;
    }
    
    // INSERIMENTO SESSO GIOCATORE
    public void setSesso(char sesso) 
    {
        this.sesso = sesso;
    }
    
    //CONTROLLO ETA'
    public boolean setEtà(int età) 
    {
        if(età < 18) return false;
        if(età >= 18) return true;
        return false;
    }

    public void setSoldi(int soldi) 
    {
        this.soldi = soldi;
    }
    
    
}
