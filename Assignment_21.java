package module1;
/*"Write a Java program to demonstrate method overloading using a validateScore method.
Implement the following overloaded methods:
validateScore(int score)
Check if the score is between 0 and 100
Print ""valid score"" or ""invalid score""
validateScore(int score, int passingScore)
Check if the student passes based on passingScore
Print appropriate message
validateScore(int score, int passingScore, boolean isBonus)
Check if the student is excellent only when both:
score ≥ passingScore
bonus is true

Use logical operators to implement conditions and call all methods in main()."
*/

public class Assignment_21 {

	static void validateScore(int score) {
		System.out.println("Students Score is : " + score);
		if (score >= 0 && score <= 100) {
			System.out.println("Valid Score");
		} else {
			System.out.println("Invalid Score");
		}
	}

	static void validateScore(int score, int passingScore) {
		System.out.println("Students Score is : " + score);
		if (score >= passingScore) {
			System.out.println("Student pass");
		} else {
			System.out.println("Student fail");
		}
	}

	static void validateScore(int score, int passingScore, boolean isBonus) {
		System.out.println("Students Score is : " + score);

		if (score >= passingScore && isBonus == true) {
			System.out.println("Student is excellent");
		}

		else {
			System.out.println("Students needs to work hard");
		}
	}

	public static void main(String[] args) {
		validateScore(45);
		validateScore(78, 35);
		validateScore(8, 35, false); // method overloading means having the same method name but different parameters in the same class
	}
}
