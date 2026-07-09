package module3;

/*
Write a Java program that demonstrates  Priority Queue
methods clearly:
add()
offer()
peek()
element()
iterator()
contains()
size()
poll()
remove()
clear()
isEmpty()
 */
import java.util.*;

public class Assignment_98 {
	public static void main(String[] args) {

		PriorityQueue<Integer> marks = new PriorityQueue<Integer>();

		// add()
		marks.add(80);
		marks.add(20);
		marks.add(90);

		System.out.println("Marks Priority queue is -->\n" + marks);

		// offer()

		marks.offer(67);
		marks.offer(33);
		System.out.println("Marks after offer()-->\n" + marks);

		// peek()

		System.out.println("Marks after peek()-->\n" + marks.peek());

		// element()
		System.out.println("Marks after element()-->\n" + marks.element());
		// iterator()

		System.out.println("Iteration using iterator()");
		Iterator<Integer> i = marks.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// contains()

		boolean b1 = marks.contains(80);
		System.out.println(b1);

		// size()
		System.out.println("Marks size()-->\n" + marks.size());

		// poll()
		marks.poll();
		System.out.println("Priority Queue after poll()-->\n" + marks);

		// remove()
		marks.remove();
		System.out.println("Priority Queue after remove()-->\n" + marks);
		// clear()

		marks.clear();
		// isEmpty()
		System.out.println("Check Priority queue empty or not -->\n" + marks.isEmpty());

	}
}
