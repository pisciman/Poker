package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author francescometta
 */
class Dashboard extends JPanel
{
    // ATTRIBUTES
    private final JLabel bg;
    
    // CONSTRUCTORS
    Dashboard(int width, int height, LayoutManager layout)
    {
        super(layout);
        this.bg = new JLabel(new ImageIcon(getClass().getResource("/img/table.jpg")));
        add(this.bg);
        setPreferredSize(new Dimension(width, height));
    }
}
