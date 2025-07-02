package Day19;

public class Laptop {
	String model;
	double pr;
	Laptop(String model,double pr)
	{
		this.model=model;
		this.pr=pr;
	}
	void display()
	{
		System.out.println("Model:-"+model);
		System.out.println("Price:-"+pr);
		
	}
	

	public static void main(String[] args) {
		Laptop l= new Laptop("HP",60000);
		l.display();

	}

}
