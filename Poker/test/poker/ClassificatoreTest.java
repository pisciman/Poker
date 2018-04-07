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
    @Test
        public void testCoppia() {
        System.out.println("coppia");
        ArrayList<Carta> l = new ArrayList<Carta>();
        l.add(new Carta(Seme.CUORI,Valore.CINQUE));
        l.add(new Carta(Seme.PICCHE,Valore.CINQUE));
        PuntoMano expResult = PuntoMano.COPPIA;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
        
     @Test
        public void testNonCoppia() {
        System.out.println("Non coppia");
        ArrayList<Carta> l = new ArrayList<Carta>();
        l.add(new Carta(Seme.CUORI,Valore.DUE));
        l.add(new Carta(Seme.PICCHE,Valore.CINQUE));
        PuntoMano expResult = PuntoMano.ALTA;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testTris() {
        System.out.println("Tris");
        ArrayList<Carta> l = new ArrayList<Carta>();
        l.add(new Carta(Seme.FIORI,Valore.CINQUE));
        l.add(new Carta(Seme.CUORI,Valore.ASSO));
        l.add(new Carta(Seme.QUADRI,Valore.CINQUE));
        l.add(new Carta(Seme.CUORI,Valore.DUE));
        l.add(new Carta(Seme.PICCHE,Valore.CINQUE));
        PuntoMano expResult = PuntoMano.TRIS;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testScala() {
        System.out.println("Tris");
        ArrayList<Carta> l = new ArrayList<Carta>();
        l.add(new Carta(Seme.FIORI,Valore.TRE));
        l.add(new Carta(Seme.CUORI,Valore.ASSO));
        l.add(new Carta(Seme.PICCHE,Valore.QUATTRO));
        l.add(new Carta(Seme.CUORI,Valore.DUE));
        l.add(new Carta(Seme.PICCHE,Valore.CINQUE));
        PuntoMano expResult = PuntoMano.SCALA;
        PuntoMano result = Classificatore.classifica(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
        
    
}
