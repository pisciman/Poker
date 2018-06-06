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
//import elements.Player;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import poker.Giocatore;

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
    Giocatore p1;
    final GMazzo deck;
    final BufferedImage table;
    final BufferedImage fiches5;
    final BufferedImage fiches10;
    final BufferedImage fiches50;
    final BufferedImage fiches100;
    final BufferedImage fiches200;
    final BufferedImage fiches500;
    final BufferedImage fichesGiocatori;
    //final JLabel labelf;
    JLabel nome;
    JLabel puntata;
    // CONSTRUCTORS
    public Dashboard (LayoutManager layout, Giocatore p1) throws IOException
    {
        super(layout);
        this.p1=p1;
        this.deck = new GMazzo();
        this.table = loadImage("imgs/iface/bg.jpg");
        this.fiches5 = loadImage("imgs/iface/fiches5.png");
        this.fiches10 = loadImage("imgs/iface/fiches10.png");
        this.fiches50 = loadImage("imgs/iface/fiches50.png");
        this.fiches100 = loadImage("imgs/iface/fiches100.png");
        this.fiches200 = loadImage("imgs/iface/fiches200.png");
        this.fiches500 = loadImage("imgs/iface/fiches500.png");
        this.fichesGiocatori = loadImage("imgs/iface/fichesop.png");

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
        
        g2.drawImage(fichesGiocatori, 130, 60, null);
        g2.drawImage(fichesGiocatori, 935, 60, null);
        
        if(p1.getSoldi()>=0 && p1.getSoldi()<=9){
        g2.drawImage(fiches5, 700, 510, null);
        }else if(p1.getSoldi()>=10 && p1.getSoldi()<=49){
            g2.drawImage(fiches10, 700, 510, null);
        }else if(p1.getSoldi()>=50 && p1.getSoldi()<=99){
            g2.drawImage(fiches50, 700, 510, null);
        }else if(p1.getSoldi()>=100 && p1.getSoldi()<=199){
            g2.drawImage(fiches100, 700, 510, null);
        }else if(p1.getSoldi()>=200 && p1.getSoldi()<=499){
            g2.drawImage(fiches200, 700, 510, null);
        }else if(p1.getSoldi()>=500){
            g2.drawImage(fiches500, 700, 510, null);
        }
    }
    
        private void build(){
        nome = new JLabel("Nome: " +p1.getNomeGiocatore());
        nome.setBounds(555,475, 80,30);
        add(nome);
        puntata = new JLabel("Puntata: " +p1.getSoldi()+ "$");
        puntata.setBounds(765,475, 80,30);
        add(puntata);
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