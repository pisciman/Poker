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
     * Test of setNomeGiocatore method, of class Giocatore.
     */
    @Test
    public void testSetNomeGiocatore() {
        System.out.println("setNomeGiocatore");
        String nomeGiocatore = "";
        Giocatore instance = null;
        instance.setNomeGiocatore(nomeGiocatore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSesso method, of class Giocatore.
     */
    @Test
    public void testSetSesso() {
        System.out.println("setSesso");
        char sesso = ' ';
        Giocatore instance = null;
        instance.setSesso(sesso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEtà method, of class Giocatore.
     */
    @Test
    public void testSetEtà() {
        System.out.println("setEt\u00e0");
        int età = 0;
        Giocatore instance = null;
        instance.setEtà(età);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSoldi method, of class Giocatore.
     */
    @Test
    public void testSetSoldi() {
        System.out.println("setSoldi");
        int soldi = 0;
        Giocatore instance = null;
        instance.setSoldi(soldi);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Giocatore.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Giocatore instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Giocatore.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Giocatore.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
