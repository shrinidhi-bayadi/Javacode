package practice1;

import java.util.*;

public class ArrayList_p {
	
	
public static void main(String[] args) {
	//array - primitive and non primitive
	int marks[]= {1,2,3};
	String [] name= {"Shree","Ram"};
	Object[] a= {"pam",10,'U'};
	
	System.out.println(Arrays.toString(a));
	
	
	System.out.println(Arrays.toString(marks));
	
	System.out.println(Arrays.toString(name));
	
	//ArrayList only non primitive data
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add("Shree");
	System.out.println(a1);
}
}
