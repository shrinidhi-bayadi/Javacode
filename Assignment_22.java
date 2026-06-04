package module1;

import java.util.Scanner;

//Rewrite Assignment 16 using switch case statement.
//
//If marks ≥ 75 → “Distinction pass” Else if marks ≥ 60 → “First Class pass ” Else → “Second Class pass” 
//if(marks<35)--> "fail"
public class Assignment_22 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int a = sc.nextInt();
		sc.close();

		int n = a / 10;
		if (a < 0 || a > 100) {
			System.out.println("Invlaid marks");
			return;
		}

		switch (n) {

		case 10:
		case 9:
		case 8:
			System.out.println("Distinction");
			break;
		case 7:
			if (a >= 75) {
				System.out.println("Distinction");

			} else {
				System.out.println("first class");
			}
			break;
		case 6:
			System.out.println("first class");
			break;
		case 5:
		case 4:
			System.out.println("Second Class");
			break;
		case 3:
			if (a >= 35) {
				System.out.println("Second class");
			} else {
				System.out.println("fail");
			}
			break;

		default:
			System.out.println("fail");
		}
	}
}
