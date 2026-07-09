package module2;


public class  A{
	   void displayA() {
	      System.out.println("Class A");
	   }
	}

	class B extends A {
	   void displayB() {
	      System.out.println("Class B");
	   }
	}

	class C extends A {
	   void displayC() {
	      System.out.println("Class C");
	   }
	}

	 class D extends B {
		 
		 void displayD() {
		      System.out.println("Class D");
		   }
	   public static void main(String[] args) {

	      D obj1 = new D();
	      obj1.displayA();
	      obj1.displayB();
	      obj1.displayD();

	      C obj2 = new C();
	      obj2.displayA();
	      obj2.displayC();
	   }
	}