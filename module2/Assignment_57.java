package module2;

import java.util.Arrays;

/*
 * Write a program to declare, initialize, and print arrays of
 * two data types (boolean and double) using the Arrays.toString() method
 */
public class Assignment_57 {

	public static void main(String[] args) {

		boolean[] result = new boolean[3];
		result[0] = true;
		result[1] = false;
		result[2] = true;

		System.out.println("Result is : " + Arrays.toString(result));

		double[] weight_kg = new double[3];
		weight_kg[0] = 20.33;
		weight_kg[1] = 88.87;
		weight_kg[2] = 44.56;
		System.out.println("Weight in Kg is : " + Arrays.toString(weight_kg));
	}
}
