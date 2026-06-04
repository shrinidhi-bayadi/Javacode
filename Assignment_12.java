package module1;

/*write a program to check if a number is positive or negative or zero.if positive-check 
it is even or odd.if negative, check if it is even or odd.*/

public class Assignment_12 {

	public static void main(String[] args) {

		int number = -97;

		System.out.println("Entered number is : " + number);

		if (number > 0) {
			System.out.println("Number " + number + " is positive");
			if (number % 2 == 0) {
				System.out.println(number + " is even number");
			} else {
				System.out.println(number + " is odd number");
			}
		} // this if block will execute only if number is positive

		else if (number < 0) {
			System.out.println("Number " + number + " is negative");
			if (number % 2 == 0) {
				System.out.println(number + " is even number");
			} else {
				System.out.println(number + " is odd number");
			}
		}// this block will execute only if number is negative
		
		else
		{
			System.out.println(number+" is zero");
		}// this block will execute if the number is zero
				
	}
}
