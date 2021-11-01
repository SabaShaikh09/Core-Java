package com.sessiontask;

public class ObjectCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
      
		//cloning the object
	      
			PulsorBike pulsor = new PulsorBike(12.45,2500.0f,12.3,"Bajaj Pulsor");
			
			PulsorBike pulsr_0 = new PulsorBike(pulsor.weight,pulsor.price,pulsor.width,pulsor.model); //clone copy
		
			System.out.println(pulsor.hashCode());
		//	System.out.println(iphon13.hashCode());
		//	System.out.println(iphon13_0.hashCode());
			//System.out.println(iphon13_00.hashCode());
			
			
		    PulsorBike pulsr_1 = (PulsorBike) pulsor.close();
		    PulsorBike pulsr_2 = (PulsorBike) pulsor.close();
		    PulsorBike pulsr_3 = (PulsorBike) pulsor.close();
		    PulsorBike pulsr_4 = (PulsorBike) pulsor.close();
		    
			
		//	iphon13_3.height=6.2;
			
			System.out.println(pulsr_4.price);
	}

}
class PulsorBike implements Cloneable{
	double weight;
	float price;
	double width;
	String model;
	
	
	public PulsorBike(double weight, float price, double width, String model) {
		this.weight = weight;
		this.price = price;
		this.width = width;
		this.model = model;
	}

	@Override
	protected object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}