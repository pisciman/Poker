/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import poker.Carta;
import poker.Seme;
import poker.Valore;

/**
 *
 * @author piffy2
 */
public class GMazzoTest {
    
    public GMazzoTest() {
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

    @Test
    public void testPeek() {
        System.out.println("peek");
        GMazzo instance = new GMazzo();
        Carta expResult = new Carta(Seme.FIORI,Valore.ASSO,false);
        GCarta result = instance.peek();
        result.rivela();
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void TestPesca( ) throws Exception {
        GMazzo m = new GMazzo();

        Carta c=null;
        for (int i=0;i<52;i++)
            c= m.peek();
        Carta expResult= new Carta(Seme.FIORI,Valore.ASSO,false);
        assertTrue(c.equals(expResult));
        c= m.peek();
        assertTrue(c == null);

    }


    @Test
    public void TestMescola( ) throws Exception {
        GMazzo m = new GMazzo();
        Carta expResult= new Carta(Seme.QUADRI,Valore.ASSO,false);
        m.shuffle();
        assertFalse(expResult.equals(m.peek()));
    }
    
    
}
