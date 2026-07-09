package module2;

/* create an interface with 2 methods add(int a,int b) and sub(int a ,int b).Implement these methods in a class and display 
 * result
 */

interface Calculate1 {

	void add(int a, int b);

	void sub(int a, int b);

}

public class Assignment_48 implements Calculate1 {
	public void add(int a, int b) {
		System.out.println("Sum  is :" + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("Subtraction is : " + (a - b));
	}

	public static void main(String[] args) {
		Assignment_48 a = new Assignment_48();
		a.add(4, 6);
		a.sub(6, 3);

	}
}