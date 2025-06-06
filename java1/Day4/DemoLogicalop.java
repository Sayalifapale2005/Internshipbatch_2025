package Day4.java;

import java.util.Scanner;

public class DemoLogicalop {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your marks:-");
		int marks = sc.nextInt();
		if(marks <= 100 && marks >= 80)
		{
			System.out.println("Grade A");
			
		}
		else if(marks<80 && marks >= 75)
		{
			System.out.println("Grade B");
		}
		else if(marks<75 && marks >= 55)
		{
			System.out.println("Grade C");
		}
		else if(marks < 55 && marks >= 40)
		{
			System.out.println("pass");
		}else{
			System.out.println("Oops! you are fail.");
		}
        
	 

	}

}
