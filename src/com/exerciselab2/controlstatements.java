/**
 * 
 */
package com.exerciselab2;

public class controlstatements {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//control Statements
		
		//if statement
       int marks = 50;
       if(marks > 65)
    	   System.out.println("First Class");
       else
    	   System.out.println("Second Class");
       System.out.println("Hii welcome ,hello Saba here");
       
       System.out.println("===========================================");
       
       //while statements
       int i = 5;
       while(i<=20)
       {
    	   System.out.println(i);
    	   i=i+2;
       }
       
       System.out.println("==============================================");
       //Do-while statements
       int n = 1;
       do {
    	   System.out.println(n);
    	   n++;
    	   
       }while(n<=10);
       
       System.out.println("================================================");
       
       //Switch Statement  
       String name = "Flamingo";
       switch(name)
       {
       case "Owl":
    	   System.out.println("Night Creature");
    	   break;
       case "Eagle":
    	   System.out.println("Keen Vision");
    	   break;
       case "Pelican":
    	   System.out.println("Lives near water");
    	   break;
       case "Flamingo":
    	   System.out.println("Pretty and pink");
    	   break;
       default:
    	   System.out.println("Can Fly.");
    	   break;
       }
       System.out.println("=========================================");
      
       //print integers 5 to 10
       int x;
      for(x=5;x<=10;x++)
       {
    	   System.out.println("Java for loop example: "+x);
    	   
      }
       
	}

}
