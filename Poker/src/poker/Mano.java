package poker;

/**
 *
 * @author jerome
 */

public class Mano {

       private  Mazzo deck[] = new Mazzo[52];
    //   private int Giocatori = 5;
       private int N_Carte = 5;
       private Mazzo Mano[] = new Mazzo[5];

        /**
         * costruttore
         */
        public void Mano(){ 
            genera_mano();
        }
        
        /**
         * genera un array chiamato mano che contiene 5 carteff 
         */
        public void genera_mano(){
            for (int i = 0; i < N_Carte ; i++){

             Mano[i] = deck[i];
            } 
        }

      @Override
      public String toString() {
        return "Mano{" + Mano + '}';
        }

    
      public static void main (String args[]) {
        Mano m = new Mano();
        System.out.println(m);
    }       
        
       
    }


