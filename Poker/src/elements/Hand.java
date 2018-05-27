package elements;

import gui.GMazzo;
import java.util.Arrays;

/**
 * @author m.jerome
 */
public class Hand
{
    // ATTRIBUTES
    private GMazzo deck[];
    private GMazzo mano[];
    
    // CONSTRUCTORS
    public Hand()
    {
        this.deck = new GMazzo[52];
        this.mano = new GMazzo[2];
        
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