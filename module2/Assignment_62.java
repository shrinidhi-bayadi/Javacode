package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to enter String array and copy to another array
public class Assignment_62 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		String[] name1 = new String[size];
		System.out.println("Enter Array1 : ");
		for (int i = 0; i < size; i++) {
			name1[i] = sc.next();
		}
		String[] name2 = new String[size];

		for (int i = 0; i < size; i++) {
			name2[i] = name1[i];
		}

		System.out.println("1st Array->" + Arrays.toString(name1));
		System.out.println("Copied Array->" + Arrays.toString(name2));

		sc.close();
	}
}
