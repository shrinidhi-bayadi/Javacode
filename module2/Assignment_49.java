package module2;
//write a program on multiple level inheritance
interface Assighment_49_A {

	void add(int a, int b);

}

interface Assighment_49_B {

	void sub(int a, int b);

}

public class Assignment_49 implements Assighment_49_A, Assighment_49_B {

	public void add(int a, int b) {
		System.out.println("Sum is :" + (a + b));

	}

	public void sub(int a, int b) {
		System.out.println("Subtraction is : " + (a - b));
	}

	public static void main(String[] args) {
		Assignment_49 a = new Assignment_49();
		a.add(10, 20);
		a.sub(30, 5);

	}
}