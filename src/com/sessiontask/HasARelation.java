package com.sessiontask;

public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Employee emp1 = new Employee(1001,"Saba Shaikh",34000,"Mobile App for Project Management");
		Employee emp2 = new Employee(1002,"Mohammad Ali",10000,"Mobile App for Project Management");
		
		Employee emp3 = new Employee(1003,"Sidrah Khatri",24000,"E-Commerce Web App");
		Employee emp4 = new Employee(1004,"Mohsin Essani",40000,"E-Commerce Web App");
		
		Project p1 = new Project(01,"E-Commerce Web App","Mumbai");
		Project p2 = new Project(02,"Mobile App for Project Management","Navi Mumbai");
		
		Employee[] emp = {emp1,emp2,emp3,emp4};
		Project[] proj = {p1,p2};
		
		for(Project Pro : proj) {
			if(Pro.pname == "E-Commerce Web App") {
		        Pro.show1();
			}
		}
		for(Employee Emp : emp) {
			if(Emp.esal > 25000) {
				Emp.show();
			}
		}
		
	}

}
class Employee{
	
	int eid;
	String ename;
	double esal;
	String project;
	
	public Employee(int eid, String ename, double esal, String project) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}
	
	void show() {
		System.out.println("id : "+eid);
		System.out.println("Name : "+ename);
		System.out.println("Salary : "+esal);
		System.out.println("Project : "+project);
		
	}
	
}
class Project{
	
	int pid;
	String pname;
	String plocation;
	
	public Project(int pid, String pname, String plocation) {
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	void show1() {
		System.out.println("id : "+pid);
		System.out.println("Name : "+pname);
		System.out.println("Location : "+plocation);
	}
}