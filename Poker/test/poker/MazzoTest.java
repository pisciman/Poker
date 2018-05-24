package poker;

import org.junit.Test;

import static org.junit.Assert.*;

public class MazzoTest {
    @Test
    public void TestPesca( ) throws Exception {
        Mazzo m = new Mazzo();

        Carta c=null;
        for (int i=0;i<52;i++)
            c= m.pesca();
        Carta expResult= new Carta(Seme.FIORI,Valore.ASSO,false);
        assertTrue(c.equals(expResult));
        c= m.pesca();
        assertTrue(c == null);

    }

    @Test
    public void TestgeneraMazzo( ) throws Exception {
        Mazzo m = new Mazzo();
        Carta expResult= new Carta(Seme.FIORI,Valore.ASSO,false);
        assertTrue(expResult.equals(m.getMazzo()[0]));
    }

    @Test
    public void TestMescola( ) throws Exception {
        Mazzo m = new Mazzo();
        Carta expResult= new Carta(Seme.FIORI,Valore.ASSO,false);
        m.mescola();
        assertFalse(expResult.equals(m.getMazzo()[0]));
    }



}