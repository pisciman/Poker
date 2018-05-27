package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import poker.Carta;
import poker.Seme;
import poker.Valore;
import values.CardSeed;
import values.CardValues;

/**
 * @author piffy
 * @author a.torricelli
 * @author s.nicolini
 * @author m.santosuosso
 * @author d.santacroce
 * @since JDK 8.1 */

public class GCarta extends Carta 
{
    // ATTRIBUTES
    public final BufferedImage face;
    public final BufferedImage back;
    //private final CardSeed seed;
    //private final CardValues value;
    
    // CONSTRUCTORS
    public GCarta (Seme seed, BufferedImage face, Valore value) throws IOException
    {
        super(seed,value,true);
        this.face = face;
        this.back = ImageIO.read(new File("imgs/cards/cgirata.png"));
    }
    
   
/**
    @Override
    public int compareTo(GCarta other) {
        if (value.equals(CardValues.ASSO) && other.value.equals(CardValues.ASSO)) return 0;
        
        return getValue().compareTo(other.getValue()) < 0 ? -1 : 1;
    }
    * **/
}