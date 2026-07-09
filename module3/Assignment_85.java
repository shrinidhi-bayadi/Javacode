package module3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
Write a program to demonstrate Map interface using HashMap class.

Perform the following operations:

Create a HashMap of employee ID and employee name
Add elements using put() method
Add element using putIfAbsent() method
Create another HashMap and copy elements using putAll()
Remove an element using remove() method
Check whether a key is present using containsKey()
Check whether a value is present using containsValue()
Retrieve value using get() method
Check size of map using size()
Clear all elements of emp using clear() method
Check whether map is empty using isEmpty()
Explore
Traversal methods

1.keySet()
2.values()
3.entrySet()

*/

public class Assignment_85 {
	public static void main(String[] args) {

		Map<Integer, String> emp = new HashMap<Integer, String>();

		emp.put(12, "shrinidhi");
		emp.put(42, "Ramya");
		emp.put(21, "Ram");
		emp.put(52, "Justin");

		System.out.println("employee data ->\n" + emp);

		emp.putIfAbsent(72, "sham");
		System.out.println("employee data ->\n" + emp);

		Map<Integer, String> new_emp = new HashMap<Integer, String>();

		new_emp.putAll(emp);
		System.out.println("new employee data ->\n" + new_emp);

		emp.remove(42);

		System.out.println("Employee data after remove method-->\n" + emp);

		boolean b1 = emp.containsKey(21);
		System.out.println(b1);

		boolean b2 = emp.containsValue("Justin");
		System.out.println(b2);

		System.out.println(emp.get(72));

		System.out.println(emp.size());
		System.out.println(new_emp.size());

		emp.clear();
		System.out.println(emp.isEmpty());

		new_emp.replace(42, "Emily");
		System.out.println(new_emp);
		new_emp.replace(72, "sham", "Kristan");
		System.out.println(new_emp);
		
		//traversal
		
		Set<Integer> keys=new_emp.keySet();
		System.out.println(keys);
		
		Collection<String> values=new_emp.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> pair=new_emp.entrySet();
		System.out.println(pair);
		
		

	}
}
