package com.sessiontask;

public class DoublyLinked {

	public static void main(String[] args) {
		
		 DoublyLinkedList double_List = new DoublyLinkedList();  
		 
	        //Add nodes to the list  
	        double_List.addNode(10);  
	        double_List.addNode(20);  
	        double_List.addNode(30);  
	        double_List.addNode(40);  
	        double_List.addNode(50);  
	   
	        //print the nodes of DoublyLinkedList  
	        double_List.printNodes();

	}

}

class DoublyLinkedList {    

class Node{  
   int item;  
   Node previous;  
   Node next;  

   public Node(int item) {  
       this.item = item;  
   }  
}  
// head and tail is set to null
Node head, tail = null;  

//add a node to the list  
public void addNode(int item) {  
	
   //Create a new node  
   Node newNode = new Node(item);  

   //list is empty head and tail points new node  ,head previous will null and tail next will be null
   if(head == null) {  
       head = tail = newNode;  
       head.previous = null;  
       tail.next = null;  
   }  
   else {   
       tail.next = newNode;  
       newNode.previous = tail;  
       tail = newNode;   
       tail.next = null;  
   }  
}  

//print all the nodes of doubly linked list  
public void printNodes() {   
   Node current = head;  
   if(head == null) {  
       System.out.println("Doubly linked list is empty");  
       return;  
   }  
   System.out.println(" doubly linked list nodes : ");  
   while(current != null) {  
	   
       //Print each node and then go to next.  
       System.out.print(current.item + " ");  
       current = current.next;  
   }  
}  
}
