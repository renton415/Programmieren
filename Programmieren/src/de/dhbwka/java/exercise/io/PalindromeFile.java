package de.dhbwka.java.exercise.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class PalindromeFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte Wort eingeben: ");
        String word = scan.next();
        StringBuilder reverse = new StringBuilder(word).reverse(); // RTFM!
        System.out.println("Umgekehrt: " + reverse);
        System.out.println(word + " ist "
        + (word.equalsIgnoreCase(reverse.toString()) ? "" : "k")
        + "ein Palindrom.");
        scan.close();

        File palFile = new File("palindrome.txt");

        if (word.equalsIgnoreCase(reverse.toString())){
            try {
                Writer fWriter = new FileWriter(palFile, true);
                fWriter.write(word + "\n");
                fWriter.close();
            } catch (IOException ex) {
            ex.printStackTrace();
            }
        }

        if (palFile.exists()) {
            System.out.println("Alle bisher gefundenen Palindrome:");
            try {
                FileReader fr = new FileReader(palFile);
                BufferedReader br = new BufferedReader(fr);
                while (br.ready()) {
                    String line = br.readLine();
                    System.out.println(line);
                   }
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }


        
        

        
    }
}
