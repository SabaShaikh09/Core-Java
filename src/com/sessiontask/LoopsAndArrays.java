package com.sessiontask;

import java.util.Scanner;

public class LoopsAndArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum = 0 , temp,r;
		temp = n;
        while(n>0) {
        	
        	   r=n%10; 
        	   sum=(sum*10)+r;    
        	   n=n/10;    
        	  }  
        
        	  if(temp==sum)    
        	   System.out.println("Number is palindrome number ");    
        	  else    
        	   System.out.println("Its not palindrome");    
        	
        	
        	
        }
	}




