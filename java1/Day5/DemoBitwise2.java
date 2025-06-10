package Day5;

import java.util.Scanner;

public class DemoBitwise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num= sc.nextInt();
		
		System.out.println("Right shift of "+num+" is:-"+(num>>2));
		System.out.println("Left shift of "+num+" is:-"+(num<<2));
		System.out.println(" unsigned Right shift of "+num+" is:-"+(num>>>2));
		
		

	}

}
