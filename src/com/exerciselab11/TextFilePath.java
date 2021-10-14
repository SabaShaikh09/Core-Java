package com.exerciselab11;

import java.io.File;

public class TextFilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	   File f = new File("c:\\java", "abc.txt");
	   System.out.println("File name : "+f.getName());
	   System.out.println("Path : "+f.getPath());
	   System.out.println("Absolute path : "+f.getAbsolutePath());
	   System.out.println(f.exists()? "file exists" : "file does not exists");
	   System.out.println(f.isDirectory()? "file is a directory ": "file is not" + "a directory");
	   System.out.println(f.isFile()? "file is an ordinary file " : "file may be named ");
		 
	}

}
