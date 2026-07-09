package module2;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program to accept the values (using Scanner Class)
 of an Array in the 
runtime of int and String type. Take the size input from the user.
 */
public class Assignment_59 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of String Array");
		int a = sc.nextInt();

		String[] name = new String[a];

		int[] age = new int[a];
		for (int i = 0; i < a; i++) {
			System.out.println("Enter name :");
			name[i] = sc.next();
			System.out.println("Enter Age :");
			age[i] = sc.nextInt();
		}
		System.out.println("Name: " + Arrays.toString(name));
		System.out.println("Age: " + Arrays.toString(age));
		sc.close();
	}
}
