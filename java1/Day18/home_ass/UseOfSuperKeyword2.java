package Day18;
class Parent2
{
	int x,y;
	Parent2(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

public class UseOfSuperKeyword2 extends Parent2 {
	int z;
	UseOfSuperKeyword2(int x,int y,int z)
	{
		super(x,y);
		this.z=z;
	}
	void display()
	{
		System.out.println("Value of x:-"+x);
		System.out.println("Value of y:-"+y);
		System.out.println("Value of z:-"+z);
	}
	

	public static void main(String[] args) {
		UseOfSuperKeyword2 u2= new UseOfSuperKeyword2(10,20,30);
		u2.display();

	}

}
