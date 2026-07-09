package practice;

public class Constructor_Overloading {

	Constructor_Overloading()
	{
		System.out.println("this is constructor 1");
		
	}
	
	Constructor_Overloading(String name)
	{
		System.out.println("Person's name is :"+name);
	}
	
	Constructor_Overloading(String name,int age)
	
	{
		System.out.println("Persons'name : "+name+ " and Age is  : "+age);
	}
	
	
	public static void main(String[] args) {
		
		
		new Constructor_Overloading();
	new	Constructor_Overloading("Shrinidhi");
	new	Constructor_Overloading("shrinidhi",30);
	}
}
