package de.dhbwka.java.exercise.io.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TextFile {

    private File f;
    String[] buffer;

    public TextFile(File f) {
        this.f = f;
        this.read();
    }
    public TextFile(String pathname) {
        this(new File(pathname));
    }
    void read(){
        int zeilen = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            for (;br.ready();zeilen++){
                 br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        buffer[zeilen] = new String();
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            for (int i = 0;br.ready();i++){
                 buffer[i] = br.readLine();
            }
            br.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    void write() {
        if (buffer != null) {
            try (PrintWriter out = new PrintWriter(new FileWriter(f))) {
                for (int i = 0; i < buffer.length; i++) {
                    out.println(buffer[i]);
                }
                
            } catch (IOException e) {
                System.err.println("Fehler beim write()");
            }
        }
    }
    int availableLines() {
        if (buffer != null) {
            return buffer.length + 1;
        } else {
            return 0;
        }
    }
    String[] getLines() {
        return buffer;
    }
    String getLine(int i) throws LineNumberOutOfBoundsException{
        if (buffer != null) {
            if (i > 0 && i<= buffer.length) {
                return buffer[i];
            } else {
                throw new LineNumberOutOfBoundsException("Falsche Eingabe bei getLine()");
            }
        } else {
            return null;
        }
    }
    void setLine(int i, String s) throws LineNumberOutOfBoundsException{
        if (buffer != null && i > 0 && i<= buffer.length) {
            buffer[i] = s;
        } else {
            throw new LineNumberOutOfBoundsException("Falsche Eingabe bei setLine()");
        }
    }
    void replaceAll(String regexp, String ersatz){
        if (buffer!= null & regexp!=null && ersatz!=null) {
            for (int i= 0; i<buffer.length; i++){
                buffer[i] = buffer[i].replaceAll(regexp, ersatz);
            }
        }
    }
    void close() {
        buffer = null;
        this.f = null;
    }
}
