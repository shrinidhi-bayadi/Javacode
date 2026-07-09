package module3;

import java.util.Scanner;

//Write a java program using finally
public class Assignment_89 {
public static void main(String[] args) {
	
	
	try
	{
		System.out.println("Enter value of 2 numbers : ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int division=a/b;
		System.out.println("Result a/b -->: "+division);
		sc.close();
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Do not enter 0 as divisor");
	}
	finally
	{
		System.out.println("Finally block is excuted now");
	}
}
}
