package module3;
/*Write a Java program to convert 
 * 1) byte into an int using widening primitive Typecasting.
 * 2) long into byte using narrowing primitive Typecasting*/
public class Assignment_101 {
public static void main(String[] args) {
	
	//primitive upcasting -widening
	byte a=10;
	int b=a;
	
	System.out.println("byte data-->"+a);
	System.out.println("int data-->"+b);

	//narrowing primitive typecasting
	
	long num1=12356789l;
	byte num2=(byte)num1;
	
	System.out.println("long data-->"+num1);
	System.out.println("byte data-->"+num2);

}
}
