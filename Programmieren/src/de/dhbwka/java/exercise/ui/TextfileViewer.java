package de.dhbwka.java.exercise.ui;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class TextfileViewer {

    String filename = "";
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
                return"Text Files";
            }
        };
        fc.setFileFilter(ff);
        int state= fc.showOpenDialog(null); // Varianten öffnen / zeigen
        // int state= fc.showSaveDialog(null); // Variante speichern
        // int state = fc.showDialog(null, "Delete"); // freie Variante
        if(state== JFileChooser.APPROVE_OPTION){
            filename = fc.getSelectedFile().getAbsolutePath();
            System.out.println(fc.getSelectedFile().getAbsolutePath());
        } else {
            System.out.println("No selection");
        }
    }
}
