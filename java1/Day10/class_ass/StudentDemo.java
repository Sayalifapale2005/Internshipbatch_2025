package Day10;

public class StudentDemo {
	String name;
	  int age;
	  StudentDemo(String name, int age)
	  {
		  this.name=name;
		  this.age=age;
	  }
	  void display()
	  {
		  System.out.println("Name of the student is:-"+name);
		  System.out.println("Age is:-"+age);
	  }

	public static void main(String[] args) {
	  StudentDemo s=new StudentDemo("Sayali",20);
	  s.display();
		

	}

}
