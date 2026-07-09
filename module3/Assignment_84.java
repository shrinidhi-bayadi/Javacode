package module3;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a program to demonstrate Map interface using different data types.

Perform the following operations:
Create Map using Integer and String
Create Map using String and Double
Create Map using Integer and Character
Create Map using String and Boolean
Add elements using put()
Print all Maps
 */
public class Assignment_84 {

	public static void main(String[] args) {

		Map<Integer, String> student = new HashMap<Integer, String>();

		student.put(1, "shri");
		student.put(2, "Ram");
		student.put(3, "Shiva");
		student.put(4, "Ramya");

		System.out.println("Students roll number and names are \n" + student);

		Map<String, Double> marks = new HashMap<String, Double>();
		marks.put("Shri", 99.9);
		marks.put("Ram", 86.33);
		marks.put("Shiva", 26.9);
		marks.put("Ramya", 77.9);

		System.out.println("Students name and Marks \n" + marks);

		Map<Integer, Character> grade = new HashMap<Integer, Character>();
		grade.put(1, 'A');
		grade.put(1, 'B');
		grade.put(1, 'F');
		grade.put(1, 'C');

		Map<String, Boolean> result = new HashMap<String, Boolean>();

		result.put("shri", true);
		result.put("Ram", true);
		result.put("Shiva", false);
		result.put("Ramya", true);
		System.out.println("Student and Result \n" + result);
	}
}
