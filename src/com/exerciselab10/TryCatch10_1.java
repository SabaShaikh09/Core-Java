package com.exerciselab10;

public class TryCatch10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a[] = new int[-3];
    	   System.out.println("First Element : "+a[0]);
    	   
       }
       catch(NegativeArraySizeException e) {
    	   System.out.println("Generated Exception : "+e);
    	   
       }
       System.out.println("Exit try catch block");
	}

}
