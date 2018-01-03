/* *******************************
   *   2018(c)Project made by:   * 
   *                             * 
   *       Gruppo Epsilon        * 
   ******************************* */

package poker;

import org.junit.Assert;
import org.junit.Test;

public class TipoTest
{
    @Test
    public void testToString () {
        Tipo instance = Tipo.NERA;
        String expResult = "NERA";
        
        System.out.println("toString test:\n");
        Assert.assertEquals(expResult, instance.toString());
    }
    
    @Test
    public void testGetFicheValue () {
        Fiche fiche = new Fiche(Tipo.NERA);
        int expResult = Tipo.NERA.valore;
        
        System.out.println("getFicheValue test:\n");
        Assert.assertEquals(expResult, fiche.getFicheValue());
    }
}