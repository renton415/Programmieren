package de.dhbwka.java.exercise.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class CrossTotalFile {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl fuer Quersumme eingeben: ");
		String str = new String(scan.next());
		int sum = 0;
		for (int i = 0; i <str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println("Summe: "+sum);
		scan.close();

        String filename = "crosstotals.txt";
        try {
            Writer fWriter = new FileWriter(filename, true);
            fWriter.write("Quersumme von "+str+" ist "+sum+"\n");
            fWriter.close();
        } catch (IOException ex) {
        ex.printStackTrace();
        }
	}
}
