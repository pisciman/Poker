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
        this.genera((Math.random() * 5));
        vittorie_di_fila = 0;
        risposta = new String();
    }
    /*
    * Genera casualmente una mano fra i seguenti tipi: Casuale, Poker, Full, Doppia Coppia, Scala Reale
    */
    //TODO: SPOSTARE IL RANDOM NEL MAIN. <FATTO>
    //TODO: VARIARE UN PO' LE POSSIBILI MANI (Magari il seme)perche <FATTO>
      //il giocatore poi si annoia
    
    
    final void genera(double random){
        m = new Mano();
        Valore valoreCasuale []={Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale()};
        Seme semeCasuale []={ Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale()};
        
        switch((int)random){
           
            case 0://Combinazione completamente casuale
                for (m.puntatore = 0; m.puntatore<5; m.puntatore++){
                  m.aggiungi_carta_random();
                }
                break;
            case 1://Combinazione poker: 4 valori uguali
                m.aggiungi_carta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[2], valoreCasuale[1]);
                m.aggiungi_carta(semeCasuale[3], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[4], valoreCasuale[0]);
                break;
            case 2://Combinazione full: tris di valori + coppia di valori
                m.aggiungi_carta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[2], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[3], valoreCasuale[1]);
                m.aggiungi_carta(semeCasuale[4], valoreCasuale[1]);
                break;
            case 3://Combinazione doppia coppia: due coppie di valori uguali, seme casuale
                m.aggiungi_carta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungi_carta(semeCasuale[2], valoreCasuale[2]);
                m.aggiungi_carta(semeCasuale[3], valoreCasuale[1]);
                m.aggiungi_carta(semeCasuale[4], valoreCasuale[1]);
                break;
            case 4://Combinazione scala reale: seme uguale, valori predefiniti
                m.aggiungi_carta(semeCasuale[0], Valore.ASSO);
                m.aggiungi_carta(semeCasuale[0], Valore.RE);
                m.aggiungi_carta(semeCasuale[0], Valore.DONNA);
                m.aggiungi_carta(semeCasuale[0], Valore.JACK);
                m.aggiungi_carta(semeCasuale[0], Valore.DIECI);
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
            t.genera((Math.random() * 5));
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
