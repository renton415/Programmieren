package de.dhbwka.java.exercise.ui;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TextFrame extends JFrame{


    public TextFrame(String filename, int width, int height) {
        super(filename);
        this.setLayout(new BorderLayout());
        JScrollPane jsp = new JScrollPane(new JTextArea(readFile(filename)));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(jsp);
        this.setSize(width, height);
        this.setVisible(true);
    }

        /** Read a textfile (filename) and return its content as String */
    private static String readFile(String filename) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader br = new BufferedReader( new FileReader(filename))) {
            while (br.ready())
            content.append(br.readLine()).append(System.lineSeparator());
        } catch (IOException e) {
            return "Error reading File " + filename;
        }
        return content.toString();
    }
    public static void main(String[] args) {
        try { // if (! args.length < 3) by Exception
            new TextFrame(args[0],
            Integer.parseInt(args[1]),
            Integer.parseInt(args[2]));
        } catch (Exception e) {
            System.out.println(
            "Please use: TextFrame <filename> <width> <height>\n"+
            "with an existing (relative or absolute) filename and\n"+
            "integer values for width and height.");
        }
    }
}
