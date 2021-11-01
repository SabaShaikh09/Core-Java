package com.sessiontask;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees Obj1 = new Employees(1, "Saba", 20000);
		Employees Obj2 = new Employees(2, "Sidrah", 19000);
		Employees Obj3 = new Employees(3, "Farman", 18000);
		Employees Obj4 = new Employees(4, "Moshin", 17000);
		Employees Obj5 = new Employees(5, "Aamir", 11000);
		Employees Obj6 = new Employees(6, "Arshil", 15000);
		Employees Obj7 = new Employees(7, "Tauseef", 14000);
		Employees Obj8 = new Employees(8, "Kavita", 13000);
		Employees Obj9 = new Employees(9, "Arif", 21000);
		Employees Obj10 = new Employees(10, "Ayaz", 22000);
		
		Map<Integer,Employees> map = new HashMap<Integer, Employees>();
		map.put(1, Obj1);
		map.put(2, Obj2);
		map.put(3, Obj3);
		map.put(4, Obj4);
		map.put(5, Obj5);
		map.put(6, Obj6);
		map.put(7, Obj7);
		map.put(8, Obj8);
		map.put(9, Obj9);
		map.put(10, Obj10);
		
		System.out.println("Sorted Employee List: ");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("========================================================================");
//		System.out.println("After Removing employees with salary less than 15000:");
		map.entrySet().removeIf(entry -> entry.getValue().esal < 15000);
//		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		
		System.out.println("========================================================================");
		System.out.println("New HashMap with employees having salary greater than 15000");
		Map<Integer,Employees> newMap = new HashMap<Integer, Employees>(map);
		newMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	}

}

class Employees{
	int eid;
	String ename;
	double esal;
	public Employees(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	@Override
	public String toString() {
		return " Empployee ID: "+eid+" Employee Name: "+ename+" Employee Salary: "+esal;
	}
}