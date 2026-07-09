package module2;
/*WAP on hybrid level inheritance .
Create a Person class . Under that create Student class and Teacher class.
Under Teacher class ,create Math Teacher class. call all static and non static methods.
*/

//Person -->Student
//Person-->Teacher is hierarchical level inheritance
public class Assignment_35_Teacher extends Assignment_35_Person {

	static void dispayTeachert() {
		System.out.println("This is static Teacher method");
	}

	void displayNon_Static_Teacher() {
		System.out.println("this is non static Teacher method");
	}
}
