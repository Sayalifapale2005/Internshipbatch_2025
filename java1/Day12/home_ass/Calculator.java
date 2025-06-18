package Day12;

public class Calculator {
	void add(int a,int b)
	{
		System.out.println("Addition is:-"+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Addition is:-"+(a+b+c));
	}
	void add(int a,int b,int c,int d)
	{
		System.out.println("Addition is:-"+(a+b+c+d));
	}

	public static void main(String[] args) {
		Calculator c= new Calculator();
		c.add(4, 5);
		c.add(2, 3, 6);
		c.add(3, 7, 4, 9);

	}

}
