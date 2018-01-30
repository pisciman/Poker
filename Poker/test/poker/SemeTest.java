package poker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 *
 * @author piffy2
 */
public class SemeTest {
    
    /**
     * Test of values method, of class Seme.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Seme[] expResult = {Seme.FIORI,Seme.QUADRI,Seme.CUORI,Seme.PICCHE};
        Seme[] result = Seme.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Seme.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        Seme expResult = Seme.CUORI;
        Seme result = Seme.valueOf("CUORI");
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Seme.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Seme instance = Seme.FIORI;
        String expResult = "♣";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of name method, of class Seme.
     */
    
    @Test
    public void testName() {
        System.out.println("toString");
        Seme instance = Seme.FIORI;
        String expResult = "FIORI";
        String result = instance.name();
        assertEquals(expResult, result);
    }

    @Test
    public void testOutput() {

        PrintStream save_out=System.out;
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Seme.main(new String[1]);
        assertEquals("FIORI: ♣ Ordinale: 0\n" +
                "QUADRI: ♦ Ordinale: 1\n" +
                "CUORI: ♥ Ordinale: 2\n" +
                "PICCHE: ♠ Ordinale: 3\n", out.toString());

        System.setOut(save_out);
    }
    @Test
    public void testToStringg() 
    {
        Giocatore g = new Giocatore("Gianfranco", 'M', 18, 500);
        assertEquals("Giocatore{nick: Gianfranco, sesso: M, anni: 18, soldi: 500}", g.toString());
    }
    
    @Test
        public void testSetSesso() 
        {
            Giocatore g = new Giocatore("Alessio", 'M', 19, 1000);
            assertTrue('M' == g.getSesso());
        }
    
}
