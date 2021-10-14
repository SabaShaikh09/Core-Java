package com.exerciselab2;

public class MatrixMultOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//creating two matrices
		int a[][] = {{1,2,3},{3,2,1},{1,1,1}};
		int b[][] = {{1,2,3},{3,2,1},{1,1,1}};
		
		//creating another matrix to store the multiplication of two matrices
		int c[][] = new int[3][3];  //3 rows and 3 columns
		
		//multiplying and printing multiplication of 2 matrices
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
				System.out.println(c[i][j] +" ");  //printing matrix element
			}
			System.out.println();
		}
		
		
	}

}
