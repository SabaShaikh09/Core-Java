package com.sessiontask;

import java.util.Scanner;

public class ClassObjectConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		//create object in an array
		Student s[] = new Student[3];
		
		System.out.println("Enter Students details");
		for(int i=0;i<3;i++) {
			
			System.out.println("Enter Student id");
			s[i].stid = sc.nextInt();
			
			System.out.println("Enter Student name");
			s[i].name = sc.nextLine();
			
			System.out.println("Enter Student course name");
			s[i].course = sc.nextLine().toUpperCase();
			
			System.out.println("Enter Student marks");
			s[i].marks = sc.nextFloat();
			
			
		}
		
/*		Student s1 = new Student(24,"Saba","JAVA",87.0f);
		Student s2 = new Student(32,"Sabana","PYTHON",79.3f);
		Student s3 = new Student(42,"Sana","C++",67.5f);
		Student s4 = new Student(49,"Sabar","BCA",87.0f);
		Student s5 = new Student(24,"Abas","BCA",56.0f);
		
		Student[] stud = {s1,s2,s3,s4,s5}; */
		
		for(int i=0;i<s.length;i++) {
			if(s[i].marks < 50.0f && s[i].course == "BCA") {
				s[i].show();
			}
		}
		
	}

}
class Student{
	
	int stid;
	String name;
	String course;
	float marks;
	
	
	public Student(int stid, String name, String course, float marks) {

		this.stid = stid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}
	
	public void show() {
		System.out.println("Student id is : "+stid);
		System.out.println("Student name is : "+name);
		System.out.println("Student course is : "+course);
		System.out.println("Student marks are : "+marks);
		
	
	
  }
}