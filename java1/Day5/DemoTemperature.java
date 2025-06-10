package Day5;

import java.util.Scanner;

public class DemoTemperature {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature of your city:-");
		double temp= sc.nextDouble();
		
		if(temp>35)
		{
			System.out.println("It's s hot day today.");
		}
		else
		{
			System.out.println("It's s normal day today.");
		}

	}

}
