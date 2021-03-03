package de.dhbwka.java.exercise.arrays;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int [] fib = new int[20];
		fib[0] = 1;
		fib[1] = 1;
		System.out.println("0: " +fib[0]);
		System.out.println("1: " +fib[1]);
		for (int i = 2; i <=19;i++)
		{
			fib[i]= fib[i-1]+fib[i-2];
			System.out.println(i+": " +fib[i]);
			
		}
	}
}
