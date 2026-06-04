package module1;

import module2.Assignment_43;

public class Assignment_43_child extends Assignment_43 {

	public static void main(String[] args) {

		Assignment_43_child a1 = new Assignment_43_child();

		System.out.println(a1.a); // non static public variable
		System.out.println(a1.b); // protected variable
		a1.method1();
		a1.method2();

	}
}
