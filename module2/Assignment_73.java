package module2;

//WAP to demonstrate all the methods of StringBuilder Class. 
//(capacity, append, replace, insert, reverse and delete)
public interface Assignment_73 {

	public static void main(String[] args) {
//capacity
		StringBuilder s1 = new StringBuilder();
		System.out.println("Capacity of StringBuilder is " + s1.capacity());
		// append method
		StringBuilder s2 = new StringBuilder("Shrinidhi");
		s2.append(" Bayadi");
		System.out.println(s2);

		// replace method

		s2.replace(0, 4, "SHRI");
		System.out.println(s2);
//insert method 
		s2.insert(9, " hello");
		System.out.println(s2);
		// reverse method

		s2.reverse();
		System.out.println(s2);

//delete method

		StringBuilder s3 = new StringBuilder("Hello Class");
		s3.delete(6, 11);
		System.out.println(s3);

		s3.deleteCharAt(4);
		System.out.println(s3);

	}
}
