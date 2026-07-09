package module3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//wap convert List to Set . then add more elements to it and print

public class Assignment_80 {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String> ();
	name.add("Shri");
	name.add("Ella");
	name.add("Ben");
	name.add("Santiago");
	
System.out.println("List : "+name);

Set<String> s1=new HashSet<String>(name);
System.out.println("List to Set : "+s1);
s1.add("Ben");  //this wont be added 
s1.add("Liam");
System.out.println("Updated Set  "+s1);
}
}
