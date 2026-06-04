package module1;

public class IfelseIfblock
{
 public static void main(String[] args)

   {
	int a=10;
	int b=20;
	int c=30;
	
	if(a<=b) //true
	{
		System.out.println("Statement 1");
	}
	else if (b<c) //true  .if both condition true, first true will execute
	{
		System.out.println("Statement 2");
	}
	
	else
	{
		System.out.println("Statement 3");
	}
	
	System.out.println("We are done");
}
}
