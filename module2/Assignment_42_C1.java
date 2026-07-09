package module2;

public class Assignment_42_C1 {

	public static int a=100;
	protected static int b=20;
	static int c=3;
	private static int d=90;
	
	public static void display1()
	{
		System.out.println("this is public method");
	}
	protected static void display2()
	{
		System.out.println("this is protected method");
	}
	 static void display3()
	{
		System.out.println("this is default/package method");
	}
	private static void display4()
	{
		System.out.println("this is private method");
	}
	
	public static void main(String[] args) {
		
		System.out.println(d);
		display4();
		
	}
}
