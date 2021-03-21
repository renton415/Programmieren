package de.dhbwka.java.exercise.methods;

import java.util.Scanner;

public class Exponentiation {
	
	double base;
	int exp;
	
	public void setBase(double base) {
		this.base = base;
	}



	public void setExp(int exp) {
		this.exp = exp;
	}
	
	static double exp(double x, int n)
	{
		if (n == 0)
		{
			return 1.0;
		}
		else {
			return x * exp(x, n-1);
		}
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Geben Sie bitte die Basis ein: ");
		double base = scan.nextDouble();
		System.out.println("Geben Sie bitte den positiven ganzzahligen Exponenten ein: ");
		int exp = scan.nextInt();
		
		System.out.println(base+"^ "+exp+" =  " + exp(base,exp));
		
		scan.close();
	}

}
