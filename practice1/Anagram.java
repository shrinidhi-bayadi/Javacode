package practice1;

import java.util.Arrays;

//WAP to check if 2 Strings are Anagram
public class Anagram {

	public static void main(String[] args) {
		
		String s1="eat";
		String s2="tea";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1,c2);
		if(b1)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}

	}
}
