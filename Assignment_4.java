package module1;

// write a program on +,-,*,/,% arithmetic operators.

public class Assignment_4

{
	// write a program on +,-,*,/,% arithmetic operators.
	
	static void add()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("Addition : "+sum);
		
	}
	static void sub()
	{
		int a=15;
		int b=5;
		int sub=a-b;
	
		System.out.println("Subtraction : "+sub);
		
	}
	static void mul()
	{
		int a=20;
		int b=10;
		int mul=a*b;
		
		System.out.println("Multiplication : "+mul);
		
	}
	static void div()
	{
		int a=50;
		int b=5;
		int div=a/b;
		
		System.out.println("Division : "+div);
		
	}
	static void mod()
	{
		int a=50;
		int b=5;
		int mod=a%b;
		System.out.println("Modulus : "+mod);
		
	}
public static void main(String[] args)

{
	System.out.println("This is main method");
	add(); //call add method 
	sub();
	mul();
	div();
	mod();
	
}
}
