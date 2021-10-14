package com.exerciselab10;

import java.io.IOException;

public class ThrowsClause {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
      try {
		  Method m = new Method();
		  m.method();
      }catch(Exception e) {
    	  System.out.println("exception handled");
      }
		  System.out.println("normal flow....");
	}

}
class Method{
	public void method()throws IOException{
		throw new IOException("device error");
	}
}