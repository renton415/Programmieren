package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class Norm
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Elemente n eingeben: ");
		int n = scan.nextInt();
		int[] components = new int[n];
		int sum = 0;
		for (int i = 0; i<components.length;i++)
		{
			System.out.println("Bitte x_"+i+" eingeben: ");
			components[i] = scan.nextInt();
			sum += components[i] * components[i];
		}
		
		System.out.println("sum: "+ sum);
		System.out.println("Der Betrag von x ist: "+ Math.sqrt(sum));
		scan.close();
		
	}

}
