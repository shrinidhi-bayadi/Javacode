package module1;

import java.util.Scanner;

public class Assignment_29 {

	/* WAP using for loop to 
	 1) print number 1 to n
	 2) print even number between 0 to n
	 3) print odd numbers between 1 to n
     4) print sum of first n numbers
     5) write multiplication table of n

Here enter value of  n at run time.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number n :");

		int n = sc.nextInt();

		// 1) print number 1 to n

		System.out.println("print numbers between 1 and " + n);
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 2) print even number between 0 to n
		System.out.println("Even numbers between 0 and " + n + " are :");

		for (int i = 0; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3) print odd numbers between 1 and n
		System.out.println("Odd numbers between 0 and " + n + " are :");

		for (int i = 1; i <= n; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 4) print sum of first n numbers

		System.out.print("Sum of first " + n + " numbers  :");
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

// 5) write multiplication table of n
		System.out.println("Multiplication table of " + n + " is :");

		for (int i = 1; i <= n; i++)

		{
			System.out.println(n + "*" + i + "=" + n * i);

		}
		sc.close();

	}

}
