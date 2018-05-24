package values;

/**
 * @author piffy
 * @author m.santosuosso
 * @since JDK 8.1 */

public enum CardValues
{
    // CONSTANTS
    ASSO("A"), DUE("2"), TRE("3"), QUATTRO("4"), CINQUE("5"), SEI("6"), SETTE("7"), OTTO("8"), NOVE("9"), DIECI("10"), JACK("J"), DONNA("Q"), RE("K");
    private final String value;
    
    // CONSTRUCTOR
    CardValues (String value)
    {
        this.value = value;
    }
    
    // MMETHODS
    public int getValue() {
        return ordinal()+1;
    }
    
    public String getSymbol() {
        return value;
    }
}