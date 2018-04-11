package gui;

/*
 * @inphormatic, @simplayy, @Xxpromw3mtxX e altri
 * Cose da fare (che potete dividervi tra i due gruppi:
 * Generate il banco, con il nome del/dei giocatori. Generate le carte coperte.
 *
 * Premendo un qualche pulsante le carte si devono rivelare.
 * PER LE CARTE POTETE USARE QUESTE IMMAGINI:
 * https://github.com/hayeah/playing-cards-assets/tree/master/png
 *
 *
 */


import java.awt.BorderLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author francescometta
 */
public class Board extends JFrame
{
    // ATTRIBUTES
    private final Dashboard dash;
    
    public Board(String title, int width, int height) {
        super(title); 
        this.dash = new Dashboard(width, height, new BorderLayout());
        craft();
    }
    
    private void craft() {
        add(dash);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setUndecorated(true);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
    
    public static void main(String[] args) {
        
        Frameindex home=new Frameindex();
        while(home.i==0) {
            System.out.println();
            if(home.i==1){new Board("Poker", 1280, 720);}
        }

    }
}
