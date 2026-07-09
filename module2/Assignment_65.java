package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if 2 arrays are equal
public class Assignment_65 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array 1 :");
		int size1 = sc.nextInt();
		System.out.println("Enter Array 1: ");

		int[] array1 = new int[size1];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}

		System.out.println("Enter size of array 2 :");
		int size2 = sc.nextInt();
		System.out.println("Enter Array 2: ");
		int[] array2 = new int[size2];

		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}

		if (size1 != size2) {
			System.out.println("Arrays are not equal!!");
		} else

		{
			if (Arrays.equals(array1, array2)) {
				System.out.println("Arrays are equal ");
			} else {
				System.out.println("Arrays are not equal");
			}
		}
		sc.close();
	}
}
