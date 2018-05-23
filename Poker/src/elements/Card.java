package elements;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import values.CardSeed;
import values.CardValues;

/**
 * @author piffy
 * @author a.torricelli
 * @author s.nicolini
 * @author m.santosuosso
 * @author d.santacroce
 * @since JDK 8.1 */

public class Card implements Comparable<Card>
{
    // ATTRIBUTES
    public final BufferedImage face;
    public final BufferedImage back;
    private final CardSeed seed;
    private final CardValues value;
    
    // CONSTRUCTORS
    public Card (CardSeed seed, BufferedImage face, CardValues value) throws IOException
    {
        this.seed = seed;
        this.value = value;
        this.face = face;
        this.back = ImageIO.read(new File("imgs/cards/cgirata.png"));
    }
    
    // METHODS
    public String getValue() {
        return value.getSymbol();
    }
    
    @Override
    public int compareTo(Card other) {
        if (value.equals(CardValues.ASSO) && other.value.equals(CardValues.ASSO)) return 0;
        
        return getValue().compareTo(other.getValue()) < 0 ? -1 : 1;
    }
}