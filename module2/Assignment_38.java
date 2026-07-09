package module2;
/* write a program on combination of this calling statement and 
super calling statement in multilevel inheritance*/

class GrandParent {
	GrandParent() {
		System.out.println("This is constructor 1");
	}
}

class Parent extends GrandParent {
	Parent(String name) {
		//super present implicitly
		System.out.println("this is construcor 2");
	}

	Parent(int a) {
		this("Shri");
		System.out.println("This is constructor 3");
	}
}

public class Assignment_38 extends Parent {

	Assignment_38() {
		super(3);
		System.out.println("This is constructor 4");
	}

	Assignment_38(double a) {
		this();
		System.out.println("This is construcor 5");
	}

	public static void main(String[] args) {
		new Assignment_38(3.4);

	}
}
