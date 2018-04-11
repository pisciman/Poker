package poker;

/**
 *
 * @author jerome
 */

public class Mano {

       private int N_Carte = 5;
       private Carta Mano[] = new Carta[N_Carte];
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
        throw new Error("Non implementato");
        }





        
        /**
         *  usa il metodo mescola() della classe Mazzo per mescolare la carta
         *  e poi assegna all'array Mano i valori ottenuti con il metodo pesca() sempre della classe Mazzo
         */
        public void genera_mano(){     
            deck.mescola();
                   
            for (int i = 0; i < N_Carte ; i++){
                Mano[i] = deck.pesca();
            } 
        }

        /*
        *   Stampa una mano di 5 carte pero scoperte quindi devi mettere che non sono coperti
        */
         @Override
        public String toString() {
            return "Mano{" + Mano[0] + " , " + Mano[1] + " , "+ Mano[2] + " , "+ Mano[3] + " , "+ Mano[4] + '}';
        }

        public static void main (String args[]) {
            Mano m = new Mano();
            m.genera_mano();     
            System.out.println(m);
        } 
    }       
        
       
 