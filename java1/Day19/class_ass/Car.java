package Day19;

public class Car {
	String Brand;
	String clr;
	Car(String Brand, String clr)//parameterized constructor
	{
		this.Brand=Brand;
		this.clr=clr;
		System.out.println("Brand:-"+Brand);
		System.out.println("Color:-"+clr);
		
	}

	Car(Car cc)//copy constructor
	{
		this.Brand=cc.Brand;
		this.clr=cc.clr;
		System.out.println("Brand:-"+Brand);
		System.out.println("Color:-"+clr);
	}
	public static void main(String[] args) {
		Car c= new Car("Fortuner","Black");
		Car c1= new Car(c);
		
	}

}


