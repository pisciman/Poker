package gui;

import poker.Giocatore;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class DashboardTest {
    @Test
    public void loadBasicTest( ) throws Exception {

        Giocatore p1 = new Giocatore("NOME", 'M', 18, 300);
        Dashboard dashboard = new Dashboard(new GridBagLayout(),p1);
        assertTrue(dashboard.table != null);

    }

}