package com.exerciselab3;

public class CallByValue3_3_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Change obj = new Change();
      
      System.out.println("Before changing " +obj.data);
      obj.display(400);
      System.out.println("After changing " +obj.data);
		
	}

}

class Change{
	
	public int data = 79;
	
	void display(int data) {
		data = data+100;
	}
}
