package module2;

//write a program to reverse a String
import java.util.Scanner;

public class Assignment_52 {

	public static void main(String[] args) {

		System.out.println("Enter a string to Reverse: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			
			/* input=shri
			 * i=3,c=i,reverse=i;
			 * i=2,c=r,reverse=i+r=ir
			 * i=1,c=u,reverse=ir+h=irh
			 * i=0,c=a,reverse=irh+s=irhs
			 */
			reverse = reverse + c;
		}
		sc.close();
		System.out.println("Entered String is :" + input);
		System.out.println("Reversed String is :" + reverse);
	}
}
