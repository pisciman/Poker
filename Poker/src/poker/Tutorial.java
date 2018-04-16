/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Matteo
 */
public class Tutorial {
    Mano m;

    public Tutorial() {
        this.genera();
    }
    
    void genera(){
        switch((int)(Math.random() * 5)){
            case 0:
                //Carte random
                
                //m.setMano(Math.random() ..... );
                Mano m = new Mano();
                for (int i=0;i<5;i++){
                    m.costruisci_mano_scoperta(
                            Seme semi[] = 
                            { 
                                Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale(),Seme.genera_Seme_Casuale(), Seme.genera_Seme_Casuale()
                            }, 
                            Valore valori[] = 
                            {
                                Valore.genera_Seme_Casuale(), Valore.genera_Seme_Casuale(), Valore.genera_Seme_Casuale(), Valore.genera_Seme_Casuale(), Valore.genera_Seme_Casuale()
                            });
                    
                }
                
                break;
            case 1:
                //Combinazione poker
                break;
            case 2:
                //Combinazione full
                break;
            case 3:
                //Combinazione doppia coppia
                break;
            case 4:
                //Combinazione scala reale
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tutorial t = new Tutorial();
        System.out.print("Benvenuto nel Poker della 4^B\n--_-_-_____----__-____---\n");
        t.genera();
        System.out.println("Indovina la mano appena generata:");
        //Compare mani
        System.out.println(t);
    }
    
}
