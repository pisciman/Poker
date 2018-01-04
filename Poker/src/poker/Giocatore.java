package poker;

//import java.util.Scanner;

/**
 * @author Torricelli Alessio
 * @author Pollarini Umberto
 * @author Sferruzza Matteo
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
    private int età, soldi/*, nCarte*/;
    
    //dubito della necessità di sapere il numero di carte in mano
    public Giocatore(String nomeGiocatore, char sesso, int età/*, int nCarte*/, int soldi) {
        this.nomeGiocatore = nomeGiocatore;
        this.sesso = sesso;
        this.età = età;
        //this.nCarte = nCarte;
        this.soldi = soldi;
    }

    // INSERIMENTO NOME GIOCATORE
    
    public void setNomeGiocatore(String nomeGiocatore) {
        //Qui potremmo inserire il nome direttamente dall'utente in qualche modo con
        //Scanner scan = new Scanner(System.in);
        
        
        this.nomeGiocatore = nomeGiocatore;
    }
    
    // INSERIMENTO SESSO GIOCATORE
    public void setSesso(char sesso) {
        //Manca controllo del sesso (uguale a quello dell'età)
        this.sesso = sesso;
    }
    
    //CONTROLLO ETA'
    public void setEtà(int età) {
        //andava abbastanza bene ma ricorda che è un set quindi è un void (per umbo)
        if(età >= 18)
            this.età = età;
        else
            this.età = 18;
    }

    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }
}