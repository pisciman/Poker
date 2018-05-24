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
 * @author Matteo
 */
public class TutorialTest {
   
    @Test
    /*
        Test vittorie di fila
    */
    public void testVittorieDiFila(){
       
    }
    
    /**
     * Test of genera method, of class Tutorial.
     */
    @Test
    public void testGenera() {
        System.out.println("genera");
        double random = 0.0;
        Tutorial instance = new Tutorial();
        instance.genera(random);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Tutorial.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Tutorial.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
