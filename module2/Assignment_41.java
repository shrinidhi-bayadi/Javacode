package module2;
/*Write a program to demonstrate access specifiers
 *  for variables and methods within the same class*/

public class Assignment_41 {

	public static String Company_name = "Citi Bank";
	protected static String employee_name = "Shrinidhi";
	static int employee_id = 123;
	private static int salary = 50000;

	public static void company() {
		System.out.println("company name is : " + Company_name);
	}

	protected static void employee_Detail() {
		System.out.println("employee name is : " + employee_name);
	}

	static void employee_number() {
		System.out.println("employee id is :" + employee_id);

	}

	private static void salary_data() {
		System.out.println(employee_name + "  salary is : " + salary);
	}

	public static void main(String[] args) {
		
		System.out.println("Employee data is as shown below :");
		System.out.println(Company_name);
		System.out.println(employee_name);
		System.out.println(employee_id);
		System.out.println(salary);
		
		company();
		employee_Detail();
		employee_number();
		salary_data();
	}
}
