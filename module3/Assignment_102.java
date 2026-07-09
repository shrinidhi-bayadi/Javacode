package module3;
/*
 * Write a Java program to demonstrate 
 * Upcasting and Downcasting (Class Type Casting).
 */

class Parent {
	void display() {
		System.out.println("This is parent method");
	}
}

class Child extends Parent {
	void show() {
		System.out.println("This is child method");
	}
}

public class Assignment_102 {
	public static void main(String[] args) {

		// upcasting

		Parent p1 = new Child();
		p1.display();

		// downcasting

		Child c1 = (Child) p1;
		c1.show();
		c1.display(); // downcasting can access both methods here
	}
}
