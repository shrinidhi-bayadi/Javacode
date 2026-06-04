package module1;
//write a program to find the largest of two numbers and check if its even or odd

public class Assignment_11 {
	public static void main(String[] args) {
		int a = 50;
		int b = 10;

		System.out.println("2 numbers are : " + a + " and " + b);

		if (a > b) {
			System.out.println(a + " is the largest number");

			if (a % 2 == 0) {
				System.out.println(a + " is even number");
			} else {
				System.out.println(a + " is odd number ");
			}

		} //if condition is true then only this block will execute

		else {
			System.out.println(b + " is the largest number");

			if (b % 2 == 0) {
				System.out.println(b + " is even number");
			}

			else {
				System.out.println(b + " is odd number ");
			}

		} // if condition is falls then this else block will execute
	}

}
