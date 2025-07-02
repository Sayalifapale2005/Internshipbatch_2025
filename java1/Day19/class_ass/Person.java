package Day19;

public class Person {
	String name;
	int age;
	Person()
	{
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);
	}
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name:-"+name);
		System.out.println("Age:-"+age);
	}

	public static void main(String[] args) {
		Person p = new Person();
		Person p1 = new Person("Divya",12);

	}

}
