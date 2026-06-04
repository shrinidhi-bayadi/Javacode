package module1;

/*Write a program to categorize a person based on age: 
 If age ≥ 18 If age ≥ 60 → “Senior Citizen” Else if age ≥ 40 → “Middle-aged Adult” 
 Else → “Adult” Else If age ≥ 13 → “Teenager” Else → “Child”
 */
public class Assignment_17 {
	public static void main(String[] args) {
		int age = 45;

		System.out.println("Person's age is : " + age);

		if (age >= 18) { /* this parent if block execute only if age is >=18.Then check child
			 if else if block*/
			if (age >= 60) {
				System.out.println("Senior Citizen");
			} else if (age >= 40) {
				System.out.println("Middle aged Adult");
			} else {
				System.out.println("Adult");
			}
		} else if (age >= 13) {
			System.out.println("Teenager");
		} else {
			System.out.println("Child");
		}
	}
}
