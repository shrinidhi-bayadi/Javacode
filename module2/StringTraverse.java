package module2;
//write a program to iterate each character of string

public class StringTraverse {

	public static void main(String[] args) {

		String name = "Ram Shree";
		
		for(int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			System.out.println(c);
		}
		
	}
}
  