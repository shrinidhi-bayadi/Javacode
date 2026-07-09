package module2;

import java.util.Arrays;
import java.util.Scanner;

//WAP to check if 2 Strings are Anagram 
public class Assignment_66 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String a1 = sc.next();

		System.out.println("Enter String 2: ");

		String a2 = sc.next();
		if (a1.length() != a2.length()) {
			System.out.println("2 Strings are not anagram");
		}

		else {
			char[] c1 = a1.toCharArray();
			char[] c2 = a2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			boolean b1 = Arrays.equals(c1, c2);
			if (b1) {
				System.out.println("2 Strings are Anagram");
			} else {
				System.out.println("2 Strings are not Anagram");
			}

			sc.close();
		}
	}
}