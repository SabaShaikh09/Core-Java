package com.exerciselab7;

import java.awt.Font;

public class FontChecking7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Font f;
		f = new Font ("Callibri" , Font.BOLD+Font.ITALIC,14);
		String font = f.getName();
		int style = f.getStyle();
		int size = f.getSize();
		boolean bold = f.isBold();
		boolean normal = f.isPlain();
		boolean italic = f.isItalic();
		
		System.out.println("Font: "+font+ "\n Style: "+style+ "\n Size: "+size+ "\n Bold: "+bold+ "\n Italic: "+italic);R
	
	}

}
