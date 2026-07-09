package module2;

import java.util.Arrays;

/*
 * Write a program to declare, initialize, and print arrays of three
 *  
 *  data types (int, String and char) using the Arrays.toString() method
 */
public class Assignment_56 {

	public static void main(String[] args) {

//		int[] roll_num = new int[3]; //declaration
//		roll_num[0] = 10; //initialization
//		roll_num[1] = 20;
//		roll_num[2] = 30;
		
		int roll_num[]= {10,20,30};
		System.out.println("Roll number : " + Arrays.toString(roll_num));
		
		String[] name = new String[3];
		name[0] = "Shri";
		name[1] = "Ram";
		name[2] = "Jay";
		System.out.println("Name : " + Arrays.toString(name));

		char[] initial = new char[3];
		initial[0] = 'A';
		initial[1] = 'B';
		initial[2] = 'C';
		System.out.println("Initials  : " + Arrays.toString(initial));

	}

}