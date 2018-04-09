/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *       Gruppo Epsilon        * 
   ******************************* */

package poker;

import org.junit.Test;
import static org.junit.Assert.*;

public class FicheTest 
{
    @Test
    public void testToString() {
        Fiche instance = Fiche.ROSSA;
        String expResult = "ROSSA\t\tValore: 50\t\tOrdinario: 3";
        
        System.out.println("toString test: ");
        assertEquals(expResult, instance.toString());
    }
    
    @Test
    public void testContenitoreToString () {
        Fiche fiches [] = {Fiche.BIANCA, Fiche.BLU, Fiche.NERA};
        Contenitore instance = new Contenitore(fiches);
        String expResult = "Fiche:\n\tcolore - BLU\n\tvalore - 20";
        
        System.out.println("test metodo toString della classe Contenitore");
        assertEquals(expResult, instance.toString());
    }
}