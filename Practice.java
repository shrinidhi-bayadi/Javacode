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

public class Practice {

	void login(String email)
	{
		
		 if(email.endsWith("gmail.com"))
		 {
			 System.out.println("email ends with gmail");
		 }
		
	}
	void login(String email,String password)
	{
		if(email.endsWith("gmail.com")&&password.length()>6)
				{
			System.out.println("valid username and password");
				}
	}
	void login(String email,String password,String OTP)
	{
		if(((email.endsWith("gmail.com"))&&password.length()>6)&&OTP.length()>4)
		{
			System.out.println("Perfect");
		}
	}
	public static void main(String[] args) {
		Practice a1=new Practice();
		
		a1.login("abc@gmail.com");

	
	a1.login("abc@gmail.com","123e456");
	
	a1.login("abc@gmail.com","4343434","3e3e3");
}
}
