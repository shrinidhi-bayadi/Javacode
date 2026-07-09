package practice;

public class Method_Overloading {

	
	void add(int a,int b)
	{
		System.out.println("Sum : "+(a+b));
	}
	
	void add(float a,float b)
	{
		System.out.println("Sum : "+(a+b));
	}
	public static void main(String[] args) {
		Method_Overloading a1=new Method_Overloading();
		a1.add(2, 4);
		a1.add(4.5f,3.444444f);
		
	}
}
