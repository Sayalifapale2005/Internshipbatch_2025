package Day19;

public class Vehicle {
	String Brand;
	String clr;
	Vehicle(String Brand, String clr)//parameterized constructor
	{
		this.Brand=Brand;
		this.clr=clr;
		System.out.println("Brand:-"+Brand);
		System.out.println("Color:-"+clr);
		
	}

	Vehicle(Vehicle cc)//copy constructor
	{
		this.Brand=cc.Brand;
		this.clr=cc.clr;
		System.out.println("Brand:-"+Brand);
		System.out.println("Color:-"+clr);
	}
	public static void main(String[] args) {
		Vehicle v= new Vehicle("Fortuner","Black");
		Vehicle v1= new Vehicle(v);
		
	}


}
