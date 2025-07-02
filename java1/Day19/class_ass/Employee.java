package Day19;

public class Employee {
	int id;
	String name;
	Employee(int id, String name)//parameterized constructor
	{
		this.id=id;
		this.name=name;
		System.out.println("Id:-"+id);
		System.out.println("Name:-"+name);
		
	}

	Employee(Employee em)//copy constructor
	{
		this.id=em.id;
		this.name=em.name;
		System.out.println("Id:-"+id);
		System.out.println("Name:-"+name);
	}
	public static void main(String[] args) {
		Employee e= new Employee(101,"Manasi");
		Employee e1= new Employee(e);
	}

}
