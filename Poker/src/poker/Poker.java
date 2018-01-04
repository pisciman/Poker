package poker;
import java.util.*;

public class Poker {
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        String nome;
        char sesso;
        int età = 0;
        int soldi;
        // GRUPPO GIOCATORE
        Giocatore gioca = new Giocatore();
        System.out.println("Inserisci il tuo nome");
        nome = input.nextLine();
        gioca.setNomeGiocatore(nome); // SETTO IL NOME
        System.out.println("Inserire il sesso\n [ M ] Maschio\n[ D ] Donna");
        sesso = input.nextLine().charAt(0);
        gioca.setSesso(sesso); // SETTO IL SESSO
        System.out.println("Inserisci la tua vera età");
        do{età = input.nextInt();}while(gioca.setEtà(età) != true); // CONTROLLO ETA'
        // CARTE IN MANO?
        System.out.println("Inserisci il tuo budget totale");
        soldi = input.nextInt();
        gioca.setSoldi(soldi); // SETTO I SOLDI
        //-----------------
    }
    
}
