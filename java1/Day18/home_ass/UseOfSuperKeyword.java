package Day18;
class Parent
{
	int a=50;
	
}

public class UseOfSuperKeyword extends Parent {
	int a=40;
	void display()
	{
		System.out.println("Value of parent class variable:-"+super.a);
		System.out.println("Value of child class variable:-"+a);
		
	}

	public static void main(String[] args) {
		UseOfSuperKeyword u= new UseOfSuperKeyword();
		u.display();

	}

}
