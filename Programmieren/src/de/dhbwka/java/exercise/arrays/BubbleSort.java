package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Elemente n eingeben: ");
		int n = scan.nextInt();
		int[] x = new int[n];
		
		for (int i = 0; i<x.length;i++)
		{
			System.out.println("Zahl "+ i +" eingeben: ");
			x[i] = scan.nextInt();
		}
		boolean swapped; 
	    do { 
	      swapped = false; 
	      for (int i = 1; i < x.length; i++) { 
	        if (x[i-1]>x[i]) { 
	          int tmp = x[i-1]; 
	          x[i-1] = x[i]; 
	          x[i] = tmp; 
	          swapped = true; 
	        } 
	      } 
	    } while (swapped); 
	    System.out.print("Sortiert: "); 
	    for (int i : x) { 
	      System.out.print(i + " "); 
	    } 
	    scan.close(); 
	}

}
