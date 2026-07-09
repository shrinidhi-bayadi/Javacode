package module3;
import java.util.*;
//collections methods

/*
 * 
 * * Write a java program on Collections methods
 * 1) sort()
 * 2) reverse()
 * 3) shuffle()
 * 4) max()
 * 5) min()
 * 6) swap()
 * 7) binarySearch()
 * 8)frequency()
 * 
 * fill()        
copy()        
replaceAll()        
rotate()        
disjoint()        
addAll()S
 */
public class Collections_methods {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks=new ArrayList<Integer>();
		
		marks.add(10);
		marks.add(40);
		marks.add(20);
		marks.add(90);

		System.out.println("Collection marks-->"+marks);
		Collections.sort(marks);
		System.out.println("Sorted--"+marks);
		
		Collections.reverse(marks);
		System.out.println("reverse--"+marks);
		
		System.out.println(Collections.min(marks));
		System.out.println(Collections.max(marks));

Collections.swap(marks, 0, 2);
System.out.println("swap--"+marks);
Collections.shuffle(marks);
System.out.println("Shuffle"+marks);

int a=Collections.binarySearch(marks, 90);

System.out.println(a);
	int f=Collections.frequency(marks, 40);
	System.out.println(f);
	ArrayList<Integer> dest=new ArrayList<Integer>(Arrays.asList(1,2,4,5));
	Collections.copy(dest, marks);
	System.out.println(dest);
Collections.addAll(dest,33,44,55);
System.out.println(dest);

	boolean b=Collections.disjoint(marks, dest);
	System.out.println("disjoint"+b);
	Collections.rotate(dest, 2);
	System.out.println(dest);
	Collections.replaceAll(marks, 90, 3);
System.out.println(marks);

try
{
List<Integer> m=Collections.unmodifiableList(marks);
System.out.println("unmodifiable"+m);
m.add(3);
}
catch (UnsupportedOperationException e)
{
	System.out.println("cannot modify ");
}

List<Integer> sync=Collections.synchronizedList(marks);
sync.add(8);
sync.add(77);
System.out.println(sync);
System.out.println("iteate sync -->");
synchronized(sync)

{
	for(int i:sync)
	{
		System.out.println(i);
	}
}

//	Collections.fill(marks, 1);
//	System.out.println(marks);
	}
	
}
