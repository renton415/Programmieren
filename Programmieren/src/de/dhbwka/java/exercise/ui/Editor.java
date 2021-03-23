package de.dhbwka.java.exercise.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Editor extends JFrame{
    JMenu datei = new JMenu("Datei");
    JMenu bearbeiten = new JMenu("Bearbeiten");

    JMenuItem neu = new JMenuItem("Neu");
    JMenuItem oeffnen = new JMenuItem("Öffnen");
    JMenuItem schliessen = new JMenuItem("Schließen");
    JMenuItem speichern = new JMenuItem("Speichern");


    public Editor(String title) {
        super(title);
        JMenuBar menubar= new JMenuBar();
        this.setJMenuBar(menubar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menubar.add(datei);
        menubar.add(bearbeiten);

        datei.add(neu);
        datei.add(oeffnen);
        datei.addSeparator();
        datei.add(schliessen);
        
        this.setSize(300, 200);
        this.setVisible(true);
    }
    
    public static void main (String[] args) {
        new Editor("Editor");
    }
}
