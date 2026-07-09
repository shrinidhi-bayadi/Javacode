package module2;

import java.util.Scanner;

/*write a program to enter a String use below methods.
1.length();
2.concat();
3.equals();
4.contains();
5.equalsIgnoreCase();
6.subString(int beginIndex);
7.Substring(int beginIndex,int endIndex);
8.trim();
9.chartAt();
10.indexOf();

*/

public class Assignment_50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String 1: ");
		String a = sc.nextLine();
		System.out.println("Enter String 2 :");
		String b = sc.nextLine();
		sc.close();
		// length of String
		System.out.println("length of String 1 is : " + (a.length()));

		System.out.println("Contatenation of " + a + b + " is " + a.concat(b));

		// check if both Strings are equal
		boolean b1 = a.equals(b);
		System.out.println(b1);
		boolean b2 = a.contains("nidhi");
		System.out.println(b2);
		// check data is same by ignoring case sensitivity
		
		boolean b3 = a.equalsIgnoreCase(b);
		System.out.println(b3);

		// print substring(int beginIndex)

		System.out.println(a.substring(2));

		// print substring(int beginIndex,int endIndex)
		System.out.println(b.substring(2, 5));

		// trim the space at the beginning or end of string
		System.out.println(a.trim());

		// print char at index
		System.out.println(a.charAt(2));

		// print index of char
		System.out.println(b.indexOf('d'));
	}
}
