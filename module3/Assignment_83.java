package module3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
 * 
 * Write a program to demonstrate ArrayList<String>.
Perform the following operations:
Create an ArrayList of employee names
Add 5 employee names
Print all names
Sort names alphabetically ( use Collections class methods here )
Reverse the names
Check whether a particular employee name is present using contains()
shuffle names in random order  ( shuffle() method )
Create one more collection with salary
find maximum salary
find minimum salary



 */
public class Assignment_83 {

	public static void main(String[] args) {

		ArrayList<String> emp_names = new ArrayList<String>();
		emp_names.add("Emily");
		emp_names.add("Jason");
		emp_names.add("Rayan");
		emp_names.add("Camila");
		emp_names.add("Jeda");

		System.out.println("Employee names : " + emp_names);

		Collections.sort(emp_names);
		System.out.println("sorted Employee names : " + emp_names);

		Collections.reverse(emp_names);
		System.out.println("Reversed Employee names : " + emp_names);

		System.out.println(emp_names.contains("Rayan"));

		Collections.shuffle(emp_names);
		System.out.println("Shuffled employee names  : " + emp_names);

		Collection<Integer> salary = new ArrayList<Integer>();

		salary.add(10000);
		salary.add(35767);
		salary.add(20000);
		salary.add(50000);
		salary.add(60000);
		System.out.println("Employee salary : -->" + salary);
		System.out.println("Minumum salary -->" + Collections.min(salary));
		System.out.println("Maximum salary -->" + Collections.max(salary));

	}
}
