package practice;


class Vehicle
{
	void start()
	{
		System.out.println("vehicle started");
	}
}

class Car extends Vehicle
{
	void drive()
	{
		System.out.println("Car is for driving ");
	}
}

class Bike extends Vehicle
{
	void ride()
	{
		System.out.println("Bike is for riding ");
	}
}
public class Hierarchical_Inheritance {
public static void main(String[] args) {
	

	
	Car c=new Car();
c.start();
c.drive();
	Bike b=new Bike();
	b.ride();
	b.start();
}
	
}
