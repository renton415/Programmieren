package de.dhbwka.java.exercise.ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;


public class TextfileViewer {

    //String filename = "";
    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        javax.swing.filechooser.FileFilter ff = new FileFilter(){
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
        int state= fc.showOpenDialog(null); // Varianten öffnen / zeigen
        // int state= fc.showSaveDialog(null); // Variante speichern
        // int state = fc.showDialog(null, "Delete"); // freie Variante
        if(state== JFileChooser.APPROVE_OPTION){
            System.out.println(fc.getSelectedFile().getAbsolutePath());
            new TextFrame(fc.getSelectedFile().getAbsolutePath(), 400, 400);
        } else {
            System.out.println("No selection");
        }
    }
}
