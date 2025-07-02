package Day17;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNonExistentFile {
	

	
	    public static void main(String[] args) {
	        File file = new File("nonexistent_file.txt"); // File that does not exist

	        try {
	            Scanner scanner = new Scanner(file);
	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();
	                System.out.println(line);
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("FileNotFoundException caught: The file does not exist.");
	        }

	        System.out.println("Program continues after handling the exception.");
	    }
	

}
