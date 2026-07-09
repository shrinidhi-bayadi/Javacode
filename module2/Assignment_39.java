package module2;
//Write a program to demonstrate method overriding

class Parent_39 {

	void display() {
		System.out.println("This is parent method");//this method overridden by child class method
	}
}

public class Assignment_39 extends Parent_39 {

	void display() {
		System.out.println("This is child method"); // this method gets called
	}

	public static void main(String[] args) {
		Assignment_39 a = new Assignment_39();
		a.display();
	}
}
