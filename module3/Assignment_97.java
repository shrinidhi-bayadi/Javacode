package module3;

/*
Write a Java program that demonstrates  LinkedList–specific
methods clearly:
add()
get()
addFirst()
addLast()
removeFirst()
removeLast()
getFirst()
getLast()
offer()
poll()
peek()
 */
import java.util.*;

public class Assignment_97 {
	public static void main(String[] args) {
		// add()
		LinkedList<String> name = new LinkedList<String>();
		name.add("Shri");
		name.add("Maya");
		System.out.println("Linked list data is -->" + name);

		// offer()

		name.offer("Ram");
		name.offer("Priya");

		System.out.println("Linked list after Offer() --->\n" + name);

		// get()

		System.out.println("name at index 3 is  --->" + name.get(3));
        //addFirst()
		name.addFirst("Kevin");
		System.out.println("LinkedList after addFirst()-->\n" + name);
		// addLast()
		name.addLast("Carter");
		System.out.println("LinkedList after addLast()-->\n" + name);

		// getFirst()

		System.out.println("LinkedList after getFirst()-->\n" + name.getFirst());
		// getLast()

		System.out.println("LinkedList after getLast()-->\n" + name.getLast());
		// peek()
		System.out.println("Peek method output\n" + name.peek());

		// poll()

		System.out.println("Poll method output-->\n" + name.poll());

		System.out.println("LinkedList after poll()\n" + name);

		// removeFirst()

		name.removeFirst();
		System.out.println("LinkedList after removeFirst()\n" + name);

		// removeLast()

		name.removeLast();
		System.out.println("LinkedList after removeLast()\n" + name);

	}
}
