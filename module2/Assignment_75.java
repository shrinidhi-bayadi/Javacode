package module2;

import java.util.ArrayList;

/*
 * Write a program to demonstrate below methods of ArrayList:
add(Integer e)
add(int Index,Integer element)
addAll(collection)
contains(Object)
containsAll()
remove(int index)
remove(Object)
removeAll(collection)
clear()
isEmpty()
get()
equals()
 */
public class Assignment_75 {
	public static void main(String[] args) {

		ArrayList<Integer> rollno = new ArrayList<Integer>();
		rollno.add(1);
		rollno.add(2);
		rollno.add(4);
		rollno.add(5);
		rollno.add(2, 3);

		System.out.println("Roll no: " + rollno);
		ArrayList<Integer> newroll = new ArrayList<Integer>();
		newroll.addAll(rollno);

		boolean a = rollno.equals(newroll);
		System.out.println(a);

		ArrayList<String> name = new ArrayList<String>();
		name.add("Shrinidhi");
		name.add("Ram");
		name.add("Sham");
		name.add("Julia");
		name.add(1, "Karan");

		System.out.println("Names: " + name);
		ArrayList<String> newstudents = new ArrayList<String>();

		newstudents.add("Ramya");
		newstudents.add("Kavita");
		name.addAll(newstudents);

		System.out.println("New students : " + newstudents);
		System.out.println("Names updated : " + name);

		boolean b1 = name.contains("Julia");
		System.out.println(b1);

		boolean b2 = name.containsAll(newstudents);
		System.out.println(b2);

		name.remove(2);
		System.out.println(name);
		name.remove("Ramya");
		System.out.println(name);
		name.removeAll(newstudents);
		System.out.println(name);

		rollno.clear();
		System.out.println(rollno);

		boolean b3 = rollno.isEmpty();
		System.out.println(b3);

		System.out.println("New Roll numbers are: ");
		for (int i = 0; i < newroll.size(); i++) {
			System.out.println(newroll.get(i));
		}
		System.out.println("New Rollno" + newroll);
		System.out.println(newroll.get(3));

	}
}
