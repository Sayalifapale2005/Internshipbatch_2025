package Day10;
abstract class Shape
{
	abstract void calculateArea();
}

class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	void calculateArea()
	{
		System.out.println("Area of circle is:-"+(3.14*r*r));
	}
}
class Rectangle extends Shape
{
	int l, b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
		
	}
	void calculateArea()
	{
		System.out.println("Area of rectangle is:-"+(l*b));
	}
}

public class Main1 {

	public static void main(String[] args) {
		Circle c= new Circle(5);
		c.calculateArea();
		Rectangle r = new Rectangle(3,7);
		r.calculateArea();

	}

}
