package de.dhbwka.java.exercise.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextfileLines {
    public static void main(String[] args) {
        try {

            FileReader fr = new FileReader("beispiel.txt");
            BufferedReader br = new BufferedReader(fr);
            int line = 0;
            String[] lines = new String[10];
            while (br.ready()) {
                lines[line] = br.readLine();
                line++;
            }
            br.close();
            for (int i = 1; i<5;i++){
                System.out.println(lines[i]);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
