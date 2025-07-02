package Day18;

public class Employee {
	int id;
	String name;
	double sal;
	Employee(int id,String name,double sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
		
	}
	void display()
	{
		System.out.println("ID:-"+id);
		System.out.println("Name:-"+name);
		System.out.println("Salary:-"+sal);
		
	}
	

	public static void main(String[] args) {
		Employee e = new Employee(101,"Sayali",10000);
		e.display();

	}

}
