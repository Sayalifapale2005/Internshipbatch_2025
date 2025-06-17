package Day12;
abstract class Vehicle
{
	abstract void start();
}
class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car is running.");
	}
}
class Bike extends Vehicle
{
	void start()
	{
		System.out.println("Bike is running.");
	}
}

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle c= new Car();
		c.start();
		Vehicle b= new Bike();
		b.start();
	}

}
