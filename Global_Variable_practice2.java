package module1;

public class Global_Variable_practice2 {

	static int a=10;
	int b=5;
	public static void main(String[] args) {
		int a=15;
		System.out.println(a);
		System.out.println(Global_Variable_practice2.a); //print static gv
		Global_Variable_practice2 g=new Global_Variable_practice2();
		System.out.println(g.b); //print instance variable-
		

	}
}
