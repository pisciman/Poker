/* *********************************
   *   2017(c)Project made by:     * 
   *                               * 
   *          GUI Group            * 
   ******************************** */

package gui;

import java.awt.LayoutManager;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import gui.GMazzo;
import elements.Player;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;

/**
 * @author d.abati
 * @author d.niculae
 * @author s.dediou
 * @author s.nicolini
 * @author a.alushi
 * @author f.metta
 * @since JDK 8.1 */

class Dashboard extends JPanel
{
    // ATTRIBUTES
    Player p1;
    final GMazzo deck;
    final BufferedImage table;
    JLabel punti;
    // CONSTRUCTORS
    public Dashboard (LayoutManager layout, Player p1) throws IOException
    {
        super(layout);
        this.p1=p1;
        this.deck = new GMazzo();
        this.table = loadImage("imgs/iface/bg.jpg");
        build();   
    }
    
    // METHODS
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
        
        super.paintComponent(g);
        g2.drawImage(table, 0, 0, null);
        at.rotate(Math.toRadians(90));
        at.translate(-45, -65);
        g2.drawImage(deck.peek().back, at, this);
        at.translate(95, 0);
        g2.drawImage(deck.peek().back, at, this);
        at.translate(0, -1075);
        g2.drawImage(deck.peek().back, at, this);
        at.translate(-95, 0);
        g2.drawImage(deck.peek().back, at, this);
        at.rotate(Math.toRadians(90));
        at.translate(600, -600);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(-95, 0);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(250, 300);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(-100, 0);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(-95, 0);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(-95, 0);
        g2.drawImage(deck.peek().face, at, this);
        at.translate(-95, 0);
        g2.drawImage(deck.peek().face, at, this);
        
    }
        private void build(){
        punti =new JLabel(p1.getName()+": "+p1.getMoney()+"$");
        punti.setBounds(600,54, 100,30);
        add(punti);
        setLayout(null);  
        setVisible(true);
    }
    private BufferedImage loadImage(String path) {
        BufferedImage image = null;
        
        try { image = ImageIO.read(new File(path)); }
        catch (IOException ex) { }
        
        return image;
    }
}