package Day12;

import java.util.Scanner;

public class Product {
	private int productId;
	private String name;
	private double price;
	void setter()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product name:-");
		name=sc.nextLine();
		System.out.println("Enter the product id:-");
		productId=sc.nextInt();
		System.out.println("Enter the product price:-");
		price=sc.nextDouble();
	}
	void getter()
	{
		System.out.println("product Id:-"+productId);
		System.out.println("product name:-"+name);
		System.out.println("product price:-"+price);
	}

	public static void main(String[] args) {
		Product p = new Product();
		p.setter();
		p.getter();
	}

}
