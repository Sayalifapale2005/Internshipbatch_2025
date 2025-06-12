package Day7;

import java.util.Scanner;

public class ColorSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter traffic color:-");
		String ch= sc.nextLine();
		switch(ch)
		{
		case "Red":
			System.out.println("Stop.");
		    break;
		    
		case "Green":
		     System.out.println("Go");
		     break;
		     
		case "Orange":
			System.out.println("Prepare to stop.");
			break;
			
		default:
		    System.out.println("Enter a valid color.");
		    break;
		}

	}

}
