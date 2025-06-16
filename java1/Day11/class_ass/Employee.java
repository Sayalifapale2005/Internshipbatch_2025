package Day11;

public class Employee {
  String name;
  int id;
  Employee(int id, String name)
  {
	  this.id=id;
	  this.name=name;
	  
  }
  void displayInfo()
  {
	  System.out.println("Id:-"+id);
	  System.out.println("Name:-"+name);
  }
	public static void main(String[] args) {
		Employee e= new Employee(1,"Divya");
		e.displayInfo();

	}

}
