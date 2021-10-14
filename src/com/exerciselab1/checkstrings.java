package com.exerciselab1;

import java.util.Scanner;

public class checkstrings {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
      static String str1 , str2;
     Scanner check = new Scanner(System.in);
     
     System.out.println("Enter the first String");
     str1 = check.nextLine();
     System.out.println("Enter the second String");
     str1 = check.nextLine();
     
     if(str1.equals(str2))
    	 System.out.println("The Strings are equal");
     else
    	 System.out.println("The Strings are not equal");
    	 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st string ");
		String s1=sc.nextLine();
		System.out.println("Enter second string");
		String s2=sc.nextLine();
		System.out.println("Enter third string");
		String s3=sc.nextLine();
		//check s1 and s2 same or not
		if(s1.equalsIgnoreCase(s2))
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not equal");
		
		//check s1 and s3
		if(s1.contentEquals(s3))
			System.out.println("Strings are same");
		else
			System.out.println("Strings are not  equal");
		
    	
			
	}

}
