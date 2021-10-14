package com.exerciselab3;

public class LabUnit3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of the class room
        Room r1 = new Room();
        r1.setData(454, "3BHK Deluxe", 250.0f, true);
        r1.displayData();
        
		
	}

}
class Room{
	int roomno;
	String roomtype;
	float roomarea;
	boolean ACmachine;
    
	void setData(int room_no , String room_type , float room_area , boolean AC_machine) {
		
		roomno = room_no;
		roomtype = room_type;
		roomarea = room_area;
		ACmachine = AC_machine;
	}
	
	void displayData()
	{
		
		System.out.println("The room #no is " +roomno);
		System.out.println("The room type is " +roomtype);
		System.out.println("The room area is " +roomarea);
		String s = (ACmachine) ? "yes" : "no";
		System.out.println("The A/C Machine needed " + s);
	}
	
	
}