
package module2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * WAP to  take name and roll number at run time (Scanner class) 
 * and print Output in following format:
1 Student:
My Name is:->Ram 
My Initial is->A 
My rollNo is ->11
2 Student:
My Name is:->Sham 
My Initial is->W
My rollNo is ->53
3 Student:
My Name is:->Hari 
My Initial is->P
My rollNo is ->40

 */
public class Assignment_61 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		String[] name = new String[size];
		int[] rollNo = new int[size];
		char[] initial = new char[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Enter Student name: ");
			name[i] = sc.next();
			System.out.println("Enter Student Intitial ");
			initial[i] = sc.next().charAt(0); // string to char
			// because char is undefined in scanner class

			System.out.println("Enter RollNumber ");
			rollNo[i] = sc.nextInt();
		}
		System.out.println("Name :" + Arrays.toString(name));
		System.out.println("Roll no :" + Arrays.toString(rollNo));
		System.out.println("intial :" + Arrays.toString(initial));
		System.out.println("output");
		for (int i = 0; i < size; i++) {

			System.out.println(i + 1 + "Student:");
			System.out.println("My name is:-> " + name[i]);

			System.out.println("My Initial is ->" + initial[i]);

			System.out.println("My Rollnumber is ->" + rollNo[i]);

		}
		sc.close();
	}
}
