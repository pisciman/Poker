/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;
import org.junit.Test;
import static org.junit.Assert.*;

public class CartaTest {
    
    @Test
    public void testOutput() {
        Carta c = new Carta(Seme.CUORI, Valore.ASSO, false);
        String expResult = "\u001B[31mA ♥";
        assertEquals(expResult, c.toString());
    }
    
    @Test
    public void testCompare() {
        Carta c = new Carta(Seme.CUORI, Valore.TRE, false);
        Carta c2 = new Carta(Seme.CUORI, Valore.SEI, false);
        
        assertTrue(c.compareTo(c2) == -1);
    }
    
    @Test
    public void testCompareAssi() {
        Carta c = new Carta(Seme.CUORI, Valore.ASSO, false);
        Carta c2 = new Carta(Seme.CUORI, Valore.TRE, false);
        
        assertTrue(c.compareTo(c2) == 1);
    }
}
