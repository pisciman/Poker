package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
