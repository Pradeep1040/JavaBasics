package org.jsp.JavaBasics;

import java.util.Scanner;

public class JavaBasics 
{
	public static void main(String[] args) 
	{
		//4. taking input from console
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the int value");
		int num = sc.nextInt();
		System.out.println(num);
		
	    System.out.println("Enter the Boolean object");
		boolean  b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter the Char value");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
		System.out.println("Enter the float value");
		float f = sc.nextFloat();
		System.out.println(f);
		
		System.out.println("Enter the Double value");
		double d = sc.nextDouble();
		System.out.println(d);
	
		//5.1 local variable 
		local();
		
		//5.2 Global Variable
		int x = 100;
		int y = 200;
		int sub;
		System.out.println("Gloabal Variable");
		System.out.println(sub = y-x);
		
		main(); // calling method using method name 
		Comment();	
	}
	public static void local() 
	{
		int x = 50;
		int y = 60;
		int sum;
		
		System.out.println("Local variable ");
		System.out.println(sum = x+y);
		
	}
	public static void main()
	{
		//6. here method name is main()
		
		System.out.println("My name is Pradeep"); // 2.print name
	}
	public static void Comment()
	{
		//3. 
		
		System.out.println("for Single line comment we use = //Single-line comment");
		System.out.println("for multi-line comment we use = /* multi-line comment*/ ");
		System.out.println("for documentation comment we use = /** documentation */");
	}

}
