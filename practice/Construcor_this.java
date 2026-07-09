package practice;

public class Construcor_this {

	Construcor_this()
	{ this(2,"Shri");
		System.out.println("this is default construcor");
	}
	
	Construcor_this(int a )
	{
		System.out.println("student id is "+a);
	}
	Construcor_this(int a,String name )
	{
		
		this(1);
		System.out.println("student name : "+name+"Id  "+a);
	}
	
	
	public static void main(String[] args) {
		
		new Construcor_this();
		
	}
}
