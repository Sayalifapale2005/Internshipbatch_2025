package Day12;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	void setter()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name:-");
		name=sc.nextLine();
		System.out.println("Enter the age:-");
		age=sc.nextInt();
	}
	void getter()
	{
		System.out.println("Name:-"+name);
        System.out.println("Age:-"+age);
	}

	public static void main(String[] args) {
		Student s= new Student();
		s.setter();
		s.getter();

	}

}
