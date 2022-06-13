package org.jsp.JavaBasics;

import java.util.Scanner;

public class Loops 
{
	public static void main(String[] args) 
	{
		
		 print();
		 num();
		 EvenOrOdd();
		 display();
		 View();
		 Armstrong ();
		 prime ();
		 palindrome();
		 checkCase();
		 largeNo();
	}
	public static void print()
	{
	
		for(int i = 0; i<=10; i++)
		{
			System.out.println("Bright IT Career");
			
		}
		
	}
	public static void num()
	{
		int i = 1;
		while (i<=20) 
		{
			System.out.println(i);
			i++;
		}
	}
	public static  void EvenOrOdd()
	{
		int num = 20;
		
		if(num % 2 ==0)
			
			System.out.println("The entered number is even");
		
        else
    	  
		  System.out.println("The entered number is odd");


	}
	
	public static void display()
	{
		System.out.println();
		System.out.println("Even No between 10 and 100");
		System.out.println("--------------------------------------------");
		int i = 10;
		while(i<=100)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
		
		public static void View()
		{
			System.out.println();
			System.out.println("1 to 10  number using do - while loop");
			System.out.println("-----------------------------------------------");
			
			 int i=1;    
			    do{    
			        System.out.println(i);    
			    i++;    
			    }while(i<=10);  
			
		}
		public static void Armstrong ()
		{
			System.out.println();
			System.out.println("ArmStrong Number");
			System.out.println("------------------------------------------");
			
			int num = 12	;
			
			int temp = num;
			 
			int exp = numberOfDigits(num);
			System.out.println(num+" has "+exp+" digits");
		
		 	
			int sum = 0;
			while(num != 0)
			{
				int lastDigit = num%10;
				int res = power(lastDigit,exp);
				System.out.println(lastDigit+" power of "+ exp +" is "+res);
			    
				sum = sum+res;
				
				num = num/10;
			}
			System.out.println("sum"+sum);
			if(sum == temp)
			{
				System.out.println(temp+"  is armStrong!!");
			}
			else
			{
				System.out.println(temp+" is not armStrong");
			}
			
	}
		public static int numberOfDigits(int num)
		{
			int count = 0;
			while(num != 0)
			{
				num = num/10;
				count++;
			}
			return count;
			
		}
		
		public static int power(int lastDigits,int exp)
		{
			int res = 1; 
			for(int i =1; i<=exp; i++)
			 {
				 res = res*lastDigits;
			 }
			 System.out.println();
			
			return res;
		}
	    public static void  prime ()
	    {
	    	System.out.println();
	    	System.out.println("Prime no");
	    	System.out.println("--------------------------------------------");
	    	int num=7,count=0;
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(num+" is a prime no");
			}
			else
			{
			System.out.println(num+" is not a prime no");
			}
	    }
	    public static void  palindrome()
	    {
	    	System.out.println();
	    	System.out.println("Palindrome no");
	    	System.out.println("------------------------------------------");
	    
	    	//Scanner sc=new Scanner(System.in);
			//System.out.println("Enter a String value");
			//String str1=sc.next();
	    	String str1 = "madam";
	    	   
	    		String str2="";
	    		for(int i= str1.length()-1;i>=0;i--)
	    		{
	    			str2=str2+str1.charAt(i);
	    		}
	    		if(str1.equals(str2))
	    		{
	    		System.out.println(str1+ " is pallindrome");
	    		}
	    		else
	    		{
	    		System.out.println(str1+ " is not  pallindrome");
	        	}
	    }
	    
	    public static void checkCase()
	    {
	    	System.out.println("Print Gender the Value by Switch case");
	    	 char ch = 'M';
	    	    switch ('M') {
	    	      case 'M':
	    	        System.out.println("Male");
	    	        break;
	    	      case 'F':
	    	        System.out.println("Female");
	    	        break;
	    	      default:
	    	        System.out.println("Others");
	    	    }
	    }
	    
	    public static void largeNo()
	    {
	    int x = 10;
	    int y = 20;
	    int z = 30;
	    if(y>x)
	    {
	    	System.out.println(y +" is larger than "+x);
	    }
	    else if (z>y)
	    {
	    	System.out.println(z+" is larger than"+y);
	    }
	    else
	    {
	    	System.out.println(x + "small value");
	    }
}
}
	    
		
		
		









