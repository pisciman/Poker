/**
 * @author Torricelli Alessio
 * @author Pollarini Umberto
 */
package poker;

import java.util.Scanner;

public class Poker {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String nome;
        char sesso;
        int età, soldi;
        
        //I parametri dell'oggetto giocatore sono per semplicità
        Giocatore g = new Giocatore("Umberto", 'M', 18, 1000);
        
        //dovendo fare "l'iscrizione dell'utente" molto probabilmente useremo questo codice
        /*
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
        */
    }
}