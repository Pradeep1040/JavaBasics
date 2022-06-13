package org.jsp.JavaBasics;

public class Operators
{
	public static void main(String[] args)
	{
		 Arithmethic();
		 Operators();
		 EqualOrNot();
		 Logical();
		 Relational();
		 SmallAndLarge();
		
	}
	public static void Arithmethic()
	{
	  //1.	
		System.out.println("Arithmetic Operators");
		System.out.println("----------------------");
		
		int x = 100;
		int y = 200;
		
		int sum = x+y;
		System.out.println("Addition ="+sum);
		
		int sub = x-y;
		System.out.println("Substraction ="+sub);
		
		int multi = x * y;
		System.out.println("Multiplication = "+multi);
		
		int divide = y/x;
		System.out.println("division="+divide);
		System.out.println();
		
		
		
	}
	public static void Operators()
	{
		//2.
		System.out.println("Increment and decrement Operators");
		System.out.println("---------------------------------");
		int x = 11;
		int y = 10;
		
		System.out.println("pre - increment value of x ="+ ++x);
		System.out.println("post-increment value of x ="+ x++);
		System.out.println();
		
		System.out.println("pre- decrement value of y ="+ --y);
		System.out.println("post-decrement value of y = "+ y--);
		
		System.out.println("result ");
	    System.out.println( x++ + --y + ++x + ++y - y++);	
	    System.out.println();
	}
	public static void Operator()
	{
		//3.
		int x = 'A' ;
		int y = 'A';
		
		System.out.println("Equal And Not Equal Operator");
		System.out.println("------------------------------------");
		System.out.println(x==y);
		System.out.println("equals");
		System.out.println(x != y);
		System.out.println("Not equals");
		System.out.println();
		
	}
	public static void EqualOrNot()
	{
		//4.
		int num1 = 100;
		int num2 = 200;
		
		System.out.println("Equal Or Not ");
		System.out.println("--------------------");
		System.out.println(num1 == num2 || num1 != num2);
		
		System.out.println("result = "+num1);
		System.out.println();
	}
	public static void Logical()
	{
		System.out.println("Logical Operators");
		System.out.println("----------------------------------------");
		//5.
		 // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    System.out.println();
		
		
	}
	public static void Relational()
	{
		System.out.println("Ralational Operator");
		System.out.println("------------------------------------");
		//6.
		 // create variables
	    int a = 7, b = 11;

	    // value of a and b
	    System.out.println("a is " + a + " and b is " + b);

	    // == operator
	    System.out.println(a == b);  // false

	    // != operator
	    System.out.println(a != b);  // true

	    // > operator
	    System.out.println(a > b);  // false

	    // < operator
	    System.out.println(a < b);  // true

	    // >= operator
	    System.out.println(a >= b);  // false

	    // <= operator
	    System.out.println(a <= b);  // true
	    System.out.println();
	  }
	
	public static void SmallAndLarge()
	{
		System.out.println("Small and Large");
		System.out.println("=======================");
		
		//7.
	 int x = 1;
	 int y = 10;
	 
	 if(x<y)
	 {
		 System.out.println(x +" = is Small");
	 }
	 else
	 {
		 System.out.println(y+"= is Large");
	 }
		
	}

}
