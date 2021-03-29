package de.dhbwka.java.exercise.ui.editor;

import javax.swing.JFrame;

public class Editor extends JFrame{
    
    /** Konstruktor für den Editor.  
     *  Hier werden alle UI-Komponenten erzeugt */ 
    public Editor() { 
        /* 
         *  Hier werden auch Listener erzeugt 
         */ 
        // Größe setzen und Anzeigen 
        this.setSize(640, 480); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        this.setVisible(true); 
  } 
   
  /** Main-Methode erzeugt einen neuen Editor zum Testen */ 
  public static void main(String[] args) { 
    new Editor(); 
  }  
}
