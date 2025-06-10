package Day5;

import java.util.Scanner;

public class DemoBitwise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer values:-");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println("Bitwise AND(&) of num1 and num2 is:-"+(num1 & num2));
		System.out.println("Bitwise OR(|) of num1 and num2 is:-"+(num1 | num2));
		System.out.println("Bitwise XOR(^) of num1 and num2 is:-"+(num1 ^ num2));
	}

}
