package com.exerciselab7;

public class RecusrionProblems7_3_2 {
	
		static int fibo(int n) {
			if(n<=1)
				return n;
			else
				return fibo(n-1) + fibo(n-2);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		RecusrionProblems7_3_2 f = new RecusrionProblems7_3_2();
		int n=9;
		System.out.println(fibo(n));
	}

}
