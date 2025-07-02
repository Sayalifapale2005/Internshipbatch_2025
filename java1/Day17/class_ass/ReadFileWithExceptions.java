package Day17;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

 class ReadFileWithExceptions {
	 public static void main(String[] args) {
	        BufferedReader reader = null;

	        try {
	            // Try to open and read the file
	            reader = new BufferedReader(new FileReader("sample.txt")); // Replace with your filename
	            String line;

	            System.out.println("Reading file contents:");
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (FileNotFoundException e) {
	            System.out.println("FileNotFoundException caught: File 'sample.txt' not found.");
	        } catch (IOException e) {
	            System.out.println("IOException caught while reading the file: " + e.getMessage());
	        } finally {
	            // Close the reader safely
	            try {
	                if (reader != null) {
	                    reader.close();
	                }
	            } catch (IOException e) {
	                System.out.println("IOException caught while closing the file: " + e.getMessage());
	            }
	        }

	        System.out.println("Program continues after handling exceptions.");
	    }
	
	


}
