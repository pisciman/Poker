package gui;

import elements.Player;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class DashboardTest {
    @Test
    public void loadImageTest( ) throws Exception {

        Player p1 = new Player("NOME", 'M', 18, 300);
        Dashboard dashboard = new Dashboard(new GridBagLayout(),p1);
        assertTrue(dashboard.table != null);

    }

}