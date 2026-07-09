package module2;

import java.util.Scanner;

//WAP to check whether given number is present in an array or not
public class Assignment_64 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of Array : ");
		int size = sc.nextInt();

		int input[] = new int[size];

		System.out.println("Enter a number to check in array : ");
		int num = sc.nextInt();

		System.out.println("Enter Values of array :");
		boolean present = false;
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
			if (num == input[i]) {
				present = true;
			}
		}
		if (present) {
			System.out.println(num + " is present in array");
		} else {
			System.out.println(num + " is not present in array");
		}
		sc.close();
	}
}
