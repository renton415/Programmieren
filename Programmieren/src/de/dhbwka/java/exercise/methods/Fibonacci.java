package de.dhbwka.java.exercise.methods;

import java.util.Scanner;

public class Fibonacci {

    public static long fibonacci(long n) { 
        if (n <= 2) { 
            return 1; 
        } 
        return fibonacci(n - 1) + fibonacci(n - 2); 
    } 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte die Basis ein: ");
		int n = scan.nextInt();
		for (int i = 0; i<n; i++) {
			System.out.println("F( "+i+") =   "+fibonacci(i));
		}


		scan.close();
	}

}
