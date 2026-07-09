package module3;

/*
 * Create a Student class with private variables name and age.
 * Use getter and setter methods to access and 
 * modify the data. Display the student details in the main method.
 */
class Student{
	
	private int age;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
	this.age=age;
	}
	
}
public class Assignment_99 {
public static void main(String[] args) {
	
	Student s=new Student();
	s.setAge(22);
	s.setName("Shrinidhi");
	System.out.println("Updated private Age--> "+s.getAge());
	System.out.println("Updated private Name--> "+s.getName());

}
}
