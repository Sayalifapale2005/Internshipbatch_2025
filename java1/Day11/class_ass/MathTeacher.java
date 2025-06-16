package Day11;

import java.util.Scanner;

class Teacher
{
	String name;
	String sub;
	void accept(Scanner sc)
	{
		System.out.println("Enter the name of teacher:-");
		name=sc.nextLine();
		System.out.println("Enter the subject:-");
		sub=sc.nextLine();
	}
	void display()
	{
		System.out.println("Name:-"+name);
		System.out.println("Subject:-"+sub);
	}
}
public class MathTeacher extends Teacher {
  int experienceYear;
  void acceptDetails(Scanner sc)
  {
	  System.out.println("Enter the experience:-");
	  experienceYear=sc.nextInt();
	  
  }
  void displayDetails()
  {
	  System.out.println("Experience Year:-"+experienceYear);
  }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	MathTeacher m= new MathTeacher();
	m.accept(sc);
	m.acceptDetails(sc);
	m.display();
	m.displayDetails();

	}

}
