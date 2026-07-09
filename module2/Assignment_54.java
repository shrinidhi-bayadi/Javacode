package module2;

/*
 * Write a program to demonstrate below methods
1.matches                
2.replace(char,char)                
3.replace(char seq,char seq)                
4.replaceAll(String regix, String)     

 */
public class Assignment_54 {

	public static void main(String[] args) {

		// to check whether string starts with s

		String s1 = "shrinidhi bayadi";
		System.out.println(s1.matches("s(.*)"));

		// to check whether string ends with i

		System.out.println(s1.matches("(.*)i"));

		// to check whether url contains google in it

		String url = "https://www.google.com/";
		System.out.println(url.matches("(.*)google(.*)"));

		// replace(char,char)

		String s2 = "Java Program";
		System.out.println(s2.replace('J', 'j'));
		// replace(char seq,char seq)

		String s3 = "My Name Is Shrinidhi";
		System.out.println(s3.replace("Shrinidhi", "Bayadi"));
		// replaceAll(String regix,String)

		String s4 = "My Class is Automation Batch 67";

		System.out.println(s4.replaceAll("[A-Z]", ""));
		System.out.println(s4.replaceAll("[a-z]", ""));
		//replace numbers in string
		String s5="User343name";
		System.out.println(s5.replaceAll("[0-9]", ""));
	}
}
