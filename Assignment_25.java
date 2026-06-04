package module1;

import java.util.Scanner;

/*
Write a java program which takes 2 numbers a and b from user at run time and perform below operation:
Please use methods from Math class
1.square root of a
2.maximum
3.minimum
4.a*b
5.a+b
6.a-b
7.Absolute value of a
 */
public class Assignment_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of number a");
		int a = sc.nextInt();
		System.out.println("Enter value of number b");
		int b = sc.nextInt();

		System.out.println("Value of a and b : " + a + " and " + b);
		System.out.println("Square root of " + a + " is :" + Math.sqrt(a));
		System.out.println("Maximum number is :" + Math.max(a, b));
		System.out.println("Minimum number is :" + Math.min(a, b));
		System.out.println(a + " * " + b + " is : " + Math.multiplyExact(a, b));
		System.out.println(a + " + " + b + " is : " + Math.addExact(a, b));
		System.out.println(a + " - " + b + " is : " + Math.subtractExact(a, b));
		System.out.println("Absolute value of a : " + Math.abs(a));
		 sc.close();

	}
}
