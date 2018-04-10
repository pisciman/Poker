package poker;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Torricelli Alessio
 * @author Sferruzza Matteo
 * @author Cavalieri Melissa
 * @author Pollarini Umberto 
 */
public class GiocatoreTest {

    //Pollarini
    @Test
    public void testToString() {
        Giocatore g = new Giocatore("Gianfranco", 'M', 18, 500);
        assertEquals("Giocatore{nick: Gianfranco, sesso: M, anni: 18, soldi: 500}", g.toString());
    }
    
    @Test
    public void testSetSesso() {
        Giocatore g = new Giocatore("Alessio", 'M', 19, 1000);
        assertTrue('M' == g.getSesso());
    }
    
    //Sferruzza
    @Test
    public void testSetEtà() {
	Giocatore g = new Giocatore("Giorgia", 'F', 20, 2000);
	assertTrue(20 == g.getEtà());
	g.setEtà(16);
	assertTrue(18 == g.getEtà());
    }
    
    @Test
    public void testSetSoldi() {
	Giocatore g = new Giocatore("Federico", 'M', 28, 3000);
	assertTrue(3000 == g.getSoldi());
	g.setSoldi(500);
	assertFalse(3000 == g.getSoldi());
    }
    
    //Cavalieri
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