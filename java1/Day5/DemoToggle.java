package Day5;
import java.util.Scanner;

public class DemoToggle {

	public static void main(String[] args) {
		   
		        Scanner scanner = new Scanner(System.in);

		        // Accept an integer from the user
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();

		        // Toggle the last bit using XOR with 1
		        int toggledNumber = number ^ 1;

		        // Show the new number
		        System.out.println("Number after toggling the last bit: " + toggledNumber);
		 
		


	}

}
