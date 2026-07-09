package module2;

//write a program on 100% abstraction using class
abstract class Assignment_45_P {

	abstract void add(int a, int b); // no implementation

}

public class Assignment_45 extends Assignment_45_P {

	void add(int a, int b) {

		int sum = a + b;
		System.out.println("sum: " + sum);
	}

	public static void main(String[] args) {

		Assignment_45 a = new Assignment_45();
		a.add(3, 4);
	}

}