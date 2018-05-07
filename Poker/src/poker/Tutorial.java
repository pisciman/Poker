/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Scanner;

/**
 *
 * @author Matteo
 */
public class Tutorial {
    //TODO: Fare test su vittorie di fila. 
    //TODO: Fare test simulare l'input dell'utente, magari input ERRATO
    
    Mano m;
    static int vittorie_di_fila;
    static String risposta;
    public Tutorial() {
        this.genera();
        vittorie_di_fila = 0;
        risposta = new String();
    }
    /*
    * Genera casualmente una mano fra i seguenti tipi: Casuale, Poker, Full, Doppia Coppia, Scala Reale
    */
    //TODO: SPOSTARE IL RANDOM NEL MAIN. 
    //TODO: VARIARE UN PO' LE POSSIBILI MANI (Magari il seme)perche
      //il giocatore poi si annoia
    
    
    final void genera(){
        m = new Mano();
        switch((int)(Math.random() * 5)){
           
            case 0://Combinazione completamente casuale
                for (m.puntatore = 0; m.puntatore<5; m.puntatore++){
                  m.aggiungi_carta_random();
                }
                break;
            case 1://Combinazione poker
                m.aggiungi_carta(Seme.FIORI, Valore.SEI);
                m.aggiungi_carta(Seme.CUORI, Valore.SEI);
                m.aggiungi_carta(Seme.FIORI, Valore.CINQUE);
                m.aggiungi_carta(Seme.QUADRI, Valore.SEI);
                m.aggiungi_carta(Seme.QUADRI, Valore.SEI);
                break;
            case 2://Combinazione full
                m.aggiungi_carta(Seme.CUORI, Valore.SEI);
                m.aggiungi_carta(Seme.CUORI, Valore.SEI);
                m.aggiungi_carta(Seme.FIORI, Valore.CINQUE);
                m.aggiungi_carta(Seme.PICCHE, Valore.CINQUE);
                m.aggiungi_carta(Seme.QUADRI, Valore.SEI);
                break;
            case 3://Combinazione doppia coppia
                m.aggiungi_carta(Seme.CUORI, Valore.SEI);
                m.aggiungi_carta(Seme.CUORI, Valore.SEI);
                m.aggiungi_carta(Seme.FIORI, Valore.CINQUE);
                m.aggiungi_carta(Seme.PICCHE, Valore.CINQUE);
                m.aggiungi_carta(Seme.PICCHE, Valore.ASSO);
                break;
            case 4://Combinazione scala reale
                m.aggiungi_carta(Seme.PICCHE, Valore.ASSO);
                m.aggiungi_carta(Seme.PICCHE, Valore.RE);
                m.aggiungi_carta(Seme.PICCHE, Valore.DONNA);
                m.aggiungi_carta(Seme.PICCHE, Valore.JACK);
                m.aggiungi_carta(Seme.PICCHE, Valore.DIECI);
                break;
        }
    }
    public static void main(String[] args) {
        //TODO Strutturatelo in funzioni che poi possono essere testate
        //Singolarmente
        
        Scanner sc = new Scanner(System.in);
        Tutorial t = new Tutorial();
        System.out.print("Benvenuto nel Poker della 4^B\n--_-_-_____----__-____---\n");
        while(vittorie_di_fila!=5){
            t.genera();
            System.out.println("Indovina il punto della mano appena generata:");
            System.out.println(t);
            risposta = sc.nextLine();
            if(risposta.equalsIgnoreCase(
                    risposta   //Qui serve il metodo classificatore
            ))
                vittorie_di_fila++;
            else
                vittorie_di_fila=0;
        }
        System.out.println("\n\n -- Finalmente ci capiamo. --\n");
    }
    
}
