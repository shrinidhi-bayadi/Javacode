package module2;
//write a program for multilevel inheritance using a static and non static method in the 
//different class name in the single package explorer(ex:module 2 as package name)


public class Child_class_33 extends Parent_Class_33
{
	static void child_staticMethod()
	{
		System.out.println("this is child class static method");
	}
	
	 void child_nonstaticMethod()
	{
		System.out.println("this is child class non static method");
	}
	
	 public static void main(String[] args) {
		
		 {
			 //static method direct call
			 child_staticMethod();
			 parent_staticMethod();
			 grandParent_staticMethod();
			 
			 //non  static method call
			 Child_class_33 c=new Child_class_33();
			 c.child_nonstaticMethod();
			 c.parent_nonstaticMethod();
			 c.grandParent_nonstaticMethod();
			 
			 
		 }
	}
}
