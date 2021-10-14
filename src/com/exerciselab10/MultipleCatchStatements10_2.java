package com.exerciselab10;

public class MultipleCatchStatements10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   int a[] = new int[5];
    	   a[5]= 30/0;
    	   System.out.println(a[10]);
       }
       catch(ArithmeticException e) {
    	   System.out.println("Arithmetic Exception occurs");
       }
       catch(ArrayIndexOutOfBoundsException e) {
    	   System.out.println("Array Index OutOf Bounds Exception occurs");
       }
       catch(Exception e) {
    	   System.out.println("Parent Exception occurs");
       }
       System.out.println("Exit the code");
	}

}
