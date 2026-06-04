package module1;

//Write a program to check whether the number is divisible by both 5 and 3

public class Assignment_9 
{

	public static void main(String[] args)
	{
		int a=15;
System.out.println("Entered number is : "+a);

if((a%5==0)&&(a%3==0))
{
	System.out.println(a+" is divisible by both 5 and 3");
}

else
{
	System.out.println(a+" is not divisible by both 5 and 3");
}
	}
}
