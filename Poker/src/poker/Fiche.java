/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *      Gruppo Epsilon         * 
   ******************************* */

package poker;

public class Fiche 
{
    // ATTRIBUTI
    private final Tipo categoria;
    
    // COSTRUTTORI
    public Fiche (Tipo genere)
    {
        this.categoria = genere;
    }
    
    // METODI
    @Override
    public String toString () {
        return "Fiche { categoria : " + categoria + "}";
    }
}