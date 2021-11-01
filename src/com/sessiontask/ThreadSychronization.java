package com.sessiontask;

public class ThreadSychronization {

	public static void main(String[] args) throws InterruptedException {
		
		//create object of printer
		Printer obj = new Printer();
		obj.doPrint(2, 5);     //5 digits are added in the sequence after 2
		System.out.println(" ");
		obj.doPrint(3, 7);     // 7 digits are added in the sequence after 3
	}
}
class Printer{
	synchronized void doPrint(int obj, int n) {
		System.out.print(obj);
		for(int i = 0; i < n; i++) {
			obj++;
			System.out.print(" "+obj);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}