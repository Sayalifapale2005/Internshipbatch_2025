package Day11;

import java.util.Scanner;

public class Laptop {
	String Brand;
	String processor;
	int battery;
	int ram;
	void accept(Scanner sc)
	{
		System.out.println("Enter the Brand of laptop:-");
		Brand=sc.nextLine();
		System.out.println("Enter the processor:-");
		processor=sc.nextLine();
		System.out.println("Enter the battery life:-");
		battery=sc.nextInt();
		System.out.println("Enter the ram capacity:-");
		ram=sc.nextInt();
	}
	void display()
	{
		System.out.println("Brand:-"+Brand);
		System.out.println("Processor:-"+processor);
		System.out.println("Battery Life:-"+battery+"hrs");
		System.out.println("RAM Capacity:-"+ram+"GB");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Laptop l = new Laptop();
		l.accept(sc);
		l.display();

	}

}
