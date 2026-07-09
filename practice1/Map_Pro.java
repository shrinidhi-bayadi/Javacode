package practice1;
import java.util.*;
import java.util.Map.Entry;

/*
 * Write a program to demonstrate Map interface using HashMap class.

Perform the following operations:

Create a HashMap of employee ID and employee name
Add elements using put() method
Add element using putIfAbsent() method
Create another HashMap and copy elements using putAll()
Remove an element using remove() method
Check whether a key is present using containsKey()
Check whether a value is present using containsValue()
Retrieve value using get() method
Check size of map using size()
Clear all elements of emp using clear() method
Check whether map is empty using isEmpty()
Explore
Traversal methods
1.keySet()
2.values()
3.entrySet()
 */
public class Map_Pro {
public static void main(String[] args) {
	
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(1, "Ram");
	m.put(12, "Emily");
	m.put(15, "Carter");
	m.put(11, "kevin");
	
	System.out.println("Map-->\n"+m);
	
	System.out.println(m.containsKey(15));

	Map<Integer,String> n=new HashMap<Integer,String>();
n.putAll(m);
System.out.println("Map-->\n"+n);
n.putIfAbsent(9, "Jeda");
System.out.println(n);
n.remove(1);
System.out.println("Map-->\n"+n);
n.remove(12, "Ram");
System.out.println("Map-->\n"+n);

System.out.println(m.containsKey(1));
System.out.println(m.containsValue("Kevin"));
System.out.println(m.get(1));



//traverse

Set<Integer>keys=m.keySet();

System.out.println("travese");
for(Integer i:m.keySet())
{
	System.out.println(i);
}

System.out.println(keys);

Collection<String> values=m.values();
System.out.println(values);
for(String s:m.values())
{
	System.out.println(s);
}
Set<Entry<Integer,String>> pair=m.entrySet();
for(Entry<Integer,String> p:m.entrySet())
{
	System.out.println(p);
}

Iterator<Entry<Integer,String>> c=m.entrySet().iterator();
while(c.hasNext())
{System.out.println(c.next());
}


}
}
