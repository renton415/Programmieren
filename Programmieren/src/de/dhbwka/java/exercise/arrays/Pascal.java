package de.dhbwka.java.exercise.arrays;

public class Pascal {

	public static void main(String[] args) {
		int[][] pascal = new int [10][10];
		for (int i = 0; i < 10; i++)
		{
			pascal[i][0]= 1;
		}
		for (int i = 1; i < 10; i++)
		{
			for (int j = 1; j < 10; j++)
			{
				pascal[i][j]= pascal[i-1][j-1] + pascal[i-1][j];
				if (pascal[i][j] > 0)
				{
				System.out.print(pascal[i-1][j-1]+ " ");
				}
			}
			System.out.print("\n");
		}
		
		
		

	}

}
