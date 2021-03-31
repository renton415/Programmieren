package de.dhbwka.java.exercise.collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {
    
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(); 
        Integer addNumber = null; 
        Random r = new Random(); 
 
        // Set prevents duplicates 
        while (numbers.size() < 7) { 
        numbers.add(addNumber = r.nextInt(49) + 1); // Autoboxing 
        } 
        numbers.remove(addNumber); 
 
        for (Integer no : numbers) {
            System.out.print(no + " ");
        }
        System.out.println("Zusatzzahl: " + addNumber);
    }
    
}
