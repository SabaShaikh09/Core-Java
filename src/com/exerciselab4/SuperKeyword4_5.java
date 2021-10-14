package com.exerciselab4;

public class SuperKeyword4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b = new B();
      b.show();
      A a = new A();
      a.show();
	}

}
class A{
	String name;
	
	void show() {
		System.out.println(name);
	}
}
class B extends A{
	String name;
	
	void show() {
		super.show();   //calling parent method
		name = "Good" ;
		System.out.prinln(b.super);
	}
}