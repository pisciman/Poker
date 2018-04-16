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
    Mano m;

    public Tutorial() {
        m= new Mano();
    }
    
    void genera(){
        switch((int)(Math.random() * 5)){
            case 0:
                //Carte random
                //m.setMano(Math.random() ..... );
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
