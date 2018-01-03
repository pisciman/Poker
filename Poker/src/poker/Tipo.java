/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *       Gruppo Epsilon        * 
   ******************************* */

package poker;

/** Fiches usate per i tornei di poker da 4 a 8 giocatori
 * 
 * @author Abati David
 * @author Nicolini Simone */

public enum Tipo 
{
    // ELEMENTI
    BIANCA(5), VERDE(10), BLU(20), ROSSA(50), NERA(100), VIOLA(500);
    public final int valore;
    
    // COSTRUTTORI
    private Tipo (int val)
    {
        this.valore = val;
    }
    
    // METODI
    @Override
    public String toString ()
    {
        return (name() + "\t\tValore: " + valore + "\t\tOrdinario: " + ordinal());
    }

    public static void main(String[] args) {
        for (Tipo c : Tipo.values()) {
            System.out.println(c);
        }
    }
}