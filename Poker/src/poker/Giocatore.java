package poker;

//import java.util.Scanner;

import java.util.Scanner;

/**
 * @author Torricelli Alessio Alessio9284
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

    public String toString() {
        //TODO: Da fare
       return "";
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String nome;
        char sesso;
        int età, soldi;

        //I parametri dell'oggetto giocatore sono per semplicità
        Giocatore g = new Giocatore("Umberto", 'M', 18, 1000);

        //dovendo fare "l'iscrizione dell'utente" molto probabilmente useremo questo codice

        System.out.print("Inserisci il tuo nome: ");
        nome = input.nextLine();
        g.setNomeGiocatore(nome);

        System.out.print("Inserire il sesso ([ M ] Maschio, [ F ] Femmina): ");
        sesso = input.nextLine().charAt(0);
        g.setSesso(sesso);

        System.out.print("Inserisci la tua età: ");
        età = input.nextInt();
        g.setEtà(età);

        System.out.print("Inserisci il tuo budget totale");
        soldi = input.nextInt();
        g.setSoldi(soldi);

    }
}