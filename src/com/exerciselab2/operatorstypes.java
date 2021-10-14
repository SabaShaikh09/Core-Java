package com.exerciselab2;

public class operatorstypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a,b,c;
      a=40;
      b=30;
      c=a+b;
      System.out.println("Addition:"+c);
      c=a-b;
      System.out.println("Substraction:"+c);
      c=a*b;
      System.out.println("Multiplication:"+c);
      c=a/b;
      System.out.println("Division:"+c);
      c=a%b;
      System.out.println("Remainder:"+c);
      a=++a;
      System.out.println("Increment operator:"+a);
      a=--a;
      System.out.println("Decrement operator:"+a);
      
      System.out.println("============================================");
      
      //Relational opearator
      System.out.println("The two operands a and b are equal ="+(a==b));
      System.out.println("The two operands a and b are not equal ="+(a!=b));
      System.out.println("The operand a is greater than b ="+(a>b));
      System.out.println("The operand a is smaller than b ="+(a<b));
      System.out.println("The operand a is greater than or equal to b ="+(a>=b));
      System.out.println("The operand a is smaller than or equal to b ="+(a<=b));
      
      System.out.println("===============================================");
      //Bitwise Operator
      c=a&b;
      System.out.println("AND of a&b ="+c);
      c=a|b;
      System.out.println("OR of a|b ="+c);
      c=a^b;
      System.out.println("Exclusive OR of a^b ="+c);
      c=a<<b;
      System.out.println("Left Shift of a<<b ="+c);
      c=a>>b;
      System.out.println("Right shift of a>>b ="+c);
      c=~a;
      System.out.println("Complement of ~a ="+c);
      
      System.out.println("================================================");
      
       //Conditional Operator
      c=(a==1)?20:50;
      System.out.println("Value of c is:"+c);
      c=(a==40)?20:50;
      System.out.println("Value of c is:"+c);
      
	}

}
