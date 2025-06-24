package Day16;

import java.util.Scanner;

public class ArithmeticExceptionClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a dividend:-");
		int dividend=sc.nextInt();
		System.out.println("Enter a divisor:-");
		int divisor=sc.nextInt();
		try {
			int ans=dividend/divisor;
			System.out.println("Division is:-"+ans);
		}
		catch(ArithmeticException a)
		{
			System.out.println(a);
		}

	}

}
