package module3;

import java.util.*;

/*
 * Write a program to demonstrate Set interface using HashSet class.
 * Perform the following operations:
1. Add elements using add() method
2. Add duplicate elements
3. Print all elements
4. Check size of Set
5. Check whether an element is present using contains()
6.Iterate using iterator() method
7.create one more set and check below methods
addAll()
containsAll()
equals()
remove()
removeAll()
clear()
isEmpty()

 */
public class Assignment_78 {
	public static void main(String[] args) {

		Set<Integer> rollno = new HashSet<Integer>();

		rollno.add(1);
		rollno.add(2);
		rollno.add(3);
		rollno.add(4);
		rollno.add(4); // this wont be added .duplicate no present in Set

		System.out.println("roll no Set : \n" + rollno);

		System.out.println("Size of rollno Set " +rollno.size());
		boolean b1 = rollno.contains(2);
		System.out.println(b1);

		Iterator<Integer> i1 = rollno.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		Set<Integer> num = new HashSet<Integer>();
		num.add(7);
		num.add(9);
		System.out.println("num Set : \n" + num);
		rollno.addAll(num);
		System.out.println("Updated rollno : \n" + rollno);
		boolean b2 = rollno.containsAll(num);
		System.out.println(b2);
		num.remove(9);
		System.out.println("Num set now:\n" + num);
		System.out.println("Rollno set now \n " + rollno);
		rollno.removeAll(num);
		System.out.println("rollno set : " + rollno);

		boolean b3 = rollno.equals(num);
		System.out.println(b3);
		num.clear();
		boolean b4 = num.isEmpty();
		System.out.println(b4);
		System.out.println(rollno.size());
	}

}