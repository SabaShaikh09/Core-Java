package com.sessiontask;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Serialization {

	public static void main(String[] args) {
		List<Trainer1> trainers = new ArrayList<Trainer1>();
		
		ObjectOutputStream os = null;
		String outputfile = "Resources/cjava.db";
		
		try {
					
					os = new ObjectOutputStream(new FileOutputStream(outputfile));
					trainers.add(new Trainer1(01, "Saba", 250000, 10));
					trainers.add(new Trainer1(02, "Shaikh", 290000, 11));
					trainers.add(new Trainer1(03, "abas", 240000, 12));
					
					
					
					for(Trainer1 trainer: trainers)
						os.writeObject(trainer);
					
					System.out.println("Serialization done");
					
				}catch(Exception e) { e.printStackTrace();}
				
				
				finally {
					if(os != null)
						try {
							os.close();
						}catch(IOException e) {e.printStackTrace();}
				}
		
	}

}

