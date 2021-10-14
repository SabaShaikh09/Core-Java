package com.exerciselab15;

public class MultithreadProg15_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating object of class
         MyThread t1 = new MyThread();
         
         MyThread t2 = new MyThread();
         t1.start();
         t2.start();
         
	}

}
class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Java is hot,aromatic and invigorating");
	}
}
