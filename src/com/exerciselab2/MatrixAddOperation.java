package com.exerciselab2;

public class MatrixAddOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int[][] matrix1 = {{1,2,3},
							{4,5,6}};
		int[][] matrix2 = {{2,6,7},
							{5,4,2}};
		int[][] result = {{0,0,0},
							{0,0,0}};
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				result[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				
				System.out.println(result[i][j] +" ");
				result[i][j] = matrix1[i][j]+matrix2[i][j];
				
			}
			System.out.println("");
		}
		
		
	}

}
