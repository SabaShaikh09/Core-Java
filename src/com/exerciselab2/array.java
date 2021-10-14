package com.exerciselab2;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Length of array
		
  //   int[] marks = new int[7];
  //   System.out.println(marks.length);
     
     int[] marks = {65,98,78,35,46,75,90,87};
      System.out.println(marks.length);
     
      System.out.println("==========================================");
     
     //One-dimensional array displaying the marks
     
      for (int i=0;i<marks.length;i++) {
    	  System.out.println(marks[i]);
      }
      
      System.out.println("============================================");
      
     //Two-dimensional array
     // int[][] flats = new int[2][3];
   //   flats[0][0]=101;
   //   flats[0][1]=102;
   //   flats[0][2]=103;
    //  flats[1][0]=104;
   //   flats[1][1]=105;
   //   flats[1][2]=106;
      int[][] flats = {{1,2,3,4,5},{6,7,56,45,8,9,98},{7,6,56,65}};
      //Displaying 2D array
      
      for(int x=0;x<flats.length;x++) {
    	  for(int j=0;j<flats[x].length;j++) {
    		  
    		  System.out.println(flats[x][j]);
    		  
    		  
    	  }
    	  System.out.println(" ");
      }
      
      System.out.println("==============================================");
	}

}
