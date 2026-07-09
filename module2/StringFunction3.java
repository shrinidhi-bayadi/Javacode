package module2;

public class StringFunction3 {

	public static void main(String[] args) {

		String name = "Ram Shree";
		boolean b= name.contains("Shree"); //check whether string contains this word
		System.out.println(b);
 boolean c=name.equalsIgnoreCase("Ram shree");//ignore case sensitivity
 System.out.println(c);
	}
}
