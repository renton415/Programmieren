package de.dhbwka.java.exercise.ui;

import javax.swing.*;
import java.awt.FlowLayout;

public class ComponentFrame extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    
    public ComponentFrame() {
        this.setTitle("Einige Swing-Grundkomponenten");
        this.setLayout(new FlowLayout());
        this.add(new JLabel("JLabel"));
        this.add(new JTextField("JTextField"));
        this.add(new JPasswordField("JPasswordField"));
        this.add(new JButton("JButton "));
        this.add(new JToggleButton("JToggleButton"));
        this.add(new JCheckBox("JCheckBox"));

        this.add(new JComboBox(new String[] {"Item 1","Item 2","Item 3", "Item 4"}));
        ButtonGroup group = new ButtonGroup();
        for(int i=1;i<=3;i++) {
            JRadioButton rb = new JRadioButton("Radio-Button-"+i);
            group.add(rb);
            this.add(rb);
        }
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(640, 100);
        this.setVisible(true);
    }

    public static void main (String[] args) {
        new ComponentFrame();
    }
}
