package module1;

// WAP to find the factorial of given number n at run time
import java.util.Scanner;
//factorial of n formula n!=n*(n-1)! which means 1*2*3*(n-1)*n
public class Assignment_30 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n");

		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("Please enter positive number only");
		} else {

			int f = 1;
			for (int i = 1; i <= n; i++) {
				f = f * i; // this logic 1*2*3*(n-1)*n
			}
			System.out.println("factorial of " + n + " is " + f);
		}
		sc.close();
	}
}
