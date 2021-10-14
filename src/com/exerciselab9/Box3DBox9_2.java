package com.exerciselab9;

public class Box3DBox9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      box mybox = new box();   //creating object of the box
      box3D obj1 = new box3D();   //creating object of the box3D
      mybox.area();
      obj1.area(5);
      mybox.volume();
      obj1.volume(6);
		
	}

}
class box{
	
	public void area() {
		System.out.println("Find area :-");
	}
	public void volume() {
		System.out.println("Find Volume :-");
	}
}

class box3D extends box{
	
	public void area(int a) {
		System.out.println("The area of the box is = "+a*a);
	}
	
	public void volume(int r) {
		System.out.println("The volume of the box is = "+r*r*r);
	}
}