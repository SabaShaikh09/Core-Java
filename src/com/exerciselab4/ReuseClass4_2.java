package com.exerciselab4;

public class ReuseClass4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		House h1 = new House();
		h1.createHouse();
		h1.displayHouse();
	}

}
class House{
	Room r;
	public void createHouse() {
		r = new Room();
	}
	public void displayHouse() {
		r.displayData();
	}
}