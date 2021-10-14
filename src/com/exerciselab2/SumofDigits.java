package com.exerciselab2;

public class SumofDigits {
	
	static int Sum(int num) {
		
		int sum = 0;
		while(num!=0) {
			sum = sum+ num%10;
			num = num/10;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    int num = 768594;
	    System.out.println("The sum of digits: "+Sum(num));
	}

}
