package com.exerciselab7;

import java.awt.Color;

public class ColorChecking7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Color rgb , hsb;
		rgb = new Color (187,255,199);
		int red,green,blue;
		red = rgb.getRed();
		green = rgb.getGreen();
		blue = rgb.getBlue();
		float x [] = {0.0f,0.0f,0.0f};
		rgb.RGBtoHSB(red, green, blue, x);
		System.out.println("RGB Combination");
		System.out.println("Red: "+red+ "Green: "+green+ "Blue: "+blue);
		System.out.println("Hue: "+x[0]+ "Saturation: "+x[1]+ "Brightness: "+x[2]);
		
		int r = rgb.HSBtoRGB(0.75f, 0.2375f, 0.95f);
		System.out.println("\n HSB Combination");
		System.out.println("Red, Blue and Green Combination : "+r);
				
	}

}