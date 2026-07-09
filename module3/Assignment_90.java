package module3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Write a java program on Collections methods
 * 1) sort()
 * 2) reverse()
 * 3) shuffle()
 * 4) max()
 * 5) min()
 * 6) swap()
 * 7) binarySearch()
 * 8)frequency()
 */
public class Assignment_90 {

	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(20, 44, 20, 10, 66, 99));
		System.out.println("marks are -->" + marks);

		Collections.sort(marks);
		System.out.println("Sorted marks--->" + marks);
		int index = Collections.binarySearch(marks, 66);
		System.out.println("Index of 66 is -->" + index);
		Collections.swap(marks, 0, 3);
		System.out.println("Swapped marks-->" + marks);
		Collections.reverse(marks);

		System.out.println("Reversed order marks --->" + marks);
		Collections.shuffle(marks);
		System.out.println("Shuffled marks-->" + marks);

		System.out.println("Maximun marks -->" + Collections.max(marks));
		System.out.println("Minimun marks -->" + Collections.min(marks));

		System.out.println("Frequency of 20-->" + Collections.frequency(marks, 20));

	}
}
