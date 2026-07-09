package module3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 
WAP on below Collections methods 

fill()	
copy()	
replaceAll()	
rotate()	
disjoint()	
addAll()	
 */
public class Assignment_91 {
	public static void main(String[] args) {

		List<Integer> marks = new ArrayList<Integer>(Arrays.asList(20, 88, 46, 11, 10));
		System.out.println("Marks-->" + marks);

		List<Integer> dest = new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14));
		System.out.println("Destinaton list before copy --> \n" + dest);
		Collections.copy(dest, marks);

		System.out.println("Destination list after Copy method -->\n" + dest);

		Collections.replaceAll(dest, 20, null);
		System.out.println("dest after replaceall method -->\n" + dest);

		List<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		boolean result = Collections.disjoint(marks, num);
		System.out.println("disjoint result -->\n" + result);

		Collections.addAll(marks, 1, 2, 3);
		System.out.println("Updated marks now -->\n" + marks);

		Collections.rotate(marks, 3);
		System.out.println("rotate right by 3 \n" + marks);
		Collections.rotate(marks, -1);

		System.out.println("rotate left by 1 \n" + marks);

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44));
		Collections.fill(l, null);
		System.out.println("Fill method -->\n" + l);

	}
}
