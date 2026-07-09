package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to enter a String using Scanner class and iterate using Array

public class Assignment_55 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter a String : ");

		String name = sc.nextLine();

		char[] c1 = name.toCharArray();

		System.out.println(Arrays.toString(c1)); // print array

		// for iteration use for loop

		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}

		sc.close();
	}

}
