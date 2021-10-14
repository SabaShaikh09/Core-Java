package com.exerciselab7;

public class RecursionProblems7_3_1 {
	
	static int facto(int n) {
		if(n==0)
			return 1;
		else
			return(n*facto(n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int i,fact=1;
		int number = 6;  //It is the number to calculate factorial
		
		fact = facto(number);
		System.out.println("Factorial of "+number+ "is:" +fact);
		
		
	}

}
