package module2;

import java.util.Arrays;
import java.util.Scanner;

/*WAP enter a sentence and print below outputs
 * 1.Split sentence into words
 * 2.count number of words 
 * 3.Reverse the words in sentence (Ex: sentence -> I Love Automation Reverse-->Automation Love I
 * 4.count vowels in sentence
 * 
 */

public class Assignment_71 {
	static int count_vowels = 0;

	public static void main(String[] args) {

		System.out.println("Enter a Sentence : ");

		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		
		//this is for my understanding printing each output in array
		System.out.println("Words in sentence are : " + Arrays.toString(words));
        String[] rev = new String[words.length];
		for (int i = words.length - 1, j = 0; i >= 0; i--, j++) {
			rev[j] = words[i];

		}
		System.out.println("Reverse the words " + Arrays.toString(rev));

		String[] letters = sentence.split("");
		System.out.println(Arrays.toString(letters));
		for (int i = 0; i < sentence.length(); i++) {
			if (letters[i].equalsIgnoreCase("a") || letters[i].equalsIgnoreCase("e")
					|| letters[i].equalsIgnoreCase("i")
					|| letters[i].equalsIgnoreCase("o") || letters[i].equalsIgnoreCase("u")) {
				count_vowels++;
			}
		}

		System.out.println("Final output According to requirement : ");
		System.out.println("Words are : ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		/*
		 * or convert array to string
		 * System.out.println("Words are :\n"+String.join("\n", words));
		 * 
		 */

		System.out.println("Number of words present in Sentence : " + words.length);
		System.out.println("Reverse the words :\n" + String.join(" ", rev));
		System.out.println("Count of vowels-->" + count_vowels);
sc.close();
	}
}
