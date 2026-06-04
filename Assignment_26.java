package module1;

//Write a program to call method and constructor from assignment 23

public class Assignment_26 {

	public static void main(String[] args) {
		Assignment_23 a1 = new Assignment_23(); // non parameterized constructor called .
		// Create object of Class Assignment_23
		a1.add(2, 9); // non static int add method is called from class Assignment_23
		a1.add(3, 2.399f); // non static add(int a, float b) method is called from class Assignment_23
		Assignment_23.add(9, 3, 4); // static method , so call by classname
	    new Assignment_23(4); // Parameterized constructor called

	}

}
