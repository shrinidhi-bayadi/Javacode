package practice1;

public class qna {

	    void method1() {
	        System.out.println("Method 1");
	    }

	    void method2() {
	    	System.out.println("This is method 2");
	        method1(); // Direct call
	    }
	    
	    public static void main(String[] args) {
			qna a=new qna(); //object creation 
			a.method2(); 
		}
	}

