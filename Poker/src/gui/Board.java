/* *********************************
   *   2017(c)Project made by:     * 
   *                               * 
   *         GUI Group             * 
   ******************************** */
package gui;

import com.sun.org.apache.xerces.internal.util.XML11Char;
//import elements.Player;
import poker.Giocatore;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 * @author d.abati
 * @author d.niculae
 * @author s.dediou
 * @author s.nicolini
 * @author a.alushi
 * @author f.metta
 * @since JDK 8.1
 */
public class Board extends JFrame {

    // ATTRIBUTES
    private Dashboard dash;
    private ImageIcon icon;
    
    // COSNTRUCTORS
    public Board(String title, String nome, char sesso, int soldi) throws IOException {
        super(title);
        Giocatore p1 = new Giocatore(nome, sesso, 18, soldi);
        this.dash = new Dashboard(new GridBagLayout(),p1);
        try { this.icon = new ImageIcon(ImageIO.read(new File("imgs/iface/icon.png"))); }
        catch (IOException ex) { System.out.println("Icona non trovata nella cartella 'imgs'"); }

        craft();
    }

    // MEHTODS
    private void craft() {
        add(dash);
        setDefaultCloseOperation(3);
        setIconImage(icon.getImage());
        setPreferredSize(new Dimension(1280, 720));
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    /* Main Method */
    public static void main(String[] args) {
         Login l1= new Login();
        
    }
}
