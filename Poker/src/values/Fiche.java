package values;

/**
 * @author d.abati
 * @author s.nicolini
 * @since JDK 8.1 */

public enum Fiche
{
    // CONSTANTS
    BIANCA(5), VERDE(10), BLU(20), ROSSA(50), NERA(100), VIOLA(500);
    private final int value;
    
    // CONSTRUCTOR
    Fiche (int value)
    {
        this.value = value;
    }
    
    // METHODS
    public int getValue() {
        return value;
    }
} 