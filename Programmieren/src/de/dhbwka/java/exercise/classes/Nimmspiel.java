package de.dhbwka.java.exercise.classes;

public class Nimmspiel {
	
	int[] haufen = new int[2];
	
	private String player1, player2;
	
	boolean reihenfolge; //false: Spieler 1, true: Spieler2 
	
	public String getPlayer1() {
		return player1;
	}

	public String getPlayer2() {
		return player2;
	}

	public boolean isReihenfolge() {
		return reihenfolge;
	}

	public Nimmspiel(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.haufen[0] = (int) (Math.random() * 100);
		this.haufen[1] = (int) (Math.random() * 100);
	}
	
	public boolean entnahme(int haufen, int anzahl) {
		if (this.haufen[haufen-1] > 0) {
			if (this.haufen[haufen-1] >= anzahl) {
				this.haufen[haufen-1]-=anzahl;
				reihenfolge = !reihenfolge;
				return true;
			} else {
				System.out.println("Anzahl ist zu groß");
				return false;
			}
		} else {
			System.out.println("Haufen ist bereits leer");
			return false;
		}
	}
	
	public boolean checkGame() {
		if (haufen[0] == 0 && haufen[1] == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	public String toString() {
		return "Spieler: "+player1+ " und "+player2+", Haufen 1: "+haufen[0]+" Kugel(n), Haufen 2: "+haufen[1]+" Kugeln(n)";
	}

}
