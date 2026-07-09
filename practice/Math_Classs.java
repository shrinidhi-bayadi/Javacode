package practice;

import java.util.Scanner;

/*
Write a java program which takes 2 numbers a and b from user at run time and perform below operation:
Please use methods from Math class
1.square root of a
2.maximum
3.minimum
4.a*b
5.a+b
6.a-b
7.Absolute value of a
 */
public class Math_Classs {

	
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number 1");
	
	int a=sc.nextInt();
	System.out.println("enter number 2");
	int b=sc.nextInt();
	sc.close();
	System.out.println("Square root of a is "+Math.sqrt(a));
	System.out.println("Maximum "+Math.max(a,b));
	System.out.println("Minimun is :  "+Math.min(a,b));
	System.out.println("a*b "+Math.multiplyExact(a,b));
	System.out.println("a+b   "+Math.addExact(a,b));
	System.out.println("a-b   "+Math.subtractExact(a,b));
	System.out.println("Absolute value of a "+Math.abs(a));


}
}
