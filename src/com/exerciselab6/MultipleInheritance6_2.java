package com.exerciselab6;

public class MultipleInheritance6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A obj = new A();
       obj.print();
       obj.show();
	}

}
interface Printable {
	void print();
}
interface Showable {
	void show();
}
class A implements Printable,Showable{
	public void print() {
		System.out.println("Print....");
	}
	public void show() {
		System.out.println("Show.....");
	}
}