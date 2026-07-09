package module2;
//write a program to call parent class method

//together with child class method in case of method overriding

class Parent_40 {
	void display() {
		System.out.println("This is parent class method");
	}
}

public class Assignment_40 extends Parent_40 {

	void display() {
		super.display(); // this will call parent class method
		System.out.println("this is child class method");
	}

	public static void main(String[] args) {
		Assignment_40 a = new Assignment_40();
		a.display();
	}
}
