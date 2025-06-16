package Day10;
class Vehicle
{
  void start()
  {
    System.out.println("Vehicle start");
  }
}
class Bike extends Vehicle
{
  void ride()
  {
   System.out.println("Riding the bike.");
  }
}
class Car extends Vehicle
{
  void drive()
  {
    System.out.println("Driving a car");
  }
}

public class Main {

	public static void main(String[] args) {
		Bike b= new Bike();
		  b.start();
		  b.ride();
		  Car c = new Car();
		  c.start();
		  c.drive();
	}

}
