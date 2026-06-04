package module1;

public class Variables {

	final static int numberOfdays=365;
	public static void main(String[] args) {
		//numberOfdays=20; //can not change value of final variable
		final int a=100;
		//a=30; //The final local variable a can not be assigned error
		int b=20;
		int sum=a+b;
		System.out.println("sum : "+sum); //output : 100+20=120
	}
}
