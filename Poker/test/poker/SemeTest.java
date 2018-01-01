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
    
}
