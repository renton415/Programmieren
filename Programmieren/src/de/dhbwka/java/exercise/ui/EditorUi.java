package de.dhbwka.java.exercise.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class EditorUi extends JFrame{
    JMenu datei = new JMenu("Datei");
    JMenu bearbeiten = new JMenu("Bearbeiten");
    JMenu sendenAn = new JMenu("Senden An");

    JMenuItem neu = new JMenuItem("Neu");
    JMenuItem oeffnen = new JMenuItem("Öffnen");
    JMenuItem schliessen = new JMenuItem("Schließen");

    JMenuItem speichern = new JMenuItem("Speichern");
    JMenuItem speichernUnter = new JMenuItem("Speichern unter...");
    JMenuItem webseite = new JMenuItem("Als Webseite speichern");
    JMenuItem suchen = new JMenuItem("Suchen");

    JMenuItem versionen = new JMenuItem("Versionen");

    JMenuItem webseitenvorschau = new JMenuItem("Webseitenvorschau");

    JMenuItem seiteEinrichten = new JMenuItem("Seite einrichten...");
    JMenuItem seitenansicht = new JMenuItem("Seitenansicht");
    JMenuItem drucken = new JMenuItem("Drucken");

    JMenuItem eigenschaften = new JMenuItem("Eigenschaften");
    
    JMenuItem file1 = new JMenuItem("bilanz_2007.doc");
    JMenuItem file2 = new JMenuItem("quartalsbericht_2008_01.doc");
    JMenuItem file3 = new JMenuItem("ziele.doc");

    JMenuItem beenden = new JMenuItem("Beenden");



    public EditorUi(String title) {
        super(title);
        JMenuBar menubar= new JMenuBar();
        this.setJMenuBar(menubar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menubar.add(datei);
        menubar.add(bearbeiten);

        sendenAn.add("E-Mail Empfänger");
        sendenAn.add("E-Mail Empfänger (zur Überarbeitung)");
        sendenAn.add("E-Mail Empfänger (als Anlage)");
        sendenAn.addSeparator();
        sendenAn.add("Verteilerempfänger");
        sendenAn.add("Onlinebesprechungsteilnehmer");
        sendenAn.add("Exchange-Ordner");
        sendenAn.add("Fax-Empfänger");
        sendenAn.addSeparator();
        sendenAn.add("Microsoft Powerpoint");

        datei.add(neu);
        datei.add(oeffnen);
        datei.addSeparator();
        datei.add(schliessen);
        datei.addSeparator();
        datei.add(speichern);
        datei.add(speichernUnter);
        datei.add(webseite);
        datei.add(suchen);
        datei.addSeparator();
        datei.add(versionen);
        datei.addSeparator();
        datei.add(webseitenvorschau);
        datei.addSeparator();
        datei.add(seiteEinrichten);
        datei.add(seitenansicht);
        datei.add(drucken);
        datei.addSeparator();
        datei.add(sendenAn);
        datei.add(eigenschaften);
        datei.addSeparator();
        datei.add(file1);
        datei.add(file2);
        datei.add(file3);
        datei.addSeparator();
        datei.add(beenden);
        
        this.setSize(800, 600);
        this.setVisible(true);
    }
    
    public static void main (String[] args) {
        new EditorUi("Editor");
    }
}
