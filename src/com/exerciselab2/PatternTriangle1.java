package com.exerciselab2;

public class PatternTriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String k="1" , l=" " , s="1";
		int m = 0;
		int n = 5;  //if neccessary change the value of n
		
		for(int i=0;i<n;i++) {
			for(int j=1;j<m;j++) {
				l+= "0";
			}
			System.out.println(k + l + s + "\n");
			l = "";
			m += 2;
		}
			
	}

}
