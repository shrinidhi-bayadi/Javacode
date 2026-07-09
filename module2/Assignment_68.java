package module2;

import java.util.Scanner;

//WAP to check a String consists of how many alphabets, numeric values, spaces and special characters.
public class Assignment_68 {

	static int count_of_alpha = 0;
	static int count_of_num = 0;
	static int count_of_space = 0;
	static int counf_of_special = 0;

	public static void main(String[] args) {

		System.out.println("Enter a String :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); // Enter a String
		char[] c = s.toCharArray(); // Covert String to Char[] to use below methods

		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(c[i])) {
				count_of_alpha++;
			}
			if (Character.isDigit(c[i])) {
				count_of_num++;
			}
			if (Character.isWhitespace(c[i])) {
				count_of_space++;
			}
		}
		counf_of_special = c.length - (count_of_alpha + count_of_num + count_of_space);

		System.out.println("Count of  of Aplabets: " + count_of_alpha);
		System.out.println("Count of Numbers: " + count_of_num);

		System.out.println("Count of Space: " + count_of_space);

		System.out.println("Count of Aplabets: " + counf_of_special);

		sc.close();
	}
}
