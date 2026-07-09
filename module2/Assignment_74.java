package module2;

import java.util.ArrayList;

//WAP to create ArrayList of Character,Object,Integer datatypes.Add elements to it and print it

public class Assignment_74 {

	public static void main(String[] args) {
		
	
	ArrayList <Character>c=new ArrayList<Character>();
	
	c.add('A');
	c.add('B');
	c.add('K');
	c.add('L');
	System.out.println(c);
	
	ArrayList <Object> o=new ArrayList<Object>();
	o.add("Shrinidhi");
	o.add('B');
	o.add(true);
	o.add(100);
	o.add(3.22f);
	System.out.println(o);
	
	ArrayList <Float> f=new ArrayList <Float>();
	
	f.add(1.2f);
	f.add(4.555f);
	f.add(7.65f);
	f.add(4.6666f);
	System.out.println(f);
	
	
}
}