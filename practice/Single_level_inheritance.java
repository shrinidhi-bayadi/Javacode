package practice;


 class Teacher{
	
	void teachermethod()
	{
		System.out.println("Teacher is teaching");
	}
}
 
 class Student extends Teacher{
	 
	 void studentmethod()
	 {
		 System.out.println("Student is learning");
	 }
 }
public class Single_level_inheritance {

	
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.studentmethod();
		s1.teachermethod();
	}
}
