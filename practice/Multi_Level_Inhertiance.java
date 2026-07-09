package practice;


class School
{
	void schoolname()
	{
		System.out.println("School is Kirland Ranch Academy");
	}
}

class Teacher3 extends School
{
	void teach()
	{
		System.out.println("Teacher teach subject");
	}
}

class Student3 extends Teacher3{
	
	void study()
	{
		System.out.println("Student study");
	}
}

public class Multi_Level_Inhertiance {
public static void main(String[] args) {
	
	Student3 s1=new Student3();
	s1.study();
	s1.teach();
	s1.schoolname();
}
}
