package Day19;

public class Student {
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("Id:-"+id);
		System.out.println("Name:-"+name);
		System.out.println("Marks:-"+marks);
	}

	public static void main(String[] args) {
		Student s = new Student(101,"Abhay",98);
		s.display();

	}

}
