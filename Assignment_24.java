package module1;

import java.util.Scanner;

/*
  "Write a java program that takes user input using Scanner

Student name:
age:
marks of 3 subjects : sub1,sub2,sub3
Now calculate the total marks and average. 
Print all the output "
 */
public class Assignment_24 {

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);

		System.out.println(" Please Enter Students name : ");

		String name = s1.nextLine(); // accepts string data

		System.out.println("Enter Students age: ");
		int age = s1.nextInt();

		System.out.println("Enter Subject 1 marks :");
		int sub1 = s1.nextInt();
		System.out.println("Enter Subject 2 marks :");
		int sub2 = s1.nextInt();

		System.out.println("Enter Subject 3 marks :");
		int sub3 = s1.nextInt();

		s1.close();

		int total_marks = sub1 + sub2 + sub3; // calculate total marks
		double avg_marks = total_marks / 3.0; //calculate average marks of 3 subjects .used double to display decimals

		System.out.println("Student name : " + name);
		System.out.println("Students age  : " + age);
		System.out.println("Subject 1 marks  : " + sub1);
		System.out.println("Subject 2 marks  : " + sub2);
		System.out.println("Subject 3 marks  : " + sub3);
		System.out.println("Toatal marks : " + total_marks);
		System.out.println("Average marks : " + avg_marks);

	}
}
