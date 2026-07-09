package practice;

public class MethodOverloading_ConstrucorOverloading {

	MethodOverloading_ConstrucorOverloading()
	{
		System.out.println("this is constructor 1");
	}
	
	
	MethodOverloading_ConstrucorOverloading(int a)
	{
		System.out.println("Person's age is "+a);
	}
	
	
	void add(int a,int b)
	{
		System.out.println("Sum : "+(a+b));
	}
	
	void add(int a,int b,String name)
	{
		System.out.println(("Sum is : "+(a+b))+"\n"+"name is :"+name);
		
	} 
	
	public static void main(String[] args) {
		
		
		MethodOverloading_ConstrucorOverloading a1=new MethodOverloading_ConstrucorOverloading();
		new MethodOverloading_ConstrucorOverloading(19);
		a1.add(2, 3);
		a1.add(2, 5, "shri");
	}
}
