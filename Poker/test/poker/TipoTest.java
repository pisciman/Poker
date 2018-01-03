package poker;

import org.junit.Assert;
import org.junit.Test;

public class TipoTest
{
    @Test
    public void testToString () {
        System.out.println("toString test:\n");
        Tipo instance = Tipo.NERA;
        String expResult = "NERA";
        Assert.assertEquals(expResult, instance.toString());
    }    
}