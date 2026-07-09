package module2;

public class P {

	/*Write a program to demonstrate access specifiers
	 *  for variables and methods within the same class*/

	

		public  String Company_name = "Citi Bank";
		protected  String employee_name = "Shrinidhi";
		 int employee_id = 123;
		private  int salary = 50000;

		public   void company() {
			System.out.println("company name is : " + Company_name);
		}

		protected  void employee_Detail() {
			System.out.println("employee name is : " + employee_name);
		}

		 void employee_number() {
			System.out.println("employee id is :" + employee_id);

		}

		private  void salary_data() {
			System.out.println(employee_name + "  salary is : " + salary);
		}

		public static void main(String[] args) {
			P a=new P();
			
			System.out.println("Employee data is as shown below :");
			System.out.println(a.Company_name);
			System.out.println(a.employee_name);
			System.out.println(a.employee_id);
			System.out.println(a.salary);
			
a.company();
			a.employee_Detail();
			a.employee_number();
			a.salary_data();
		}
	}


