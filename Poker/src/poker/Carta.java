/**
 * @author Alessio Torricelli
 * @version 1.0
 * @since 07-12-2017
**/
package poker;

public class Carta
{
    private String simbolo;
    private int seme;
    private boolean stato;

    public Carta(String simbolo, int seme, boolean stato)
    {
        this.simbolo = simbolo;
        this.seme = seme;
        this.stato = stato;
    }
}