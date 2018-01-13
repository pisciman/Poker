package poker;

/**
 *
 * @author jerome
 */

public class Mano {
    public static void main(String[] args) {
        int Giocatori = 5;
        int carte = 5;        
        
        String[] seme = { "♣", "♦", "♥", "♠" };
        String[] valore = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
            "Q", "K", "A" };
        
        
        int SUITS = seme.length;
        int RANKS = valore.length;
        int DECK_SIZE = SUITS * RANKS;
        
        // crea mazzo
        String[] mazzo = new String[DECK_SIZE];
        for (int i = 0; i < RANKS; i++) {
            for (int j = 0; j < SUITS; j++) {
                mazzo[SUITS*i + j] = valore[i] + seme[j];
            }
        }
        
        // mischia le carte e da le carte
        for (int hands = 0; hands < Giocatori; hands++) {
            
            // shuffle
            for (int i = 0; i < DECK_SIZE; i++) {
                int r = i + (int) (Math.random() * (DECK_SIZE-i));
                String t = mazzo[r];
                mazzo[r] = mazzo[i];
                mazzo[i] = t;
            }
            
            // stampa le carte in mano
            for (int i = 0; i < carte; i++) {
                System.out.print(mazzo[i] + " ");
            }
            System.out.println();
        }
    }
} 
