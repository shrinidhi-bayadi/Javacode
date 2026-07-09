package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to enter an Array and copy to another array in reverse order
public class Assignment_63 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of Array ");
		int size = sc.nextInt();
		String name1[] = new String[size];

		System.out.println("Enter Array 1: ");
		for (int i = 0; i < name1.length; i++) {
			name1[i] = sc.next();
		}

		String name2[] = new String[size];

		for (int i = 0, j = name2.length - 1; i < size; i++, j--) {
			name2[j] = name1[i];
		}
		System.out.println("Array 1 is -->" + Arrays.toString(name1));
		System.out.println("Copied Array in Reverse order is -->" + Arrays.toString(name2));
		sc.close();
	}
}
