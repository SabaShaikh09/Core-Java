package com.sessiontask;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Trainer1> trainers1 = new ArrayList<Trainer1>();
 		
		ObjectOutputStream ois = null;
		String outputfile = "Resources/cjava.db";
        
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			while(true) {
				Trainer1 trainers1 = (Trainer1) ois.readObject();
				if(trainers1.getDno() == 10) {
					System.out.println("Employee ID: "+trainers1.getEid()+"\t");
					System.out.println("Employee Name: "+trainers1.getEname()+"\t");
					System.out.println("Employee Salary: "+trainers1.getEsal()+"\t");
					System.out.println("Employee DNo: "+trainers1.getDno()+"\n");
				}
			}
		}
		catch(EOFException e) {
			System.out.println("End.");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}