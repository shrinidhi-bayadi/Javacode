package module3;

import java.util.*;

//WAP Set to List. Then add more elements to it and print
public class Assignment_81 {
	public static void main(String[] args) {

		Set<Integer> id = new HashSet<Integer>();
		id.add(11);
		id.add(32);
		id.add(88);
		id.add(8);
		System.out.println("Set is : " + id); // do not follow indexing

		List<Integer> l1 = new ArrayList<Integer>(id);

		System.out.println("Set to List is " + l1);

		l1.add(32);
		l1.add(90);
		System.out.println("Updated List is : " + l1); // duplicated allowed here
	}
}
