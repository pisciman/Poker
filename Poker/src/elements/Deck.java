package elements;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import javax.imageio.ImageIO;
import values.CardSeed;
import values.CardValues;

/**
 * @author j.manalo
 * @since JDK 8.1 */

public class Deck
{
    // ATTRIBUTES
    private final Card[] cards;
    private static int index = 0;
    
    // CONSTRUCTORS
    public Deck ()
    {
        this.cards = new Card[52];
        
        generate();
        shuffle();
    }
    
    // METHODS
    private void generate() {
        for (CardSeed seed : CardSeed.values()) {
            for (CardValues value : CardValues.values()) {
                try { cards[value.ordinal() + (13 * seed.ordinal())] = new Card(seed, ImageIO.read(new File("imgs/cards/" + value.getSymbol() + seed.getLetter()+ ".png")), value); }
                catch (IOException ex) {System.out.println("Errore nella texturizzazione delle carte"); }
            }
        }
    }
    
    private void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }
    
    public Card peek() {
        return isEmpty() ? null : cards[index++];
    }
    
    private boolean isEmpty() {
        return index == 52;
    }
}