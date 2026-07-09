package module3;

/*
1)Print all numbers which are divisible by 3 between 1 and 100 
2)Print even numbers between 1 to 100
3) Print odd numbers between 1 to 100 Print only those
4)numbers which are not divisible by 4 between 1 and 100
 without continue keyword.
 */
public class Assignment_95 {

	public static void main(String[] args) {

		// print all numbers which are divisible by 3 between 1-100
		System.out.println("numbers which are divisible by 3 bettween 1-100-->");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				System.out.println(i);
		}

		// Print even numbers between 1 to 100
		System.out.println("even numbers between 1 to 100-->");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.println(i);
		}

		// print all odd numbers between 1-100
		System.out.println("all odd numbers between 1-100-->");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

		// numbers which are not divisible by 4 between 1 and 100
		System.out.println("numbers which are not divisible by 4 between 1 and 100-->");

		for (int i = 1; i <= 100; i++) {
			if (i % 4 != 0)
				System.out.println(i);

		}
	}
}
