/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author piffy2
 */
public class ValoreTest {
    
    public ValoreTest() {
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
    public void testToString() {
        System.out.println("toString");
        Valore instance = Valore.ASSO;
        String expResult = "A";
        String result = instance.toString();
        assertEquals(expResult, result);
 
    }

    @Test
    public void testGetValore() {
        System.out.println("getValore");
        Valore instance = Valore.DUE;
        int expResult = 2;
        int result = instance.getValore();
        assertEquals(expResult, result);
        instance = Valore.DIECI;
        expResult = 10;
        result = instance.getValore();
        assertEquals(expResult, result);
        instance = Valore.ASSO;
        expResult = 1;
        result = instance.getValore();
        assertEquals(expResult, result);
        instance = Valore.JACK;
        expResult = 11;
        result = instance.getValore();
        assertEquals(expResult, result);        
    }

    @Test
    public void testGetEnglishLetterNorm() {
        System.out.println("getEnglishLetterNorm");
        Valore instance = Valore.DUE;
        String expResult = "2";
        String result = instance.getEnglishLetter();
        assertEquals(expResult, result);
        instance = Valore.OTTO;
        expResult = "8";
        result = instance.getEnglishLetter();
        instance = Valore.DIECI;
        expResult = "10";
        result = instance.getEnglishLetter();

    }
    
    @Test
    public void testGetEnglishLetter() {
        System.out.println("getEnglishLetter");
        Valore instance = Valore.JACK;
        String expResult = "J";
        String result = instance.getEnglishLetter();
        assertEquals(expResult, result);
        instance = Valore.ASSO;
        expResult = "A";
        result = instance.getEnglishLetter();
        assertEquals(expResult,result);
        instance = Valore.RE;
        expResult = "K";
        result = instance.getEnglishLetter();
        assertEquals(expResult, result);

    }

    
}
