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
        Carta c[]=new Carta[2];
        c[0]=new Carta(Seme.CUORI,Valore.CINQUE);
        c[1]=new Carta(Seme.PICCHE,Valore.QUATTRO);
        m.aggiungi(c);
        Mano m1 = new Mano();
        Carta c1[]=new Carta[2];
        c1[0]=new Carta(Seme.FIORI,Valore.CINQUE);
        c1[1]=new Carta(Seme.QUADRI,Valore.CINQUE);
        m1.aggiungi(c1);
        assertEquals(true,m.compareTo(m)==0);
        assertEquals(true,m.compareTo(m1)<0);
        //NOTARE CHE NON BASTA USARE Classificatore perché in caso di parità conta
        //Il valore delle carte (es: due tris vince il più alto)


    }



    @Test
    public void TestToString( ) throws Exception {
    }

}