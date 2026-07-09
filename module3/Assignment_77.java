package module3;
import java.util.*;
/*
 * Write a program to demonstrate List interface using ArrayList class.

Store employee IDs in a List and perform the following operations:

1. Add employee IDs
2. Add one ID at index 1
3. Remove one employee ID
4. Check whether an ID is present
5. Iterate all IDs Iterator and listIterator methods
6.get() method
7. Print the  result
 */
public class Assignment_77 {
public static void main(String[] args) {
	
	List<Integer> emp_id=new ArrayList<Integer>();
	emp_id.add(111);
	emp_id.add(222);
	emp_id.add(333);
	emp_id.add(1,221);
	
	System.out.println("Employee_id : "+emp_id);
	
	emp_id.remove(3);

 System.out.println("Updated Employee id after Remove \n"+emp_id);
 
 boolean b1=emp_id.contains(111);
 System.out.println(b1);
 
 Iterator<Integer> i1=emp_id.iterator();
		 
 System.out.println("Iteration using iterator : ");
 
 while(i1.hasNext())
 {
	 System.out.println(i1.next());
 }
 
 ListIterator<Integer> i2=emp_id.listIterator();
 System.out.println("Iteration using listIterator forward : ");
 
 while(i2.hasNext())
 {
	 System.out.println(i2.next());
 }
 System.out.println("Iteration using listIterator backward : ");
while(i2.hasPrevious())
{
	System.out.println(i2.previous());
}
 System.out.println("Emp_Id at index 0 is "+emp_id.get(0));

}
}
