package edu.handong.csee.java.lab13.prob5;

import java.util.Scanner;

public class Main {
	//We are going to use this method to check if m1 and m2 are the same or approximately the same
	public static boolean equals(int[][] m1, int[][] m2) {
		//This count will be used to track the number of differences
		int count = 0;
		
		//We check if the lengths of the rows are different because 
		//if they are then we can not compare them correctly
		if(m1.length != m2.length)
				return false;
		
		//After we finish the check if the lengths of the rows are different we can start checking the differences
		//between the two with this for loop
		//This for loop will iterate through every entry and check if the entry in m1 is equal to the entry in m2
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j<m1[i].length; j++) {
				//If they are not the same then we increase the count by 1 to track the differences
				if(m1[i][j] != m2[i][j])
					count++;
			}
		}
		
		//If the count of differences is less than 3 then we return true because they are approximately the same 
		if(count <= 3)
			return true;
		//else the count is greater than 3 then we return false because they are not the same because they have too many differences
		else
			return false;
	}
	
	public static void main(String[] args) {
		//n1 and n2 will be used to track the row size and column size of both arrays
		int n1, n2 = 0;
		//a Scanner is needed so that we can record the users input
		Scanner keyboard = new Scanner(System.in);
		
		//The user will be prompted to enter the row size and then it will be recorded into n1
		System.out.print("Enter row size(maximum 5): ");
		n1 = keyboard.nextInt();
		//The user will be prompted to enter the column size and then it will be recorded into n2
		System.out.print("Enter column size(maximum 5): ");
		n2 = keyboard.nextInt();
		//Using n1 and n2 we will create a 2d array with the rows and columns
		int[][] m1 = new int[n1][n2];
		
		//The user will once again be prompted to enter the row size and then it will be recorded into n1
		System.out.print("Enter row size(maximum 5)");
		n1 = keyboard.nextInt();
		//The user will once again be prompted to enter the column size and then it will be recorded into n2
		System.out.print("Enter column size(maximum 5)");
		n2 = keyboard.nextInt();
		//But this time we will use it to create a 2nd 2d array with the rows and columns provided
		int[][] m2 = new int[n1][n2];
		
		//This will prompt the user to enter in the entries for the first 2d array and it will record the user's input in
		//the respective spot in the first 2d array in order from [0][0] to [rowsize][columnsize]
		System.out.print("Enter List1: ");
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				m1[i][j] = keyboard.nextInt();
			}
		}
		//This will prompt the user to enter in the entries for the second 2d array and it will record the user's input in
		//the respective spot in the second 2d array in order from [0][0] to [rowsize][columnsize]
		System.out.print("Enter List2: ");
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				m2[i][j] = keyboard.nextInt();
			}
		}
		
		//This for loop will be used to print out every entry of the first 2d array organized how it would be in the array
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1[i].length; j++) {
				System.out.print(m1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//This for loop will be used to print out every entry of the second 2d array organized how it would be in the array
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2[i].length; j++) {
				System.out.print(m2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		//We use the equals method to check if m1 and m2 are equal and if the equals method returns true
		//Then we print out that the arrays are approximately identical otherwise we will print out that
		//they are not identical.
		if(equals(m1, m2))
			System.out.println("The two arrays are approximately identical.");
		else
			System.out.println("The two arrays are not identical.");
	}
}
