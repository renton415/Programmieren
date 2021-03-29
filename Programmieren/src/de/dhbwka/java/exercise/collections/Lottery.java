package de.dhbwka.java.exercise.collections;

import java.util.Set;
import java.util.TreeSet;

public class Lottery {
    
    private int m = 49;
    Set gezogeneZahlen;

    Lottery(){
        gezogeneZahlen = new TreeSet();

    }
    void ziehen() {
		boolean schonGezogen;
		for (int i = 0; i < m;i++) {
			do {
				
			} while (gezogeneZahlen.size() < 7);
		}
	}

    public static void main(String[] args) {
        new Lottery();
    }
    
}
