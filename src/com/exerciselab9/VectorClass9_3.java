package com.exerciselab9;

import java.util.Vector;

public class VectorClass9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //create a vector
		Vector<String>vect = new Vector<String>();
		
		//Adding elements using add() method of list
		vect.add("Saba");
		vect.add("Sidrah");
		vect.add("Ali");
	    
		//adding elements using addElement method of vector
		vect.addElement("Saba Shaikh");
		vect.addElement("Sidrah Khatri");
		vect.addElement("Ali Shaikh");
		
		System.out.println("Elements are : "+vect);
		
	}

}
