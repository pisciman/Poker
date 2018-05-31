package gui;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import javax.imageio.ImageIO;
import poker.Seme;
import poker.Valore;


/**
 * @author j.manalo
 * @since JDK 8.1 */

public class GMazzo
{
    // ATTRIBUTES
    private final GCarta[] cards;
    private static int index = 0;
    
    // CONSTRUCTORS
    public GMazzo ()
    {
        this.cards = new GCarta[52];
        
        generate();
        //shuffle();
    }
    
    // METHODS
    private void generate() {
        for (Seme seed : Seme.values()) {
            for (Valore value : Valore.values()) {
                try { cards[value.ordinal() + (13 * seed.ordinal())] = new GCarta(seed, ImageIO.read(new File("imgs/cards/" + value.getEnglishLetter()+ seed.getEnglishLetter()+ ".png")), value);
                      //System.out.println("imgs/cards/" + value.getValore() + seed.getEnglishLetter()+ ".png");
                     }
                catch (IOException ex) {System.out.println("Errore nella texturizzazione delle carte seme: " +seed+"valore: "+ value+"\nFN: imgs/cards/" + value.getEnglishLetter()+ seed.getEnglishLetter()+ ".png"); }
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }
    
    public GCarta peek() {
        return isEmpty() ? null : cards[index++];
    }
    
    private boolean isEmpty() {
        return index == 52;
    }
}