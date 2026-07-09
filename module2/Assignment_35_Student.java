package module2;
/*WAP on hybrid level inheritance .

Create Person class . Under that create Student class and Teacher class.
Under Teacher class ,create Math Teacher class. call all methods.
*/

//Person-->Student single level inheritance
public class Assignment_35_Student extends Assignment_35_Person {

	static void dispayStudent() {
		System.out.println("This is static Student method");
	}

	void displayNon_Static_Student() {
		System.out.println("this is non static Student method");
	}
}
