package module2;
//write a program on constructor chaining using this calling statement
public class Assignment_37_This_Calling_Statement {

	Assignment_37_This_Calling_Statement() {
		System.out.println("This is constructor 1");
	}

	Assignment_37_This_Calling_Statement(String a) {
		this(2, 4);
		System.out.println("This is constructor 2");
	}

	Assignment_37_This_Calling_Statement(int a, int b) {
		this(2);
		System.out.println("This is constructor 3");
	}

	Assignment_37_This_Calling_Statement(int a) {
		this();
		System.out.println("This is constructor 4");
	}

	public static void main(String[] args) {

		new Assignment_37_This_Calling_Statement("shrinidhi");

	}
}
