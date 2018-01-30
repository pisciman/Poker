package poker;

import java.util.Scanner;

/**
 * @author Torricelli Alessio
 * @author Pollarini Umberto
 * @author Sferruzza Matteo
 * @author D'angiolella Simone
 * @author Cavalieri Melissa
 */
public class Giocatore {
    /*
        Metodi da Creare : 
            - Inserimento nome
            - Maschio o Femmina
            - Controllo per età minima per giocare(18 anni)
            - Carte in Mano
            - Budget Disponibile
    */
    
    /* Dichiarazione Variabili */
    private String nomeGiocatore;
    private char sesso;
    private int età, soldi;
    
    /**
     * costruttore
     * @param nomeGiocatore
     * @param sesso
     * @param età
     * @param soldi 
     */
    //dubito della necessità di sapere il numero di carte in mano
    public Giocatore(String nomeGiocatore, char sesso, int età, int soldi) {
        this.nomeGiocatore = nomeGiocatore;
        this.sesso = sesso;
        this.età = età;
        this.soldi = soldi;
    }

    public Giocatore(String nomeGiocatore, char sesso, int età, int soldi) 
    {
        this.nomeGiocatore = nomeGiocatore;
        this.sesso = sesso;
        this.età = età;
        this.soldi = soldi;
    }

    // INSERIMENTO NOME GIOCATORE
    /**
     * Serve per settare il nome del giocatore
     * @param nomeGiocatore Nome Scelto
     */
    public void setNomeGiocatore(String nomeGiocatore) {
        //Qui potremmo inserire il nome direttamente dall'utente in qualche modo con
        //Scanner scan = new Scanner(System.in);
        
        this.nomeGiocatore = nomeGiocatore;
    }

    public char getSesso() {
        return sesso;
    }
    
    /**
     * Serve per settare il sesso del giocatore
     * @param sesso (Maschio o Femmina)
     */
    // INSERIMENTO SESSO GIOCATORE
    public void setSesso(char sesso) {
        //Manca controllo del sesso (uguale a quello dell'età)
        this.sesso = sesso;
    }
    
   /**
    * Serve per settare l'età del giocatore (controllo)
    * @param età 
    */
    //CONTROLLO ETA'
    public void setEtà(int età) {
        //andava abbastanza bene ma ricorda che è un set quindi è un void (per umbo)
        if(età >= 18)
            this.età = età;
        else
            this.età = 18;
    }
    /**
     * Restituisce l'età del giocatore 
     * @return età del giocatore
     */
    public int getEtà() {
        return età;
    }
    
    /**
     * gestisce i soldi
     * @param soldi 
     */
    public void setSoldi(int soldi) {
        this.soldi = soldi;
    }
    /**
     * Restituisce il numero di soldi in possesso del giocatore
     * @return i soldi
     */
    public int getSoldi() {
        return soldi;
    }

    /**
     * toString del Giocatore
     * @return Nome, Soldi e ... (<code>String</code>)
     */
    @Override
    public String toString() {
        return "Giocatore{" + "nick: " + nomeGiocatore + ", sesso: " + sesso + ", anni: " + età + ", soldi: " + soldi + '}';
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //I parametri dell'oggetto giocatore sono per semplicità
        Giocatore g = new Giocatore("Umberto", 'M', 18, 1000);

        //dovendo fare "l'iscrizione dell'utente" molto probabilmente useremo questo codice
        System.out.print("Inserisci il tuo nome: ");
        g.setNomeGiocatore(input.nextLine());

        System.out.print("Inserire il sesso ([ M ] Maschio, [ F ] Femmina): ");
        g.setSesso(input.nextLine().charAt(0));

        System.out.print("Inserisci la tua età: ");
        g.setEtà(input.nextInt());

        System.out.print("Inserisci il tuo budget totale");
        g.setSoldi(input.nextInt());
    }
}