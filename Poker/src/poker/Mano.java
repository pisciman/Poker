package poker;

import java.util.ArrayList;

/**
 * @author sfemat aggiungi_carta & aggiungi_carta_random & puntatore
 * @author jerome
 */

public class Mano implements Comparable{

public class Mano {
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
        //    genera_mano();
        }

    /**
     * Aggiungi alla mano le carte indicate (max 5)
     * UTILE per la distribuzione, per comporre il punto con le carte sul banco ecc.
     * @param c array di carte (può essere null)
     */
    public void aggiungi(Carta c[]){
        for (int i = 0; i < c.length; i++) {
            mano[i] = c[i];
        }
    }

        /**
         *  usa il metodo mescola() della classe Mazzo per mescolare la carta
         *  e poi assegna all'array Mano i valori ottenuti con il metodo pesca() sempre della classe Mazzo
         */
        public void genera_mano(){     
            deck.mescola();
                   
            for (int i = 0; i < N_Carte ; i++){
                Carte.set(i, deck.pesca());
            } 
        }

    /**
     * Aggiungi carta (scoperta) generata casualmente alla mano
     */
        public void aggiungi_carta_random(){

            Carta k = new Carta(Seme.genera_Seme_Casuale(),Valore.genera_Valore_Casuale(),false);
            Carte.set(puntatore, k);

        }
        /**
         * Aggiungi carta (scoperta) alla mano
        * @param m Seme della carta
        * @param v Valore della carta
         */
        public void aggiungi_carta(Seme m, Valore v){
            Carta k = new Carta(m,v,false);
            Carte.set(puntatore, k);
        }

        public void sort() {
            for (int i = 0; i < mano.length; i++) {
                for (int j = i; j < mano.length; j++) {
                    if (this.mano[j].compareTo(this.mano[j+1]) == 1) {
                        Carta temp = mano[j];  //Corretto uno strano errore qui:
                        mano[j] = mano[j+1];
                        mano[j+1] = temp;
                    }
                }
            }
        }

        /*
        *   Stampa una mano di 5 carte pero scoperte quindi devi mettere che non sono coperti
        */
        //TODO ERRORE!! NON E' DETTO CHE LA MANO SIA DI 5 CARTE!!! LA MANO "deve sapere" di quante carte è formata.  <Fatto>
         @Override
        public String toString() {
            String tos = "Mano: ";
            for(int i = 0;i<this.N_Carte;i++){
                tos+=Carte.get(i);
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
            Mano m= (Mano) o;
            this.sort();
            m.sort();

            for (int i = 0; i < mano.length; i++) {
                if (this.mano[i].equals(m.mano[i]))
                    return 0;
            }

            return -1;
        }





        /*
        * Main
        */
        public static void main (String args[]) {
            Mano m = new Mano();
            m.genera_mano();     
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
        
       
 