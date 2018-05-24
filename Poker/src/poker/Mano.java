package poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author sfemat aggiungiCarta & aggiungiCartaRandom & puntatore
 * @author jerome
 */

public class Mano implements Comparable{

      //TODO: TOGLIERE ASSOLUTAMENTE MAZZO <Fatto>
      //TODO: Forse -> Listaarray <Fatto>

       private int N_Carte = 5;
       private ArrayList<Carta> Carte = new ArrayList<Carta>();
       public int puntatore; //Puntatore alla carta attualmente utilizzata, utilizzabile da altre classi
       //TODO: puntatore dovrebbe essere responsabilità di mazzo.
       //TODO: FORSE PUO' Aver senso fare la sottoclasse ManoNonCasuale
       // e mettere qui la generazione della mano per il tutorial
       
        /**
         * costruttore
        */
        public void Mano(){  
        //    generaMano();
        }

    /**
     * Aggiungi alla mano le carte indicate (max 5)
     * UTILE per la distribuzione, per comporre il punto con le carte sul banco ecc.
     * @param c array di carte (può essere null)
     */
    public void aggiungi(Carta c[]){
        for (int i = 0; i < c.length; i++) {
            Carte.add(c[i]);
        }
    }

        /**
         *  usa il metodo mescola() della classe Mazzo per mescolare la carta
         *  e poi assegna all'array Mano i valori ottenuti con il metodo pesca() sempre della classe Mazzo
         *  REFACTOR: Method names should not contain underscores
         */
        public void generaMano(){
            Mazzo deck= new Mazzo();
            deck.mescola();
                   
            for (int i = 0; i < N_Carte ; i++){
                Carte.set(i, deck.pesca());
            } 
        }

    /**
     * Aggiungi carta (scoperta) generata casualmente alla mano
     * REFACTOR: Method names should not contain underscores
     */
        public void aggiungiCartaRandom(){

            Carta k = new Carta(Seme.generaSemeCasuale(),Valore.genera_Valore_Casuale(),false);
            Carte.set(puntatore, k);

        }
        /**
         * Aggiungi carta (scoperta) alla mano
        * @param m Seme della carta
        * @param v Valore della carta
         */
        public void aggiungiCarta(Seme m, Valore v){
            Carta k = new Carta(m,v,false);
            Carte.set(puntatore, k);
        }
        /*
        *   Stampa una mano di 5 carte pero scoperte quindi devi mettere che non sono coperti
        */
         @Override
        public String toString() {
            String tos = "Mano: ";
            for(int i = 0;i<this.N_Carte;i++){
                tos+=Carte.get(i)+" ";
            }
            return tos;
        }

        /**
          * Metodo per confrontare due mani (anche con lo stesso punto)
          * @param o
          * @return 0/1/-1
        */
        @Override
        public int compareTo(Object o) {
            //TODO QUESTA FUNZIONE NON FUNZIONA!!!
            Mano m= (Mano) o;
            Collections.sort(this.Carte);//era this.sort();
            Collections.sort(m.Carte); // era m.sort();

            return 0;
        }





        /*
        * Main
        */
        public static void main (String args[]) {
            Mano m = new Mano();
            m.generaMano();
            System.out.println(m);
        }


    /**
     * Metodo che confronta solo se il punto è uguale.
     * @param m Una mano
     * @return 0/-1/1
     */
    public int comparePunto(Mano m) {
            return 0;
    }

}
        
       
 