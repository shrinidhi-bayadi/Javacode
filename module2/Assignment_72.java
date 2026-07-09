package module2;

//WAP to demonstrate all the methods of StringBuffer Class. 
//(capacity, append, replace, insert, reverse and detele)
public interface Assignment_72 {

	public static void main(String[] args) {
//capacity
		StringBuffer s1 = new StringBuffer();
		System.out.println("Capacity of StringBuffer is " + s1.capacity());
		// append method
		StringBuffer s2 = new StringBuffer("Automation");
		s2.append(" Testing");
		System.out.println(s2);
	

		// replace method

		s2.replace(0, 10, "Java");
		System.out.println(s2);
//insert method 
		s2.insert(5, "Automation ");
		System.out.println(s2);
		// reverse method

		s2.reverse();
		System.out.println(s2);

//delete method

		StringBuffer s3 = new StringBuffer("ShrinidhiBayadi");
		s3.delete(9, 15);
		System.out.println(s3);

		s3.deleteCharAt(1);
		System.out.println(s3);

	}
}
