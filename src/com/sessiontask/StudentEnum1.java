package com.sessiontask;

import java.util.Scanner;


public class StudentEnum1 {
	int id;
	String name;
	Subject subject;
	int marks;
	

	public StudentEnum1(int id, String name, Subject subject, int marks) {
		
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}


	public static void main(String[] args) {
		
		StudentEnum1 student1 = new StudentEnum1(1011, "Saba", Subject.JAVA , 90);
		StudentEnum1 student2 = new StudentEnum1(1012, "Sabar", Subject.PYTHON , 87);
		StudentEnum1 student3 = new StudentEnum1(1013, "Sana", Subject.C , 89);
		StudentEnum1 student4 = new StudentEnum1(1014, "Abas", Subject.CPP , 78);
		
		StudentEnum1[] student = {student1,student2,student3,student4};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Subject name");
		
		String subject = sc.nextLine().toUpperCase();
		
		for(StudentEnum1 i : student) {
			if(i.subject == Subject.valueOf(subject)) {
				System.out.println("Student id :" + i.id);
				System.out.println("Student name :" + i.name);
				System.out.println("Student subject :" + i.subject);
				System.out.println("Student mark :" + i.marks);
			}
		}
		

	}
}
