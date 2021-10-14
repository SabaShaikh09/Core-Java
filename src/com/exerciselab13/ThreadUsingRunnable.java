package com.exerciselab13;

public class ThreadUsingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Thread1 obj = new Thread1();
		Thread t2 = new Thread(obj);
		t2.start();
		
		Thread2 obj3 = new Thread2();
		Thread trd = new Thread(obj3);
		trd.start();
	}

}
class Thread1 implements Runnable{
	
	@Override
	public void run() {
		
		try {
			System.out.println("wait...."); 
			Thread.sleep(500);
		
		}catch(Exception e) {
			System.out.println("Exit...");
		}
	}
}
class Thread2 implements Runnable{
	
	@Override
	public void run() {
		
		try {
			System.out.println("Just wait...");
			Thread.sleep(500);
			
		}
		catch(Exception e) {
			System.out.println("Exited..");
		}
	}
}