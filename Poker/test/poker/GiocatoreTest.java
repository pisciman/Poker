/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roberto
 */
public class GiocatoreTest {
    
    public GiocatoreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
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
 
}
