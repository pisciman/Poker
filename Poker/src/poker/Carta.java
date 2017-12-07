/**
 * @author Alessio Torricelli
 * @version 1.0
 * @since 07-12-2017
**/
package poker;

public class Carta
{
    private String simbolo;
    private int valore;
    private boolean stato;

    public Carta(String simbolo, int valore, boolean stato)
    {
        this.simbolo = simbolo;
        this.valore = valore;
        this.stato = stato;
    }
}