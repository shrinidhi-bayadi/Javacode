package module1;

//write a program to check if the number is positive or negative
public class Assignment_5 

{
	public static void main(String[] args) 
	
	{
		int number=-9;
		
		System.out.println("Entered number is : "+number);
		
		if(number>0)
		{
			 System.out.println("Number is positive");
		}
		
		else if(number<0)
		{
			System.out.println("Number is negative");
		}
		
		else
			System.out.println("Number is zero");  // zero is neither positive nor negative
	}

}
