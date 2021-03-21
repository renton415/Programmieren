package de.dhbwka.java.exercise.ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import de.dhbwka.java.exercise.io.textfile.TextFile;

public class TextFrame extends JFrame{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String filename;
    int width;
    int height;

    public TextFrame(String filename, int width, int height) {
        this.setTitle(filename);
        TextFile tf = new TextFile(filename);
        String[] str = tf.getLines();
        String content = "";
        for (String line : str) {
            content+=line;
        }
        this.add(new JTextArea(content));
        this.add(new JTextArea(readFile(filename)));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(width, height);
        this.setVisible(true);
    }
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
        try {
            new TextFrame(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Bitte folgende Argumente: ");
        }
    }
}
