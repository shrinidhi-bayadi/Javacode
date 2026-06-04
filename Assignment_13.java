package module1;

/*write a program to take age as input. if age>=18, check if age>=60.
 * Else print not eligible to vote
 */
public class Assignment_13 {
	public static void main(String[] args) {

		int age = 88;
		System.out.println("Entered age is : " + age);

		if (age >= 18) {
			System.out.println("This person is eligible to vote");
			if (age >= 60) {
				System.out.println("This is senior citizen");
			}
		}

		else {
			System.out.println("This person is not eligible to vote");
		}
	}

}
