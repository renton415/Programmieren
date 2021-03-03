package de.dhbwka.java.exercise.classes;

public class Account {
	private int kontonummer;
	private String name;
	private double kontostand;
	private double limit;
	
	Account (int kontonummer, String name) {
		this.kontonummer = kontonummer;
		this.name = name;
		kontostand = 0.0;
		limit = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKontostand() {
		return kontostand;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public String toString() {
		return "Konto Nr. "+kontonummer+" ("+name+"), Stand: "+kontostand +" ct, Limit "+limit+" ct";
	}
	public void einzahlung(int betrag){
		if (betrag > 0) {
			kontostand = kontostand + betrag;
		} else {
			System.out.println("Betrag muss positiv sein");
		}
	}
	public void auszahlung(int betrag){
		if (betrag > 0) {
			if ((kontostand - betrag) >= (limit * -1)) {
					kontostand = kontostand - betrag;
			} else {
			System.out.println("Deckung nicht ausreichend!");
			} 			
		} else {
			System.out.println("Betrag muss positiv sein");
		}
	}
}
