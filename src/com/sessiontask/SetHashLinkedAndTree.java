package com.sessiontask;


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetHashLinkedAndTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashSet Example.
				System.out.println("HashSet Example.");
				HashSet<String> set = new HashSet<String>();
				set.add("Saba");
				set.add("Arshil");
				set.add("Farman");
				set.add("Kavita");
				set.add("Arif");
				System.out.println("Initial Set: "+set);
				//Adding duplicate element.
				set.add("Amaan");
				System.out.println("Set after adding duplicate element Amaan: "+set);
				
				// removing specific element.
				set.remove("Farman");
				System.out.println("After removing Farman: "+set);
				
				HashSet<String> set1 = new HashSet<String>();
				set1.add("Moshin");
				set1.add("Sidrah");
				set.addAll(set1);
				System.out.println("Updated List: "+set);
				
				// removing new elements from new set
				set.removeAll(set1);
				System.out.println("After removing set1: "+set);
				
				// removing with specified condition.
				set.removeIf(str -> str.contains("Kavita"));
				System.out.println("After removing with condition: "+set);
				
				//clearing set
				set.clear();
				System.out.println("Clearing set: "+set);
				System.out.println("=======================================================================");
				
				System.out.println("LinkedHashSet Example");
				
				LinkedHashSet<String> lset = new LinkedHashSet<String>();
				lset.add("monday");
				lset.add("Tuesday");
				lset.add("wednesday");
				lset.add("thursday");
				
				System.out.println("Initial Set: "+lset);
				
				//Adding duplicate element.
				lset.add("Friday");
				System.out.println("Set after adding duplicate element Amaan: "+lset);
				
				// removing specific element.
				lset.remove("thursday");
				System.out.println("After removing thursday: "+lset);
				
				HashSet<String> set2 = new HashSet<String>();
				set2.add("Tauseef");
				set2.add("Aamir");
				lset.addAll(set2);
				System.out.println("Updated List: "+lset);
				
				// removing new elements from new set
				lset.removeAll(set2);
				System.out.println("After removing set1: "+lset);
				
				// removing with specified condition.
				lset.removeIf(str -> str.contains("Tuesday"));
				System.out.println("After removing with condition: "+lset);
				
				//clearing set
				lset.clear();
				System.out.println("Clearing set: "+lset);
				
				System.out.println("=======================================================================");
				
				System.out.println("TreeSet Example");
				
				TreeSet<String> tset = new TreeSet<String>();
				tset.add("Arsil Zunzunia");
				tset.add("Essani Mohsin");
				tset.add("Farman Ansari");
				tset.add("Mohammad Ali");
				System.out.println("Initial set: "+tset);
				
				TreeSet<Integer> Intset = new TreeSet<Integer>();
				Intset.add(67);
				Intset.add(12);
				Intset.add(45);
				Intset.add(90);
				System.out.println("Integer TreeSet: "+Intset);
				System.out.println("Highest Value: "+Intset.pollFirst());
				System.out.println("Lowest Value: "+Intset.pollLast());
				Intset.add(12);
				Intset.add(90);
				
				System.out.println("Descending set: "+Intset.descendingSet());
				System.out.println("Head set: "+Intset.headSet(45));
				System.out.println("Sub set: "+Intset.subSet(45, 90));
				System.out.println("Tail set: "+Intset.tailSet(45));

	}

}
