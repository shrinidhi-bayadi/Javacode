package module3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Write a program to accept array size using Scanner and handle 
 * 1)InputMismatchException
 * 2)ArrayIndexOutOfBoundsException
 * 3)NegativeArraySizeException
 * use one try and multiple catch block here 
 */
public class Assignment_88 {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Array size : ");
			int size=sc.nextInt();
			
			int rollno[]=new int[size];
			System.out.println("Enter student roll number : ");
			for(int i=0;i<3;i++)
			{
				rollno[i]=sc.nextInt();
			}
			System.out.println("Rollnumber array--> "+Arrays.toString(rollno));
			sc.close();
		}
		
		catch(NegativeArraySizeException e1)
		{
			System.out.println("Please enter positive array size only");
		}
		
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter int rollnumber only");
		}
		
		catch(ArrayIndexOutOfBoundsException e3)
		{
			System.out.println("Please enter valid array index");
		}
	}
}
