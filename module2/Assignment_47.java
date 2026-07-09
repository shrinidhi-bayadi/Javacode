package module2;

/* write a program on Concrete grand parent class. abstract parent class extends grand parent class.
create abstract void add(int a,int b) method in it.
concrete child class extends abstract parent class.(multilevel inheritance.)
 call all methods inside child class main method.

*/
class GrandParent_47 {
	
	void display1()
	{
		System.out.println("This is grand parent method");
	}
}
abstract class Parent_47 extends GrandParent_47
{
	abstract void add(int a,int b);
	 void display2()
	{
		System.out.println("This is Parent abstract class concrete method");
	}
}
public class Assignment_47 extends Parent_47  {
	
	void add(int a ,int b)
	{
		int sum=a+b;
		System.out.println("sum is :"+sum);
	}
	
	void display3()
	{
		System.out.println("This is concrete child class's concrete method");
	}
	public static void main(String[] args) {
		
		Assignment_47 a=new Assignment_47();
		a.add(2, 4);
		a.display1();
		a.display2();
		a.display3();
		
	}

}
