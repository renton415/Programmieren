package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class Eratostenes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Grenze n eingeben: ");
		int limit = scan.nextInt();
		boolean[] sieve = new boolean[limit - 1];
		
		for (int i = 2; i < sieve.length;i++)
		{
			sieve[i] = true;
		}
		//int[] primes = new int[limit - 1];
		scan.close();
	}

}
