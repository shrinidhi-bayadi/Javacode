package module2;

//write a program to demonstrate access specifiers for methods and 
//variables outside the package by becoming subclass
public class Assignment_43 {

	public int a = 100;
	protected  int b = 10;
	int c = 40;
	private static int d = 20;

	public void method1() {
		System.out.println("This is non static public method");
	}

	protected  void method2() {

		System.out.println("This is  static protected method");
	}

	void method3() {
		System.out.println("This is non static pachage method");
	}

	private static void method4() {
		System.out.println("This is  static private method");
	}

}
