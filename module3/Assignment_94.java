package module3;

import java.util.*;

/*
 * Write a Java program to create Singleton List, Singleton Set, and Singleton Map 
using Collections class and handle UnsupportedOperationException.
 */
public class Assignment_94 {
public static void main(String[] args) {
	
	List<Integer> list=Collections.singletonList(10);
	System.out.println("Singleton List --> "+list);
	try
	{
		list.add(29);
	}
	
	catch(UnsupportedOperationException e1)
	{
		System.out.println("Can not modify singleton List");
	}
	
	
	Set<Integer> set=Collections.singleton(1);
	System.out.println("Singleton Set --> "+set);

	try
	{
		set.add(2);
	}
	catch(UnsupportedOperationException e2)
	{
		System.out.println("Can not modify singleton Set");
	}
	
	Map<Integer,Character> map=Collections.singletonMap(1, 'A');
	System.out.println("Singleton Map --> "+map);

	try
	{
		map.put(2, 'B');
	}
	catch(UnsupportedOperationException e3)
	{
		System.out.println("Can not modify singleton Map");
	}
}
}
