package module3;

import java.util.*;
import java.util.Map.Entry;

/*
 * Perform the following operations:

Create a HashMap of employee ID and employee name
Add employee records using put() method
Print all employee details
Iterate all employee IDs using keySet() and for-each loop
Iterate all employee names using values() and for-each loop
Iterate all employee key-value pairs using entrySet() and for-each loop
Iterate key-value pair using iterator()

 */
public class Assignment_86 {

	public static void main(String[] args) {

		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(1, "shri");
		emp.put(31, "Ram");
		emp.put(98, "Justin");
		emp.put(13, "Karan");
		emp.put(12, "Emma");
		System.out.println(emp);

		Set<Integer> keys = emp.keySet();

		System.out.println("Iteration using key ");
		for (Integer i : keys) {
			System.out.println(i);
		}

		System.out.println("Iteration using Values ");

		Collection<String> value = emp.values();
		for (String s : value) {
			System.out.println(s);
		}
		System.out.println("Iteration using pair ");

		Set<Entry<Integer, String>> pair = emp.entrySet();

		System.out.println("pair \n" + pair);
		for (Entry<Integer, String> p : pair) {
			System.out.println(p);
		}

		System.out.println("Iterate using iterator() ");

		Iterator<Entry<Integer, String>> it = pair.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
