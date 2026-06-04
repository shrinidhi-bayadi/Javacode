package module1;
/*A system has users with roles: If username correct If password correct If role = “Admin” → “Full Access” 
 Else if role = “User” → “Limited Access” Else → “Guest Access” Else → “Wrong password” Else → “Invalid username”
 */
public class Assignment_18 {

	public static void main(String[] args) {
		
		String username="Shrinidhi";
		String password="B123";
		String role="User";
		if(username=="Shrinidhi" && password=="B123") //if both are correct then only check for access level
		{
			if(role=="Admin")
			{
				System.out.println("Full Access");
			}
			else if (role=="User")
			{
				System.out.println("Limited Access");
			}
			else
			{
				System.out.println("Guest Access");
			}
		}
		
		else if(username=="Shrinidhi"&&password!="B123")  //if username is correct and password is incorrect then only print wrong password
		{
			System.out.println("Wrong password");
		}
		
		else 
		{
			System.out.println("Invalid username");
		}
	}
}
