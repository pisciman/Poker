package poker;

/**
 * @author sfemat aggiungi_carta & aggiungi_carta_random & puntatore
 * @author jerome
 */

public class Mano {

       private int N_Carte = 5;
       private Carta Mano[] = new Carta[N_Carte];
       private Mazzo deck = new Mazzo();
       public int puntatore; //Puntatore alla carta attualmente utilizzata, utilizzabile da altre classi
       
        /**
         * costruttore
        */
        public void Mano(){  
        //    genera_mano();
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
        
    /**
     * Aggiungi carta (scoperta) generata casualmente alla mano
     */
        public void aggiungi_carta_random(){
            
            Carta k = new Carta(Seme.genera_Seme_Casuale(),Valore.genera_Valore_Casuale(),false);
            Mano[puntatore] = k;
             
        }
        /**
         * Aggiungi carta (scoperta) alla mano
        * @param m Seme della carta
        * @param v Valore della carta
         */
        public void aggiungi_carta(Seme m, Valore v){
            Carta k = new Carta(m,v,false);
            Mano[puntatore] = k;
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
        
       
 