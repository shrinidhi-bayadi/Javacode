package practice1;

public class StringProgram {

	public static void main(String[] args) {

		String s = "Automation";

		System.out.println(s);
		System.out.println(s.concat("Testing"));

		s = s.concat("Testing"); // why no error
		System.out.println(s);
	}
}
