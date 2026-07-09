package module2;

//write a program to demonstrate access specifiers for methods and 
//variables outside the package by without becoming subclass
public class Assignment_44 {
	public int a = 100;
	protected static int b = 10;
	int c = 40;
	private static int d = 20;

	public static void method1() {
		System.out.println("This is  static public method");
	}

	protected static void method2() {

		System.out.println("This is  static protected method");
	}

	void method3() {
		System.out.println("This is non static pachage method");
	}

	private static void method4() {
		System.out.println("This is  static private method");
	}

}
