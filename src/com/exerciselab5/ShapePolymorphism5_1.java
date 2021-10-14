package com.exerciselab5;

public class ShapePolymorphism5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		shape myShape = new shape(); //creating object of the superclass shape
		traingle myTraingle = new traingle(); //creating object of the subclass traingle
		circle myCircle = new circle();   //creating object of subclass circle
		square mySquare = new square();  //creating object of subclass square
		myShape.write();
		myCircle.draw();
		myTraingle.erase();
		myTraingle.write();
		mySquare.draw();
	}

}
class shape{
	public void write() {
		System.out.println("Circle,Traingle and square are the different types of Shapes");
	}
}
class circle extends shape{
	
	public void draw() {
		System.out.println("Draw the circle it has no sides and corner");
	}
	public void erase() {
		System.out.println("Now,erase the circle");
	}
}
class traingle extends shape{
	
	public void draw() {
		System.out.println("Draw the traingle it has 3 sides and 3 corners");
	}
	public void erase() {
		System.out.println("Now,erase the triangle");
	}
}
class square extends shape{
	
	public void draw() {
		System.out.println("Draw the square it has 4 sides and 4 corners");
	}
	public void erase() {
		System.out.println("Now,erase the square");
	}
}

