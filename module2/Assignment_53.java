package module2;

import java.util.Scanner;

//WAP to check if a string is palindrome or not
public class Assignment_53 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String input = sc.next();
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			rev = rev + c;
		}

		System.out.println("Entered String is -->" + input);

		System.out.println("Reverse of  String is -->" + rev);

		if (input.equals(rev)) {
			System.out.println(input + "  is palindrome ");
		} else {
			System.out.println(input + " is not a palindrome");
		}

		sc.close();
	}
}
