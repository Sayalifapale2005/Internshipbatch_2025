package Day7;

import java.util.Scanner;

public class GradeSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade between A to F except E:-");
		String ch= sc.nextLine();
		switch(ch)
		{
		case "A":
			System.out.println("Excellent.");
		    break;
		    
		case "B":
		     System.out.println("Good");
		     break;
		     
		case "C":
			System.out.println("Average.");
			break;
			
		case "D":
			System.out.println("Below Average.");
			break;
		
		case "F":
			System.out.println("Fail.");
			break;
			
		default:
		    System.out.println("Enter a valid Grade.");
		    break;
		}


	}

}
