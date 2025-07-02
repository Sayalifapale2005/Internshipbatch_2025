package Day18;

public class Student {
	int rollno;
	String name;
	double perc;
	Student(int rollno,String name,double perc)
	{
		this.rollno=rollno;
		this.name=name;
		this.perc=perc;
	}
	void display()
	{
		System.out.println("Roll no:-"+rollno);
		System.out.println("Name:-"+name);
		System.out.println("Percentage:-"+perc);
		
	}

	public static void main(String[] args) {
		Student s= new Student(101,"Sayali",98);
		s.display();

	}

}
