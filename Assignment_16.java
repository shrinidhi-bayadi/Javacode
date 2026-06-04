package module1;

/* Write a program  -If marks ≥ 35 Print “Pass” If marks ≥ 75 → “Distinction” 
 Else if marks ≥ 60 → “First Class” Else → “Second Class” Else → “Fail”
 */
public class Assignment_16 {
	public static void main(String[] args) {

		int marks = 75;

		System.out.println("Student's marks : " + marks);

		if (marks >= 35) {
			System.out.println("Pass");
			if (marks >= 75) {
				System.out.println("Distinction");
			}

			else if (marks >= 60) {
				System.out.println("First Class");
			}

			else {
				System.out.println("Second class");
			}
		}

		else {
			System.out.println("Fail");
		}

	}

}
