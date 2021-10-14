package com.exerciselab2;

public class SortingAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Initializing an array
		 int[] arr = {34,7,6,23,54,87,4};
		 int temp = 0;
		 
		 //Displaying an array
		 System.out.println("Displaying original array:");
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 
		 //Sorting in ascending order
		 for(int i=0;i<arr.length;i++) {
			 for (int j=i+1;j<arr.length;j++) {
				 if(arr[i]>arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		System.out.println(); 
		
		//Displaying after sorting
         System.out.println("Displaying sorted array in ascending order :");
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
	}

}
