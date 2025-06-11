package Day6;
import java.util.Scanner;

public class SplitDemo1 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Prompt the user to enter the comma-separated string
		        System.out.print("Enter student details (comma-separated): ");
		        String input = scanner.nextLine();

		        // Use split() method to split the string into parts
		        String[] details = input.split(",");

		        // Print each detail separately
		        System.out.println("Student Details:");
		        for (String detail : details) {
		            System.out.println(detail.trim());
		        }

	}

}
