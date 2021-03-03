package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class DotProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Elemente n eingeben: ");
		int n = scan.nextInt();
		int[][] x_y = new int[n][2];
		int sum = 0;
		for (int i = 0; i<x_y.length;i++)
		{
			System.out.println("Bitte x_"+i+" eingeben: ");
			x_y[i][0] = scan.nextInt();
		}
		for (int i = 0; i<x_y.length;i++)
		{
			System.out.println("Bitte y_"+i+" eingeben: ");
			x_y[i][1] = scan.nextInt();
		}
		for (int i = 0; i<x_y.length;i++)
		{
			sum += x_y[i][0] * x_y[i][1];
		}
		
		System.out.println("Das Skalarprodukt von x und y ist " + sum);
		scan.close();
	
	}

}
