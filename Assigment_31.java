package module1;

import java.util.Scanner;
//WAP  to generate fibonacci series of first n numbers

public class Assigment_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to generate fibonacci series");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		if (n == 0) {
			System.out.println("Fibonacci series is " + a);
		}

		else if (n == 1) {
			System.out.println("Fibonacci series is " + a + " " + b);
		}

		else {
			System.out.print("Fibonacci series is " + a + " " + b + " ");

			int c = 0;
			for (int i = 2; i <= n; i++) {
				c = a + b; 
				a = b; 
				b = c;
				System.out.print(c + " ");
			}
		}
		sc.close();
	}
}
