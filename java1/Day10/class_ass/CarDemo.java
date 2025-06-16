package Day10;

import java.util.Scanner;

public class CarDemo {
	String model;
	String color;
	double price;
	void accept()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter model of car:-");
		model=sc.nextLine();
		System.out.println("Enter color of car:-");
		color=sc.nextLine();
		System.out.println("Enter price of car:-");
		price=sc.nextDouble();
		
		
	}
	void display()
	{
		System.out.println("Model:-"+model);
		System.out.println("Color:-"+color);
		System.out.println("Price:-"+price);
	}
	
	

	public static void main(String[] args) {
		CarDemo c= new CarDemo();
		c.accept();
		c.display();

	}

}
