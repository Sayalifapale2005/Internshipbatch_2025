package Day9;

import java.util.Scanner;

public class LogicalDemo {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:-");
		int age= sc.nextInt();
		if(age>=1 && age<=18)
		{
			System.out.println("You are chid.");
		}
		else if(age>18 && age<=60)
		{
			System.out.println("You are Adult.");
		}
		else
		{
			System.out.println("You are Senior citizen.");
		}
	}

}
