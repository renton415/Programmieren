package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte Anzahl der Zeilen n eingeben: ");
		int n = scan.nextInt();
		System.out.println("Bitte Anzahl der Spalten m eingeben: ");
		int m = scan.nextInt();
		int[][] x = new int[n][m];
		int[][] y = new int[n][m];
		System.out.println("X:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				x[i][j] = (int) (Math.random() * 100);
				System.out.print(x[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.println("Y:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				y[i][j] = (int) (Math.random() * 100);
				System.out.print(y[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.println("X-Y:");
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				System.out.print((x[i][j] - y[i][j])+ " ");
			}
			System.out.print("\n");
		}
		scan.close();
	}

}
