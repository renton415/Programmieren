package de.dhbwka.java.exercise.classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Nimmspiel nimmspiel = new Nimmspiel("Alf", "Ben");
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println(nimmspiel);
			System.out.println("Spieler " +(nimmspiel.isReihenfolge() ? "Ben" : "Alf") +": Von welchem Haufen ziehen Sie Kugeln?");
			int haufen = scan.nextInt();
			System.out.println("Spieler " +(nimmspiel.isReihenfolge() ? "Ben" : "Alf") +":  Wieviele Kugeln ziehen Sie?");
			int anzahl =  scan.nextInt();
			while (!nimmspiel.entnahme(haufen, anzahl)) {
				System.out.println("Falsche Eingabe, bitte wiederholen sie die Angaben");
				System.out.println("Spieler " +(nimmspiel.isReihenfolge() ? "Ben" : "Alf") +": Von welchem Haufen ziehen Sie Kugeln?");
				haufen = scan.nextInt();
				System.out.println("Spieler " +(nimmspiel.isReihenfolge() ? "Ben" : "Alf") +":  Wieviele Kugeln ziehen Sie?");
				anzahl =  scan.nextInt();
			}
			
		} while (nimmspiel.checkGame());
		System.out.println("Spiel beendet.");
		System.out.println("Gewonnen hat Spieler " + (nimmspiel.isReihenfolge() ? "Alf" : "Ben"));
		scan.close();
	}

}
