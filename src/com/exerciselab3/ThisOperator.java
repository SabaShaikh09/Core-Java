package com.exerciselab3;

public class ThisOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Student s1=new Student(10036,"Saba",18000.0f);  
	    Student s2=new Student(10038,"Sana",25000.0f);  
	    s1.display();  
	    s2.display(); 
	}

}
class Student{  
	int rollno;  
	String name;  
	float fee;  
	Student(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;  
	}  
	void display(){
		System.out.println("=========================================");
		System.out.println(rollno+" "+name+" "+fee);
		}  
}  
