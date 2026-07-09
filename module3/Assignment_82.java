package module3;

import java.util.*;

/*WAP on collection properties
add marks in to collection
Iterate using iterator()
create one more collection with numbers
explore below methods
addAll()
remove()
contains()
containsAll()
size()
removeAll()
clear()
isEmpty()
equals()
*/
public class Assignment_82 {
	public static void main(String[] args) {

		Collection<Integer> marks = new ArrayList<Integer>();
		marks.add(20);
		marks.add(50);
		marks.add(99);
		marks.add(78);

		System.out.println(" Collection marks " + marks);
		System.out.println("Iteration using iterator() is : ");
		Iterator<Integer> i1 = marks.iterator();

		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

		Collection<Integer> numbers = new ArrayList<Integer>();
		numbers.add(44);
		numbers.add(67);
		System.out.println(" Collection numbers " + numbers);

		marks.addAll(numbers);
		System.out.println("Colection marks now : " + marks);
		marks.remove(99);
		System.out.println("Collection marks after remove() " + marks);
		boolean b1 = marks.contains(78);
		System.out.println(b1);

		boolean b2 = marks.containsAll(numbers);
		System.out.println(b2);
		System.out.println("Collection Marks size  " + marks.size());
		System.out.println("Collection numbers size  " + numbers.size());

		marks.removeAll(numbers);
		System.out.println(marks);
		numbers.clear();
		System.out.println("numbers collection after clear () -->" + numbers);

		System.out.println(numbers.isEmpty());
		Collection<Integer> newnumbers = new ArrayList<Integer>();
		newnumbers.addAll(marks);
		System.out.println(marks.equals(newnumbers));

	}
}
