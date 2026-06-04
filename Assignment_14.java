package module1;
/*"Write a Java program to validate a user login system using nested if-else statements.
If the username is correct
Then check the password If password is correct - print "Login successful"
Else - print "Incorrect password"
Else - print ""Invalid username" */

public class Assignment_14 {

	public static void main(String[] args) {

		String username = "Shrinidhi"; 
		String password = "A123";

		System.out.println("Enter username  : " + username);

		if (username == "Shrinidhi") {
			System.out.println("Enter password   :  "+password);
			if (password == "A123") {
				System.out.println("Login successful"); // execute only if both username and password correct
			} else {
				System.out.println("Incorrect password");
			}
		}

		else {
			System.out.println("Invalid username");
		}
	}
}
