package module3;

import java.util.*;

/*
 * Write a java program on unmodifiable collections.

1) Create unmodifiable List, Set, and Map using Collections class.
2) Display all collections.
3) Try to modify the collections.
4) Handle UnsupportedOperationException using try-catch block.

 */
public class Assignment_92 {

	public static void main(String[] args) {

		List<Integer> rollnum = new ArrayList<Integer>();

		rollnum.add(1);
		rollnum.add(2);
		rollnum.add(3);
		rollnum.add(4);

		List<Integer> u_rollnum = Collections.unmodifiableList(rollnum);
		System.out.println("Unmodifiable List-->" + u_rollnum);
		try {
			u_rollnum.add(5);
		} catch (UnsupportedOperationException e1) {
			System.out.println("Cannot modify unmodifiable list");
		}

		Set<Character> letter = new HashSet<Character>();

		letter.add('A');
		letter.add('B');
		letter.add('C');
		Set<Character> uletter = Collections.unmodifiableSet(letter);
		System.out.println("Unmodifiable letters set -->" + uletter);

		try {
			uletter.add('D');
		}

		catch (UnsupportedOperationException e2) {
			System.out.println("Cannot modify unmodifiable Set");

		}

		Map<Integer, String> Modifiable_map = new HashMap<Integer, String>();
		Modifiable_map.put(1, "shree");
		Modifiable_map.put(2, "nidhi");
		Modifiable_map.put(3, "Ram");

		Map<Integer, String> unmodifiable_map = Collections.unmodifiableMap(Modifiable_map);

		System.out.println("Unmodifiable map-->" + unmodifiable_map);

		try {
			unmodifiable_map.remove(1, "shree");
		} catch (UnsupportedOperationException e3) {
			System.out.println("Cannot modify unmodifiable Map");

		}

	}
}
