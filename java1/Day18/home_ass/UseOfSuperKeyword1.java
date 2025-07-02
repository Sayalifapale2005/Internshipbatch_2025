package Day18;
class Parent1
{
	void display()
	{
		System.out.println("I am a parent class method.");
	}
}

public class UseOfSuperKeyword1 extends Parent1{
	void display()
	{
		super.display();
		System.out.println("I am a child class method.");
	}

	public static void main(String[] args) {
		UseOfSuperKeyword1 u1= new UseOfSuperKeyword1();
		u1.display();

	}

}
