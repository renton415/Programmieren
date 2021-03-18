package de.dhbwka.java.exercise.io;

import java.io.File;
import java.io.IOException;

public class Files {
    public static void main(String[] args) {
        File testDir = new File("../../myDir"); 
        testDir.mkdir(); 
        File testFile1 = new File(testDir, "foo1");
        File testFile2 = new File(testDir, "foo2");
        File testFile3 = new File(testDir, "foo3");
        try { 
            testFile1.createNewFile(); 
            testFile2.createNewFile();
            testFile3.createNewFile();
        } catch (IOException ex) { 
            ex.printStackTrace(); 
        }
        System.out.println(testDir.getAbsolutePath());
        String[] files=testDir.list();
        for (int i = 0; i<files.length; i++){
            System.out.println(files[i]);
        }
        testFile1.delete();
        testFile2.delete();
        testFile3.delete();
        testDir.delete();
    }
}
