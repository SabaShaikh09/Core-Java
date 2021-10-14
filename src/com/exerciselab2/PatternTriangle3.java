package com.exerciselab2;

import java.util.Scanner;

public class PatternTriangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		//Create a new Scanner object
		Scanner sc = new Scanner(System.in);
		
		//Get the number of the rows from the user
		System.out.println("Enter the number of rows to print the pattern");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++) {
			for (int j=1;j<=i;j++) {
				System.out.println(j +" ");
			}
		System.out.println();
		}

	}

}
