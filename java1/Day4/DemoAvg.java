package Day4.java;

import java.util.Scanner;

public class DemoAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:-");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		int num3= sc.nextInt();
		
		System.out.println("Average of three number is:-"+((num1+num2+num3)/3));

	}

}
