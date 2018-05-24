package elements;

import java.util.Arrays;

/**
 * @author m.jerome
 */
public class Hand
{
    // ATTRIBUTES
    private Deck deck[];
    private Deck mano[];
    
    // CONSTRUCTORS
    public Hand()
    {
        this.deck = new Deck[52];
        this.mano = new Deck[2];
        
        generateHand();
    }
    
    // METHODS
    public void generateHand() {
        System.arraycopy(deck, 0, mano, 0, 5);
    }
    
    @Override
    public String toString() {
        return "Mano { " + Arrays.toString(mano) + " }";
    } 
}