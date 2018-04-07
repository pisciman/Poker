/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author s.nicolini
 */
public class frameindex extends JFrame{
    private final JLabel sfondo;
    JLabel nomeLabel = new JLabel ("Inserisci il tuo nome");
    JTextField nomeText = new JTextField (20);
    JButton b;
    JPanel panel = new JPanel();
    String name;
//    JLabel background=new JLabel(new ImageIcon((getClass().getResource("/img/sfondo.jpg"))));
    public frameindex(){ 
        this.sfondo = new JLabel(new ImageIcon(getClass().getResource("/img/sfondo.jpg")));
        b = new JButton(new ImageIcon(((new ImageIcon((getClass().getResource("/img/start.png")))).getImage()).getScaledInstance(100, 50, java.awt.Image.SCALE_DEFAULT))); 
       // b=new JButton("Start game");
       // add(background);
       //background.setLayout(new FlowLayout());
        panel.add(nomeLabel);
        panel.add(nomeText);
        panel.add(b);
        panel.add(sfondo);
        b.setLayout(null);
        b.setBounds(100,100,100, 40); 
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt) {
                takeActionPerformed();
            }
        }); 
        add(panel);
        setSize(300,300);
        setTitle("Poker-home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    private void takeActionPerformed(){
        name = nomeText.getText();
        System.out.println(name);
    }
    public String getnome(){
        return name;
    }
    
}
