package module3;
/*
 Write a Java program to demonstrate primitive type casting.
1)Widening
2)Narrowing
 */
public class Assignment_100 {
public static void main(String[] args) {
	
	//widening
	
	int a=10;
	double b=a;
	System.out.println("Int value-->"+a);

	System.out.println("Double value-->"+b);
	
	//Narrowing
	
	float num=99.34f;
	short s=(short)num;
	
	System.out.println("Float value-->"+num);

	System.out.println("Short value-->"+s);
	
}
}
