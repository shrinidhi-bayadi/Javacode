package module1;

/* Write a java program on local variable,static global variable,non static global variable(instance variable)
 * now write a method to display original  values of local,global and instance variable. update the values and print as well.
 * 
 * 
 */
public class Assignment_27 {

	static int global_var = 100;
	 int instance_var = 3;

	void display() {
		float local_var = 123.45f;

		System.out.println("Value of local variable is : " + local_var);
		System.out.println("Value of global variable is : " + global_var);
		System.out.println("Value of instance variable is : " + instance_var);
		local_var = 90; // update local variable value
		System.out.println("Updated local_variable is " + local_var);
	}

	public static void main(String[] args) {

		Assignment_27 dis = new Assignment_27();
		dis.display(); //call display non static method
		global_var = 89; // update static global variable directly
		System.out.println("updated value of global variable is : " + global_var);
		dis.instance_var = 8; // update non instance variable by creating object and call by its reference variable
		System.out.println("updated value of instance variable is : " + dis.instance_var);

	}

}
