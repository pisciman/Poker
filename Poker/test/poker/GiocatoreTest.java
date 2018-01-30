package poker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Torricelli Alessio
 * @author Sferruzza Matteo
 * @author Cavalieri Melissa
 */
public class GiocatoreTest {

    /**
     * Test of setEtà method, of class Giocatore.
     */
    @Test
    public void testSetEtà() {
	Giocatore g = new Giocatore("Giorgia", 'F', 20, 2000);
	assertTrue(20 == g.getEtà());
	g.setEtà(16);
	assertTrue(18 == g.getEtà());
    }
    
    /**
     * Test of setSoldi method, of class Giocatore.
     */
    @Test
    public void testSetSoldi() {
	Giocatore g = new Giocatore("Federico", 'M', 28, 3000);
	assertTrue(3000 == g.getSoldi());
	g.setSoldi(500);
	assertFalse(3000 == g.getSoldi());
    }
    
    
    @Test
    public void testGetNomeGiocatore() {
        Giocatore g = new Giocatore("Giovanni", 'M', 23, 2500);
	assertEquals("Giovanni", g.getNomeGiocatore());
    }

    @Test
    public void testSetNomeGiocatore() {
	Giocatore g = new Giocatore("", 'M', 19, 1000);
	assertEquals("", g.getNomeGiocatore());
	g.setNomeGiocatore("Giovanni");
	assertEquals("Giovanni", g.getNomeGiocatore());
}
}