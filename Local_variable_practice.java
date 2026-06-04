package module1;

// create local variable and update it.

public class Local_variable_practice {

	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		c=50; //update directly
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		add(2,4);
	}
}
