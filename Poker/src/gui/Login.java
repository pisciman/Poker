/* *********************************
   *   2017(c)Project made by:     * 
   *                               * 
   *          GUI Group            * 
   ******************************** */

package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 * @author d.abati
 * @author d.niculae
 * @author s.dediou
 * @author s.nicolini
 * @author a.alushi
 * @author f.metta
 * @since JDK 8.1 */

public class Login extends JFrame implements ActionListener
{
    // ATTRIBUTES
    boolean inizio=false;
    String nome;
    char sesso;
    int soldi;
    private final JLabel creds;
    private final JTextField credsField;
    private final JButton start;
    private final JPanel panel;
    private final JRadioButton[] types;
    private final JCheckBox swear;
    private final JSlider slider;
    private static boolean adult = false;
    private static boolean insert = false;
    private SpinnerModel model = new SpinnerNumberModel(200, 10, 500, 1);
    private JSpinner spinner = new JSpinner(model);

    // CONSTRUCTORS
    Login ()
    {
        super();

        this.creds = new JLabel("Inserisci il tuo nickname: ");
        this.credsField = new JTextField(20);
        this.start = new JButton("Play");
        this.panel = new JPanel();
        this.types = new JRadioButton[2];
        this.swear = new JCheckBox("Dichiaro di essere maggiorenne");
        this.slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 180);
    
        actions();
        craft();
    }
    
    // METHODS
    private void init() {
        start.setBounds(100, 100, 100, 40);
        start.setEnabled(false);
        credsField.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        
        types[0] = new JRadioButton("Sono un maschio");
        types[1] = new JRadioButton("Sono una femmina");
        
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);
        
        panel.add(creds);
        panel.add(credsField);
        credsField.getText();
        panel.add(start);
        panel.add(spinner);
        for (JRadioButton type : types) panel.add(type);
        panel.add(swear);
    }
    private void craft() {
        init();
        add(panel);
        setDefaultCloseOperation(3);
        setPreferredSize(new Dimension(350, 350));
        setResizable(false);
        setTitle("Hold'Em Poker - login");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private void actions() {
        swear.addActionListener(this);
        start.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent act) {
        if (act.getSource() == swear) adult = !adult;
        if (!credsField.getText().isEmpty()) insert = true;
        
        if (adult && insert) {
            start.setEnabled(true);
            if (act.getSource() == start) {
                try {
                    inizio=true;
                    if (types[0].isSelected()) {
                        sesso='m';
                    }else sesso='f';
                    soldi=(int) spinner.getValue();
                    nome=credsField.getText();
                    new Board("Hold'Em Poker", nome, sesso , soldi);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                dispose();
            }
        }
    }
}