package module2;

//write a program on 50% abstraction using class
abstract class Company_data{
	// it contains one concrete method and one abstract method . So 50% abstraction
	void company()
	{
		System.out.println("Company name is : Citi Bank");
	}
	
	abstract void salary();
	
}
public class Assignment_46 extends Company_data {

	void salary()
	{
		System.out.println("Salary of Tester is 50000rs");
	}
	public static void main(String[] args) {
		
		Assignment_46 a=new Assignment_46();
		a.company();
		a.salary();
	}
}
