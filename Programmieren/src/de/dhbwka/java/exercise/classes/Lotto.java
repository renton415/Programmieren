package de.dhbwka.java.exercise.classes;

//import java.util.Scanner;

public class Lotto {
	
	private int m, n;
	
	int[] tipps;
	int[] gezogeneZahlen; 
	java.util.Scanner scan;
	
	Lotto(int m, int n){
		this.m = m;
		this.n = n;
		tipps = new int[m];
		gezogeneZahlen  = new int[m];
		scan = new java.util.Scanner(System.in); 
	}
	
	void spiel() { 
        tippen(); 
        sortiere(tipps); 
        ziehen(); 
        sortiere(gezogeneZahlen); 
        // Test-Ausgabe 
        System.out.println(this.toString()); 
        System.out.println("Richtige: " + richtige()); 
    } 

	public void tippen() {
		boolean eingabefehler;
		for (int i = 0; i < m;i++) {
			do {
				System.out.println("Geben Sie bitte Ihren Tipp f�r die " + (i + 1) + ". Zahl ein: ");
				eingabefehler = false;
				tipps[i] = scan.nextInt();
				if (tipps[i] < 1 || tipps[i] > n) {
					System.out.println("Eingabefehler: Zahl zu gro� oder zu klein");
					eingabefehler = true;
				}
				for (int k = 0; k<i;k++) {
					if (tipps[k] == tipps[i]) {
						System.out.println("Zahl schon getippt");
						eingabefehler = true;
					}
				}
			} while (eingabefehler);
		}
	}
	
	void sortiere (int[] feld) {
		int temp; 
        boolean tausch = true; 
        while (tausch) { 
            tausch = false; 
            for (int i = 0; i < n - 1; i++) { 
                if (feld[i] > feld[i + 1]) { 
                    temp = feld[i]; 
                    feld[i] = feld[i + 1]; 
                    feld[i + 1] = temp; 
                    tausch = true; 
                } 
            } 
        } 
	}
	
	void ziehen() {
		boolean schonGezogen;
		for (int i = 0; i < m;i++) {
			do {
				schonGezogen = false;
				gezogeneZahlen[i] = (int) (Math.random() * m + 1);
				for (int k = 0; k<i;k++) {
					if (gezogeneZahlen[k] == gezogeneZahlen[i]) {
						schonGezogen = true;
					}
				}
				
			} while (schonGezogen);
		}
	}
	
	public int richtige() {
		int richtige = 0;
		 for (int i = 0; i < m; i++) { 
	            for (int k = 0; k < m; k++) { 
	                if (tipps[i] == gezogeneZahlen[k]) { 
	                    richtige++; 
	                } 
	            } 
	        } 
		 return richtige;
	}
	public String toString() {
		String str = ""; 
        if (tipps[0] != 0) { 
            str += "Tipp: "; 
            for (int i = 0; i < m; i++) { 
                str = str + tipps[i] + " "; 
            } 
            str += "\n"; 
        } 
        if (gezogeneZahlen[0] != 0) { 
            str += "Gezogene Zahlen: "; 
            for (int i = 0; i < m; i++) { 
                str = str + gezogeneZahlen[i] + " "; 
            } 
            str += "\n"; 
        } 
        return str; 
	}
	
    public static void main(String[] args) { 
        Lotto deutschesLotto = new Lotto(6, 49); 
        deutschesLotto.spiel(); 
    } 
}
