package Day15;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:-");
		int num= sc.nextInt();
		int sum=0;
		int original=num;
		do {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}while(num!=0);
		System.out.println("Sum of digit in "+original+"is "+sum);
		

	}

}
