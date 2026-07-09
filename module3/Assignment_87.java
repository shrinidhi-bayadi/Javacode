package module3;

import java.util.Arrays;
import java.util.Scanner;

/*Write a program to demonstrate runtime exception (unchecked exception) using arrays
one try and one catch block
ex:NegativeArraySizeException
*/
public class Assignment_87 {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of an array ");
			int size = sc.nextInt();
			int emp_id[] = new int[size];
			System.out.println("Enter Employee_id");

			for (int i = 0; i < size; i++) {
				emp_id[i] = sc.nextInt();
			}

			System.out.println("employee_id array --> " + Arrays.toString(emp_id));
			 sc.close();
		}

		catch (NegativeArraySizeException e) {
			System.out.println("Please enter positive array size only");
		}

	}
}
 