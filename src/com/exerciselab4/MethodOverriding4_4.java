package com.exerciselab4;

public class MethodOverriding4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		phone obj = new Redmi();
		obj.method2();
		Samsung obj1 = new Samsung();
		obj1.method2();
		Redmi obj2 = new Redmi();
		obj2.method2();

	}
}

//Method Overriding

class phone {
	
	@Override
	public void method2() {
		System.out.println("I have a various qualitites of mobiles");
	}
}

class Samsung extends phone{
	
	@Override
	public void method2() {
		System.out.println("Hello!! My name is Samsung");
	}
}
class Redmi extends phone{
	
	@Override
	public void method2() {
		System.out.println("Hello!! My name is Redmi");
	}
}