package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class StandardDeviation
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = 100;
		int[] array = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			array[i] = (int)(Math.random()*10);
			sum += array[i];
		}
		double avg = sum/n;
		double sum2 = 0.0;
		for (int i = 0; i<n;i++)
		{
			sum2 += Math.pow(array[i] - avg,2);
			
		}
		double sd = Math.sqrt(sum2/(n-1));
		System.out.println("Standardabweichung: "+sd);
		
	}
}
