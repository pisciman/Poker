package poker;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManoTest {


    @Test
    public void testAggiungiMano( ) throws Exception {
        Mano m = new Mano();
        Carta c[]=new Carta[2];
        c[0]=new Carta(Seme.CUORI,Valore.CINQUE);
        c[1]=new Carta(Seme.PICCHE,Valore.QUATTRO);
        m.aggiungi(c);
        //VERIFICARE CHE SIA AGGIUNTO

    }

    @Test
    public void testConfrontaMano( ) throws Exception {
        Mano m = new Mano();
        Mano m1 = new Mano();
        // Generare mani
        assertEquals(0,m.compareTo(m)); //UNICO caso in cui deve restituire 0
        fail("TODO: Testare Due carte più alte");
        fail("TODO: Testare Due Poker");
        fail("TODO: Testare Due full");


    }

    @Test
    public void testConfrontaPunto( ) throws Exception {
        Mano m = new Mano();
        Mano m1 = new Mano();
        // Generare mani
        //assertEquals(true,m.comparePunto(m)==1);
        fail("TODO: Testare Tris e Scala");
        fail("TODO: Testare Poker e Colore");
        fail("TODO: Testare Carta più alta e coppia");
    }




/*    @Test
    public void TestToString( ) throws Exception {
    }
*/
}