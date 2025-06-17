package Day12;
abstract class Shape
{
	abstract void calArea();
}
class Circle extends Shape
{
	int r;
	Circle(int r)
	{
		this.r=r;
	}
	void calArea()
	{
		System.out.println("Area of rectangle is:-"+(3.14*r*r));
	}
}
class Rectangle extends Shape
{
	int l,b;
	Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	void calArea()
	{
		System.out.println("Area of circle is:-"+(l*b));
	}
}

public class MainShape {

	public static void main(String[] args) {
		Shape c=new Circle(5);
		c.calArea();
		Shape r= new Rectangle(4,7);
		r.calArea();

	}

}
