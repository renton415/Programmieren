package de.dhbwka.java.exercise.collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.GridLayout;

@SuppressWarnings("serial")
public class Library extends JFrame implements ActionListener{

    private static final String[] orderCriteria = { "Titel", "Autor", "Jahr", "Verlag" }; 
    private String filename = "books.txt";

    JPanel p1 = new JPanel(); 
    JPanel p2 = new JPanel(); 
    JPanel p3 = new JPanel();

    JLabel titleLabel = new JLabel("Titel");
    JLabel authorLabel = new JLabel("Autor");
    JLabel yearLabel = new JLabel("Jahr");
    JLabel publisherLabel = new JLabel("Verlag");

    JTextField titleField = new JTextField("",10);
    JTextField authorField = new JTextField("",20);
    JTextField yearField = new JTextField("",20);
    JTextField publisherField = new JTextField("",20);

    JButton saveBtn = new JButton("Eintrag speichern");
    JButton titleBtn = new JButton("Titel");
    JButton authorBtn = new JButton("Autor");
    JButton yearBtn = new JButton("Jahr");
    JButton publisherBtn = new JButton("Verlag");

    private List<Book> books = new ArrayList<>();

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == saveBtn) {
            books.add(new Book(titleField.getText(), authorField.getText(), Integer.parseInt(yearField.getText()), publisherField.getText()));
        } else if (e.getSource() == titleBtn)  {

        } else if (e.getSource() == authorBtn) {

        } else if (e.getSource() == yearBtn) {

        } else if (e.getSource() == publisherBtn) {

        }
    }

    Library() {
        super("Library");
        loadBooks();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(3, 1));
        //this.setLayout(new BorderLayout());

        saveBtn.addActionListener(this);
        titleBtn.addActionListener(this);
        authorBtn.addActionListener(this);
        yearBtn.addActionListener(this);
        publisherBtn.addActionListener(this);

        p1.setLayout(new GridLayout(4,2,5,5));
        p1.add(titleLabel);
        p1.add(titleField);
        p1.add(authorLabel);
        p1.add(authorField);
        p1.add(yearLabel);
        p1.add(yearField);
        p1.add(publisherLabel);
        p1.add(publisherField);

        saveBtn.addActionListener(this);
        p2.add(saveBtn);

        p3.add(new JLabel("Ausgabe sortiert:"));
        titleBtn.addActionListener(this);
        authorBtn.addActionListener(this);
        yearBtn.addActionListener(this);
        publisherBtn.addActionListener(this);
        p3.add(titleBtn);
        p3.add(authorBtn);
        p3.add(yearBtn);
        p3.add(publisherBtn);

        this.add(p1);
        this.add(p2);
        this.add(p3);
        //this.add(p1, BorderLayout.NORTH);
        //this.add(p2, BorderLayout.CENTER);
        //this.add(p3, BorderLayout.SOUTH);

        this.setSize(500, 300);
        this.setVisible(true);
    }

    public void saveBooks(String title, String author, int year, String publisher) { 
        Book book = new Book(title, author, year, publisher); 
        books.add(book); 
        try (PrintWriter pw = new PrintWriter(new FileWriter(new File(filename), true));) { 
            pw.println(book); // uses toString of Book 
        } catch (Exception ex) { 
        System.err.println("Fehler beim Schreiben: " + ex.getLocalizedMessage()); 
        } 
    } 

    public void loadBooks() {
        try (BufferedReader br = new BufferedReader(new FileReader( new File(filename)));) { 
            while (br.ready()) { 
                String[] parts = br.readLine().split(";"); 
                if (parts.length == 4) 
                books.add(new Book(parts[0], parts[1], new Integer(parts[2]), parts[3])); 
            } 
        } catch (Exception ex) { 
        System.err.println("Fehler beim Lesen: " +  
               ex.getLocalizedMessage());
        } 
    }
    public void sort(int order) { 
        Collections.sort(books, new BookComparator(order)); 
        JOptionPane.showMessageDialog(this, this, // uses toString()  
            "Bestand sortiert nach " + orderCriteria[order], 
                              JOptionPane.INFORMATION_MESSAGE); 
      } 
     
      /** All books as a single String */ 
    @Override 
    public String toString() { 
        StringBuffer output = new StringBuffer(""); 
        for (Book book : books) 
          output.append(book + System.lineSeparator()); 
        return output.toString(); 
    }
    public static void main(String[] args) {
        new Library();
    }
    
}
