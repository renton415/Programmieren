package de.dhbwka.java.exercise.ui.editor;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileFilter;

import java.awt.event.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

@SuppressWarnings("serial")
public class Editor extends JFrame implements ActionListener{

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

    JTextPane editPane = new JTextPane();     
    JScrollPane scrollPane = new JScrollPane(editPane);

    File openFile;

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == neu) {
            editPane.removeAll();
            speichern.setEnabled(false);
            speichernUnter.setEnabled(false);
        } else if (e.getSource() == oeffnen) {
            openFile();
            speichern.setEnabled(true);
            speichernUnter.setEnabled(true);
        } else if (e.getSource() == speichern) {
            saveFile();
        } else if (e.getSource() == beenden) {

        }
    }
    private void openFile() {
        JFileChooser fc = new JFileChooser();
        FileFilter ff = new FileFilter(){
            @Override
            public boolean accept(File f) {
                return f.isDirectory() ||
                    f.getName().toLowerCase().endsWith(".txt");
            }
            @Override
            public String getDescription() {
                return "Text Files";
            }
        };
        fc.setFileFilter(ff);
        int state= fc.showOpenDialog(null);
        
        if(state== JFileChooser.APPROVE_OPTION){
            //new TextFrame(fc.getSelectedFile().getAbsolutePath(), 400, 400);
            openFile = new File(fc.getSelectedFile().getAbsolutePath());
            StringBuilder joinedContent = new StringBuilder(); 
            for (String s : readTextfile(openFile)) { 
                joinedContent.append(s).append(System.lineSeparator()); 
            }
            editPane.setText(joinedContent.toString());
        }
    }
    public static String[] readTextfile(File f) { 
        int lines = 0; 
        // Count lines first 
        try (BufferedReader br = new BufferedReader(new FileReader(f))) { 
          while (br.ready()) { 
            br.readLine(); 
            lines++; 
          } 
        } catch (IOException e) { 
          e.printStackTrace(); // ToDo: nice error handling 
        } 
        String[] result = new String[lines]; 
        lines = 0; 
        try (BufferedReader br = new BufferedReader(new FileReader(f))) { 
          while (br.ready()) { 
            result[lines++] = br.readLine(); 
          } 
        } catch (IOException e) { 
          e.printStackTrace(); // ToDo: nice error handling 
        } 
        return result; 
    }
    public void saveFile(){
        try { 
            FileWriter fw = new FileWriter(openFile, true);
            fw.write(editPane.getText());
            System.out.println(editPane.getText());
            fw.close(); 
        } catch (Exception e) { 
        
        } 
    }

    
    /** Konstruktor für den Editor.  
     *  Hier werden alle UI-Komponenten erzeugt */ 
    public Editor() { 
        /* 
         *  Hier werden auch Listener erzeugt 
         */
        super("Editor");
        this.setLayout(new BorderLayout());
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
        oeffnen.addActionListener(this);
        datei.addSeparator();
        datei.add(schliessen);
        datei.addSeparator();
        datei.add(speichern);
        speichern.setEnabled(false);
        speichern.addActionListener(this);
        datei.add(speichernUnter);
        speichernUnter.setEnabled(false);
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
        beenden.addActionListener(this);

        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.getContentPane().add(scrollPane);
        // Größe setzen und Anzeigen 
        this.setSize(640, 480); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true); 
    } 
   
    
    public static void main(String[] args) { 
        new Editor(); 
    }  
}
