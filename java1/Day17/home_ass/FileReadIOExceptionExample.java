package Day17;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReadIOExceptionExample {
	 public static void main(String[] args) {
	        String fileName = "nonexistent_file.txt"; // File that doesn't exist

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            System.out.println("Reading file contents:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.out.println("IOException caught: Unable to read the file.");
	            System.out.println("Error message: " + e.getMessage());
	        }
	        System.out.println("Program continues after handling the exception.");
	    }
}
