package module1;
/*"Create a class SmartCalculator with overloaded methods:
                calculate(int a, int b)          addition
calculate(int a, int b, int c)    addition of 3 numbers: calculate(double a, double b)    multiplication
calculate(int a, double b)       subtraction

                 In main():

                Call all methods
                Print outputs clearly"
                */

public class Assignment_19{

	void calculate(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + "  is  : " + sum);

	}

	void calculate(int a, int b, int c) {

		int sum = a + b + c;
		System.out.println("Sum of " + a + " and " + b + " and " + c + " is  : " + sum);
	}

	void calculate(double a, double b) {

		double mul = a * b;

		System.out.println("Multiplication of " + a + " and " + b + " is : " + mul);

	}

	void calculate(int a, double b) {
		double sub = a - b;
		System.out.println("Subtraction of " + a + " and  " + b + " is : " + sub);

	}

	public static void main(String[] args) {

		Assignment_19 cal = new Assignment_19(); // create object to call non static
																				// method
		cal.calculate(23, 50); // call non static method by reference variable cal
		cal.calculate(2, 30, 60);
		cal.calculate(1.2222, 2.34567897);
		cal.calculate(23, 50.22222);

	}
}
