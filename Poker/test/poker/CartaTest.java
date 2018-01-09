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
        
        Carta c2 = new Carta(Seme.FIORI, Valore.RE, false);
        String expResult2 = "\u001B[30mK ♣";
        assertEquals(expResult2, c2.toString());
        
        Carta c3 = new Carta(Seme.QUADRI, Valore.SEI, false);
        String expResult3 = "\u001B[31m6 ♦";
        assertEquals(expResult3, c3.toString());
        
        Carta c4 = new Carta(Seme.PICCHE, Valore.JACK, false);
        String expResult4 = "\u001B[30mJ ♠";
        assertEquals(expResult4, c4.toString());
    }
    
    @Test
    public void testCompare() {
        Carta c = new Carta(Seme.CUORI, Valore.TRE, false);
        Carta c2 = new Carta(Seme.CUORI, Valore.SEI, false);
        assertTrue(c.compareTo(c2) == -1);
        
        Carta c3 = new Carta(Seme.FIORI, Valore.JACK, false);
        Carta c4 = new Carta(Seme.CUORI, Valore.SEI, false);
        assertTrue(c3.compareTo(c4) == 1);
        
        Carta c5 = new Carta(Seme.FIORI, Valore.RE, false);
        Carta c6 = new Carta(Seme.CUORI, Valore.RE, false);
        assertTrue(c5.compareTo(c6) == 0);
    }
    
    @Test
    public void testCompareAssi() {
        Carta c = new Carta(Seme.CUORI, Valore.ASSO, false);
        Carta c2 = new Carta(Seme.CUORI, Valore.TRE, false);
        assertTrue(c.compareTo(c2) == 1);
        
        Carta c3 = new Carta(Seme.CUORI, Valore.ASSO, false);
        Carta c4 = new Carta(Seme.FIORI, Valore.TRE, false);
        assertTrue(c3.compareTo(c4) == 1);
        
        Carta c5 = new Carta(Seme.CUORI, Valore.TRE, false);
        Carta c6 = new Carta(Seme.FIORI, Valore.ASSO, false);
        assertTrue(c5.compareTo(c6) == -1);
        
        Carta c7 = new Carta(Seme.CUORI, Valore.ASSO, false);
        Carta c8 = new Carta(Seme.FIORI, Valore.ASSO, false);
        assertTrue(c7.compareTo(c8) == 0);
    }
}
