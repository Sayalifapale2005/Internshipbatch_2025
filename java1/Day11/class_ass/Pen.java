package Day11;

public class Pen {
	String brand;
	String clr;
	Pen(String brand, String clr)
	{
		this.brand=brand;
		this.clr=clr;
	}
	void display()
	{
		System.out.println("Brand:-"+brand);
		System.out.println("color:-"+clr);
		
	}
	public static void main(String[] args) {
		Pen p= new Pen("Trimaxx","Blue");
		p.display();

	}

}
