package Day18;

public class MultipleConstructor {
	int a;
	MultipleConstructor()//Default constructor
	{ int a=15;
		System.out.println("This is a default constructor");
		System.out.println("Value of a:-"+a);
	}
	MultipleConstructor(int a)//parameterized constructor
	{
		System.out.println("Value of a:-"+a);
	}
	MultipleConstructor(MultipleConstructor m)//copy constructor
	{
		a=m.a;
		System.out.println("Value of a:-"+a);
		
	}

	public static void main(String[] args) {
		MultipleConstructor m1=new MultipleConstructor();
		MultipleConstructor m2= new MultipleConstructor(20);
		MultipleConstructor m3= new MultipleConstructor(m2);
	}

}
