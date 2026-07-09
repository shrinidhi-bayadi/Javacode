package practice1;

import java.util.*;

//ArrayList methods

public class Arraylistmethods {
	public static void main(String[] args) {

		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(10);
		marks.add(20);
		marks.add(30);
		System.out.println("Marks ArrayList-->\n" + marks);
		
		ArrayList<Integer> new_marks = new ArrayList<Integer>();

		new_marks.addAll(marks);

		new_marks.add(2, 45);
		new_marks.add(3, 99);
		new_marks.add(5, 99);

		System.out.println("new Marks ArrayList-->\n" + new_marks);
System.out.println(Collections.max(new_marks));

Set<Integer> s=new HashSet<Integer>(new_marks);
System.out.println(s);
int count=0;

for(int i=0;i<new_marks.size();i++)
{
	if(new_marks.get(i)>50)
		count++;
}

for(int i=new_marks.size()-1;i>=0;i--)
{
System.out.println(new_marks.get(i));	
}

System.out.println(new_marks);
System.out.println(count);
System.out.println(Collections.min(new_marks));
		System.out.println(new_marks.containsAll(marks));
		System.out.println(new_marks.contains(22));

		System.out.println(marks.size());

		System.out.println(marks.isEmpty());
		// marks.clear();
		System.out.println(marks);
		new_marks.remove(2);
		System.out.println("new Marks ArrayList-->\n" + new_marks);
		new_marks.remove((Integer) 30);
		System.out.println("new Marks ArrayList-->\n" + new_marks);
		new_marks.removeAll(marks);

		System.out.println("new Marks ArrayList-->\n" + new_marks);

	}
}
