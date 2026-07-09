package module3;

import java.util.Enumeration;
import java.util.Vector;

/*WAP to create Vector class which contains names.
1.add elements to it using add() ,addElement()
2.print all elements
3.check size and capacity of vector
4.check elements using contains()
5.Iterate using Enumeration
6.print firstElement and LastElement
7. use set method to replace -->set(3,"Ram")
8.Explore removeElement() ,removeElementAt(),insertElementAt() methods as well
*/

public class Assignment_79 {
	public static void main(String[] args) {

		Vector<String> name = new Vector<String>();
		name.add("Shri");
		name.add("nidhi");
		name.add("Jimmy");
		name.add("Lauren");
		name.add("Emily");

		System.out.println("Vector name is : \n" + name);
		System.out.println("size of Vector:  " + name.size());
		System.out.println("Capacity : " + name.capacity());

		name.addElement("Donald");
		name.addElement("MJ");
		name.addElement("TJ");

		System.out.println("Vector name is : \n" + name);
		System.out.println("size of Vector:  " + name.size());
		System.out.println("Capacity : " + name.capacity());

		boolean b1 = name.contains("Emily");
		System.out.println(b1);

		System.out.println("Iteration using Enumeration is : ");
		Enumeration<String> e1 = name.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		name.removeElement("MJ");
		System.out.println(name);
		System.out.println(name.firstElement());
		System.out.println(name.lastElement());
		name.set(3, "Ram");
		System.out.println(name);

		name.insertElementAt("Ayan", 0);
		System.out.println(name);
		name.removeElementAt(2);
		System.out.println(name);
	}

}
