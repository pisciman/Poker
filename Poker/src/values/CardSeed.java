package values;

/**
 * @author piffy
 * @author a.torricelli
 * @since JDK 8.1 */

public enum CardSeed
{
    // CONSTANTS
    FLOWERS('C'), SQUARE('D'), HEART('H'), SPADES('S');
    private final char symbol;
    
    // CONSTRUCTOR
    CardSeed (char id)
    {
        this.symbol = id;
    }
    
    // METHODS
    public char getLetter() {
        return symbol;
    }
}