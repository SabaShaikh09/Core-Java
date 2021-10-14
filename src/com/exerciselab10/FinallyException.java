package com.exerciselab10;

public class FinallyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a = 35/5;
    	   System.out.println(a);
       }
       catch(NullPointerException e) {
    	   System.out.println(e);
       }
       finally {
    	   System.out.println("Finally block is always executed");
       }
       System.out.println("Exit of code");
	}

}
