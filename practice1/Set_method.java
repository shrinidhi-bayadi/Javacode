package practice1;
import java.util.*;
public class Set_method {
public static void main(String[] args) {
	
	Set<Integer> rollno=new HashSet<Integer>();
	rollno.add(1);
	rollno.add(2);
	rollno.add(3);
	
	System.out.println(rollno);
	
	//iteration 
	
	Iterator<Integer> i=rollno.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next());
	}
	
	System.out.println(rollno.contains(4));
	
	rollno.remove(2);
	System.out.println(rollno);
}
}
