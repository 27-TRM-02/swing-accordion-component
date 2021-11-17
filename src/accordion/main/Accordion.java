package accordion.main;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tomro
 */
public class Accordion extends JPanel implements Serializable {
    
    private JButton toggleButton;
    
    private JLabel content;
    
    private boolean contentVisible;
    
    public Accordion() {
        this.setSize(200, 200);
        this.setVisible(true);
        this.toggleButton = new JButton("Show");
        this.add(this.toggleButton);
        this.content = new JLabel("Example Text");
        this.add(this.content);
        this.content.setVisible(false);
        this.contentVisible = false;
        this.toggleButton.addActionListener((a) -> {
            this.contentVisible = !this.contentVisible;
            this.content.setVisible(this.contentVisible);
            this.toggleButton.setText(!this.contentVisible ? "Show": "Hide");
        });    
    }
}
