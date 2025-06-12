package Day7;

import java.util.Scanner;

public class VowelSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:-");
		String ch= sc.nextLine();
		switch(ch)
		{
		case "a":
			System.out.println("It is a vowel.");
		    break;
		    
		case "e":
		     System.out.println("It is a vowel.");
		     break;
		     
		case "i":
			System.out.println("It is a vowel.");
			break;
			
		case "o":
			System.out.println("It is a vowel.");
			break;
		
		case "u":
			System.out.println("It is a vowel.");
			break;
			
		default:
		    System.out.println("It is a consonant.");
		    break;
		}

	}

}
