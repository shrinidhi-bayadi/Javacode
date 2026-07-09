package module2;

/*
write a program for Hierarchical level inheritance using a static and non static method in the 
different class name in the single package explorer(ex:module 2 as package name)
create one parent class named Subject
create 3 child class named English,Math,Science
each class should contain one static and one non static method


*/
public class Science_34 extends Assignment34_Hierarchical_Subject {

	// static method

	static void science11Subject() {
		System.out.println("This is Science class for 11th grade");
	}

	// non static method
	void science12Subject() {
		System.out.println("This is Science class for 12th grade");
	}

	public static void main(String[] args) {

		Science_34 a = new Science_34();
		schoolname(); // base class static method called
		a.subject(); // base class non static method called by child class object
		a.science12Subject();
		science11Subject();
		
		Math_34.math11Subject(); // call static method of other class by classname.methodname();
		Math_34 b = new Math_34();
		b.math12Subject(); // call non static method of other class by creating object of that class
		English_34 c = new English_34();
		English_34.english11Subject();// call static method of other class by classname.methodname();
		c.english12Subject();// call non static method of other class by creating object of that class
	}
}
