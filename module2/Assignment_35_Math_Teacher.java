package module2;
/*WAP on hybrid level inheritance .

Create Person class . Under that create Student class and Teacher class.
Under Teacher class ,create Math Teacher class. call all methods.
*/

//Person --->Teacher-->Math_Teacher multilevel inheritance

public class Assignment_35_Math_Teacher extends Assignment_35_Teacher {

	static void dispayMath_Teachert() {
		System.out.println("This is static Math Teacher method");
	}

	void displayNon_Static_Math_Teacher() {
		System.out.println("this is non static Math Teacher method");
	}

	public static void main(String[] args) {

		dispayMath_Teachert();
		Assignment_35_Math_Teacher a = new Assignment_35_Math_Teacher();
		a.displayNon_Static_Math_Teacher();
		dispayTeachert();
		a.displayNon_Static_Teacher();
		dispayPerson();
		a.displayNon_Static_Person();

		Assignment_35_Student.dispayStudent();
		Assignment_35_Student b = new Assignment_35_Student();
		b.displayNon_Static_Student();

	}
}
