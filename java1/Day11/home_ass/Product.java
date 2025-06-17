package Day11;

public class Product {
    int pId;
    String pName;
    double price;
    Product(int pId,String pName, double price)
    {
    	this.pId=pId;
    	this.pName=pName;
    	this.price=price;
    }
    void displayDetails()
    {
    	System.out.println("Product Id:-"+pId);
    	System.out.println("Product Name:-"+pName);
    	System.out.println("Price:-"+price);
    }
    
	public static void main(String[] args) {
		Product p1= new Product(101,"Laptop",75000);
		p1.displayDetails();
		Product p2= new Product(102,"Webcam",45000);
		p2.displayDetails();
		Product p3= new Product(103,"HeadPhone",1000);
        p3.displayDetails();
	}

}
