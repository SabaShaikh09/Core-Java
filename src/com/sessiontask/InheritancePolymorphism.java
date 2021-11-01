package com.sessiontask;

public class InheritancePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape s1 = new Shape();
		Circle c1 = new Circle();
		Triangle t1 = new Triangle();
		Square sq = new Square();
		s1.area();
		c1.area(7);
		t1.area(8, 4);
		sq.area(9);
		s1.draw();
		c1.draw();
		t1.draw();
	}

}
class Shape{
	
	public void area() {
		System.out.println("The formula of the area");
	}
	public void draw() {
		System.out.println("Draw the circle,triangle and square");
	}
	
}
class Circle extends Shape{
	 
	public void draw() {
		System.out.println("Draw the Circle");
	}
	
	public void area(int r) {
		System.out.println(" Circle is "+(3.14*r*r));
	}
}
class Triangle extends Shape{
	
	public void draw() {
		System.out.println("Draw the Traingle");
	}
	public void area(int b,int h) {
		System.out.println("triangle is "+(0.5*b*h));
	}
	
}
class Square extends Shape{
	
	public void draw() {
		System.out.println("Draw the Square");
	}
	public void area(int a) {
		System.out.println("square is "+(a*a));
	}
}