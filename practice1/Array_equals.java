package practice1;

import java.util.Arrays;

//WAP to check if 2 arrays or equal
public class Array_equals {

	
	public static void main(String[] args) {
		
		int [] a1=new int[3];
		a1[0]=10;
		a1[1]=3;
		a1[2]=9;
		
		int a2[]=new int[3];
		a2[0]=10;
		a2[1]=3;
		a2[2]=9;
		
		boolean b1=Arrays.equals(a1,a2);
		if(b1) {
			System.out.println("2 arrays are equal");
		}
		else
		{
			System.out.println("2 arrays are not equal");
		}
	}
}
