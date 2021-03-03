package de.dhbwka.java.exercise.strings;

import java.util.Scanner;

public class CrossTotal {
	
	//Scanner scan = new Scanner(System.in);
	String input = "";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Zahl für Quersumme eingeben: ");
		String str = new String(scan.next());
		int len = str.length();
		System.out.println(len);
		int sum = 0;
		for (int i = 0; i <str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println("Summe: "+sum);

	}

}
