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
public class Frameindex extends JFrame{
    String name;
    String sesso;
    
    public int i=0;
    private final JLabel sfondo;
    JLabel nomeLabel = new JLabel ("Inserisci il tuo nome");
    JTextField nomeText = new JTextField (20);
    JButton b;
    JPanel panel = new JPanel();
    
    JCheckBox anni = new JCheckBox("Dichiaro di avere almeno 18 anni");
    JRadioButton maschio = new JRadioButton("maschio");
    JRadioButton femmina = new JRadioButton("femmina");
    JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 180);  
//    JLabel background=new JLabel(new ImageIcon((getClass().getResource("/img/sfondo.jpg"))));
    public Frameindex(){ 
        
        this.sfondo = new JLabel(new ImageIcon(getClass().getResource("/imgs/sfondo.jpg")));
        b = new JButton(new ImageIcon(((new ImageIcon((getClass().getResource("/imgs/start.png")))).getImage()).getScaledInstance(100, 50, java.awt.Image.SCALE_DEFAULT))); 
       // b=new JButton("Start game");
       // add(background);
       //background.setLayout(new FlowLayout());
        
        slider.setMinorTickSpacing(2);  
        slider.setMajorTickSpacing(10);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);  

        panel.add(nomeLabel);
        panel.add(nomeText);
        panel.add(b);
        panel.add(maschio);
        panel.add(femmina);
        panel.add(anni);
        //panel.add(slider); 
        panel.add(sfondo);
        
        b.setLayout(null);
        b.setBounds(100,100,100, 40);
        
        maschio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                sessom();
            }
        }); 
        
        maschio.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt) {
                sessof();
            }
        }); 
        
        b.addActionListener(new ActionListener(){
            @Override
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
    
    //metodo per nome
    private void takeActionPerformed(){
        i=1;
        name = nomeText.getText();
        System.out.println(name);
    }
     //metodi per il sesso
    private void sessom(){sesso="maschio";}
    private void sessof(){sesso="femmina";}

    public String getSesso() {
        return sesso;
    }
    
    public String getnome(){
        return name;
    }
    
}
