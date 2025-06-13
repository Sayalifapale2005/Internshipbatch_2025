package Day9;

import java.util.Scanner;

public class SimpleInterestDemo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principle amount:-");
		int p = sc.nextInt();
		System.out.println("Enter the rate of interest:-");
		int r= sc.nextInt();
		System.out.println("Enter the time period:-");
		int t= sc.nextInt();
		double SI=(p*r*t)/100;
		System.out.println("Simple interest is:-"+SI);

	}

}
