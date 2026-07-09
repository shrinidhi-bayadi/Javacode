package module2;
import java.util.Scanner;

//WAP to check if String only consist of alphabets
public class Assignment_67 {
	static int count_of_aplha = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");

		String a1 = sc.nextLine();
		char c1[] = a1.toCharArray();
		boolean b1=false;
		for (int i = 0; i < c1.length; i++) {
		 b1 = Character.isAlphabetic(c1[i]);
			if (b1) {
				count_of_aplha++;
			}
		}
		if (count_of_aplha == c1.length) {
			System.out.println("String consists of only aplabets");
		} else {
			System.out.println("String does not consists of only aplabets");
		}
		sc.close();
	}
}
