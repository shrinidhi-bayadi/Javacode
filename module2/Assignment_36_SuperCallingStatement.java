package module2;
//Write a program to demonstrate super calling statement using
//both parameterized and non-parameterized constructors in multilevel inheritance.
class A1 {
	A1(int a) {
		System.out.println("This is constructor 1");
	}
}

class B1 extends A1 {

	B1() {
		super(10);

		System.out.println("This is constructor 2");
	}
}

public class Assignment_36_SuperCallingStatement extends B1 {

	Assignment_36_SuperCallingStatement()
	{
		System.out.println("This is constructor 3");
	}

	public static void main(String[] args) {

		new Assignment_36_SuperCallingStatement(); /*control goes to 
		Assignment_36_SuperCallingStatement() . here super() is implicitly present
		so it calls B1() constructor which explicitly calls by super(10) A1 constructor 
		*/
		
	}
}
