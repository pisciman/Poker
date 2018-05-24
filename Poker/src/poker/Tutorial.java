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
    
    Mano m=null;
    static int vittorie_di_fila=0;
    static String risposta;
    public Tutorial() {
        this.genera((Math.random() * 5));
        vittorie_di_fila = 0;
        //Refactor: Avoid instantiating String objects; this is usually unnecessary.
        //risposta = new String();
    }
    /*
    
    */
    public boolean isFinished(){
        return vittorie_di_fila==5;
    }
    /*
    * Genera casualmente una mano fra i seguenti tipi: Casuale, Poker, Full, Doppia Coppia, Scala Reale
    */
    //TODO: SPOSTARE IL RANDOM NEL MAIN. <FATTO>
    //TODO: VARIARE UN PO' LE POSSIBILI MANI (Magari il seme)perche il giocatore poi si annoia <FATTO>
    final void genera(double random){
        m = new Mano();
        Valore valoreCasuale []={Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale(),Valore.genera_Valore_Casuale()};
        Seme semeCasuale []={ Seme.generaSemeCasuale(), Seme.generaSemeCasuale(), Seme.generaSemeCasuale(), Seme.generaSemeCasuale(), Seme.generaSemeCasuale()};
        
        switch((int)random){
           
            case 0://Combinazione completamente casuale
                for (m.puntatore = 0; m.puntatore<5; m.puntatore++){
                  m.aggiungiCartaRandom();
                }
                break;
            case 1://Combinazione poker: 4 valori uguali
                m.aggiungiCarta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[2], valoreCasuale[1]);
                m.aggiungiCarta(semeCasuale[3], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[4], valoreCasuale[0]);
                break;
            case 2://Combinazione full: tris di valori + coppia di valori
                m.aggiungiCarta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[2], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[3], valoreCasuale[1]);
                m.aggiungiCarta(semeCasuale[4], valoreCasuale[1]);
                break;
            case 3://Combinazione doppia coppia: due coppie di valori uguali, seme casuale
                m.aggiungiCarta(semeCasuale[0], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[1], valoreCasuale[0]);
                m.aggiungiCarta(semeCasuale[2], valoreCasuale[2]);
                m.aggiungiCarta(semeCasuale[3], valoreCasuale[1]);
                m.aggiungiCarta(semeCasuale[4], valoreCasuale[1]);
                break;
            case 4://Combinazione scala reale: seme uguale, valori predefiniti
                m.aggiungiCarta(semeCasuale[0], Valore.ASSO);
                m.aggiungiCarta(semeCasuale[0], Valore.RE);
                m.aggiungiCarta(semeCasuale[0], Valore.DONNA);
                m.aggiungiCarta(semeCasuale[0], Valore.JACK);
                m.aggiungiCarta(semeCasuale[0], Valore.DIECI);
                break;
            default: //Refactor: Switch statements should have a default label
                System.out.println("Errore!\n");
        }
    }
    public static void main(String[] args) {
        //TODO Strutturatelo in funzioni che poi possono essere testate
        //Singolarmente
        
        Scanner sc = new Scanner(System.in);
        Tutorial t = new Tutorial();
        System.out.print("Benvenuto nel Poker della 4^B\n--_-_-_____----__-____---\n");
        while(!t.isFinished()){
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
