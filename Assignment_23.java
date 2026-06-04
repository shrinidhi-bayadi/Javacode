package module1;

//Write a program on combination of method overloading and constructor overloading

public class Assignment_23 {

	void add(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is : " + sum);
	}

	void add(int a, float b) {
		float sum = a + b;
		System.out.println("Sum of " + a + " and " + b + " is : " + sum);
	}

	static void add(int a, int b, int c) {

		int sum = a + b + c;
		System.out.println("Sum of " + a + " and " + b + " and " + c + " is : " + sum);
	}

	Assignment_23() {
		System.out.println("This is a constructor");
	}

	Assignment_23(int a) {
		System.out.println("Value of a is : " + a);
	}

	public static void main(String[] args) {
		Assignment_23 a1 = new Assignment_23(); // non parameterized constructor called
		a1.add(2, 3);
		a1.add(3, 2.33f);
		add(2, 3, 4); // static method , so no need of reference variable
		new Assignment_23(4); // Parameterized constructor called

	}

}
