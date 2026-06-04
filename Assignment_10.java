	package module1;

// write a program to check whether a number is between 1-10,11-20 or 20 above

public class Assignment_10 {
	public static void main(String[] args) {

		int a = 0;

		System.out.println("Entered number is : " + a);
		 if (a <= 0) {
			System.out.println("Please enter valid positive number");
		 }
		if (a >= 1 && a <= 10) {
			System.out.println(a + " is in between 1-10");
		}

		 if (a >= 11 && a <= 20) {
			System.out.println(a + " is in between 11-20");
		}
		 if(a>20) {
			System.out.println("Number is greater than 20");
		}
		 
	}
}
