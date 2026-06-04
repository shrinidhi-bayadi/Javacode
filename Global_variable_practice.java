package module1;

// create static global variable and update its value.

public class Global_variable_practice {

	static int number_of_days=365; //static global variable
	int age=20; //instance variable or non static global variable
	
	public static void main(String[] args) {
		
		System.out.println(number_of_days); //call directly
		
		 Global_variable_practice a=new Global_variable_practice(); //object creation
		 System.out.println(a.age);
		 
		 number_of_days=390;
		 
			System.out.println(number_of_days); //call directly
			
			 System.out.println(++a.age); // this is also correct


	}
	
}
