package module1;

/*
 * "Write a Java program demonstrating method overloading for a login system.
The program should have three overloaded Login methods:

Login(String email) → Check if the email ends with ""gmail.com"".
Login(String email, String password) → Check if the password length is greater than 6 and email ends with ""gmail.com"".
Login(String email, String password, String OTP) → Check if the OTP length is greater than 4, password length is greater than 6, and email ends with ""gmail.com"".

Implement all three methods and call them in main() to test all cases.
Print appropriate messages for valid and invalid inputs.

Note :You can Solve this  only with String Methods"
 */
public class Assignment_20 {

	void login(String email) {

		if (email.endsWith("@gmail.com")) // this is built in method used to check if string ends with a specific
											// suffix.
		{
			System.out.println("This email ends with gmail.com");
		} else {
			System.out.println("Invalid Email!! Please enter valid gmail id");
		}
	}

	void login(String email, String password) {

		int l = password.length(); // built in method length is used to calculate length of password
		if (email.endsWith("@gmail.com") & l > 6) {
			System.out.println("This is valid email id and password");
		} else {
			System.out.println(
					"Invalid Entry!! Please enter valid gmail id  and password lengh should be greater than 6");
		}
	}

	static void login(String email, String password, String OTP) {

		int l = password.length(); // length of password
		int ol = OTP.length(); // length of OTP
		if ((email.endsWith("@gmail.com") && l > 6 && ol > 4)) {
			System.out.println("This is valid email and password and otp");
		}

		else {
			System.out.println("Invalid Entry!!Please enter valid gmail id,password legth greater than 6"
					+ " and OTP legnth should be greater than 4");
		}
	}

	public static void main(String[] args) {

		Assignment_20 Log = new Assignment_20(); // create object Log, to call non static method
		Log.login("abcd@mail.com"); // use reference variable Log to call non static method
		Log.login("abc@gmail.com", "a528456");
		login("abc@gmail.com", "a123456", "s68822s"); // this static method can be called directly by method name
	}
}
