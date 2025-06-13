package Day9;

import java.util.Scanner;

public class SwapBitwise {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers for swapping:-");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("After swaping num1:-"+num1+" & num2 is:-"+num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("After swaping num1:-"+num1+" & num2 is:-"+num2);
				

	}

}
