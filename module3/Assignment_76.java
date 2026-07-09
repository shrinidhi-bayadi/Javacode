package module3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Write a program to demonstrate Iterator and ListIterator methods in ArrayList.

Store employee names in an ArrayList and perform the following operations:

1. Iterate elements using Iterator and print in forward direction
2. Iterate elements using ListIterator  and Print elements in forward and backward direction
3. Add a new element using add() method
4. Replace an element using set() method
5. Remove an element using remove() method

 */
public class Assignment_76{

	public static void main(String[] args) {

		ArrayList<String> emp_names = new ArrayList<String>();

		emp_names.add("Shrinidhi");
		emp_names.add("Ram");
		emp_names.add("Kavita");
		emp_names.add("Krish");

		System.out.println("Employees are : " + emp_names);
		// using Iterator() method

		Iterator<String> i1 = emp_names.iterator();

		System.out.println("Iteration using iterator() method : ");

		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		emp_names.add("Jack");
		System.out.println(emp_names);

		emp_names.remove(1);
		System.out.println(emp_names);

		emp_names.set(1, "Kim");
		System.out.println(emp_names); // sham replaced by Kim now

		// using ListIterator() method

		ListIterator<String> i2 = emp_names.listIterator();

		System.out.println("Forward Iteration using listIterator() method");
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}

		System.out.println("Backward Iteration using listIterator() method");

		while (i2.hasPrevious())

		{
			System.out.println(i2.previous());
		}
	}
}
