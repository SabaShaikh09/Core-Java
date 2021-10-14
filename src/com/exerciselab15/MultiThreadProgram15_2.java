package com.exerciselab15;

public class MultiThreadProgram15_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread obj1 = new MyThread();
        obj1.start();
        
		MyClass thread = new MyClass();
		Thread t = new Thread(thread);
		t.start();
	}

}
class MyThread extends Thread {
	
	public void run() {
		System.out.println();
	}
}
class MyClass implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Hello!! Welcome to Saba's home");
	}
}