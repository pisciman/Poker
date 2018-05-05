package poker;

/**
 *
 * @author jerome
 */

public class Mano {

       private int N_Carte = 5;
       private Carta mano[] = new Carta[N_Carte];
       private Mazzo deck = new Mazzo();

       
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
         *  e poi assegna all'array mano i valori ottenuti con il metodo pesca() sempre della classe Mazzo
         */
        public void genera_mano(){     
            deck.mescola();
                   
            for (int i = 0; i < N_Carte ; i++){
                mano[i] = deck.pesca();
            } 
        }

        public void sort() {     
            for (int i = 0; i < mano.length; i++) {
                for (int j = i; j < mano.length; j++) {
                    if (this.mano[j].compareTo(this.mano[j+1]) == 1) {
                        Carta temp = new Carta(mano[j]);
                        mano[j] = mano[j+1];
                        mano[j+1] = temp;
                    }
                }
            }
        }
        
        /*
        *   Stampa una mano di 5 carte pero scoperte quindi devi mettere che non sono coperti
        */
         @Override
        public String toString() {
            return "mano{" + mano[0] + " , " + mano[1] + " , "+ mano[2] + " , "+ mano[3] + " , "+ mano[4] + '}';
        }
        
        /**
          * Metodo per confrontare due mani
          * @param m
          * @return 
        */
        int compareTo(Mano m) {
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


    }       
        
       
 