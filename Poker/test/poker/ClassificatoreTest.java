/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author m.missiroli
 */
public class ClassificatoreTest {
    
    public ClassificatoreTest() {
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
     * Test of classifica method, of class Classificatore.
     */
    @Test
    public void testNull() {
        System.out.println("vuoto");
        ArrayList<Carta> l = null;
        PuntoMano expResult = PuntoMano.INDEFINITO;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
        public void testUnaCarta() {
        System.out.println("unacarta");
        ArrayList<Carta> l = new ArrayList<Carta>();
        l.add(new Carta(Seme.CUORI,Valore.CINQUE));
        PuntoMano expResult = PuntoMano.ALTA;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
