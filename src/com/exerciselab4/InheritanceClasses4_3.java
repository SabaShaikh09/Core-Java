package com.exerciselab4;

public class InheritanceClasses4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //creating an object of base class
		a obj = new a();
		obj.printMe();
		obj.getX();
		obj.setX(76);
		System.out.println(obj.getX());
//		obj.setY(54);
		
		//creating an object of derived class
		b obj1 = new b();
		obj1.printMe();
		obj1.getX();
		obj1.getY();
		obj1.setX(45);
		System.out.println(obj1.getX());
		obj1.setY(65);
		System.out.println(obj1.getY());
		
	}

}
class a{
	public int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("I am in class a and setting the value of x");
		this.x=x;
	}
	
	public void printMe(){
		System.out.println("I am a class a");
	}
}
class b extends a{
	public int y;
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getY() {
		return y;
	}
}