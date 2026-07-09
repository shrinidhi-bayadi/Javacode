package module2;
//write a program for single level inheritance using a static and non static method in the 
//different class name in the single package explorer(ex:module 2 as package name)

public class Assignment_32_ChildClass extends Assignment_32_ParentClass {
	
	static void childstaticMethod()
	{
		System.out.println("This is static method in child class");
	}

	 void childnonstaticMethod()
	{
		System.out.println("This is non static method in child class");
	}
	
	public static void main(String[] args) {
		childstaticMethod(); //static child method direct call
		Assignment_32_ChildClass a=new Assignment_32_ChildClass(); //child class object created
		a.childnonstaticMethod(); //non static method of child class being called
		parentStaticMethod(); //parent static method called directly
		a.parentNonstaticMethod();//parent class non static method being called
		
		
		
	}

}
