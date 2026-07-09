package module2;

import java.util.Scanner;

// write a program to enter a String and iterate each character of string

public class Assignment_51 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :");
		
		String a=sc.next();
		
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			System.out.println(c);
		}
		sc.close();
	}

}


