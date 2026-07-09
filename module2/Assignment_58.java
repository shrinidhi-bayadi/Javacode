
package module2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Write a program to accept the values (using Scanner Class)
 *  of an Array in the runtime of int and String type.
 */
public class Assignment_58 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];

		int[] age = new int[5];

		for (int i = 0; i < name.length; i++) {
			System.out.println(" Enter 5 Name and Age: ");

			name[i] = sc.next();
			
			age[i] = sc.nextInt();

		}
		
		System.out.println("Name : " + Arrays.toString(name));
		System.out.println("Age : " + Arrays.toString(age));
		sc.close();
	}
}
