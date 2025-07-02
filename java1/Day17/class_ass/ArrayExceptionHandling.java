package Day17;

public class ArrayExceptionHandling {
	 public static void main(String[] args) {
	        int[] numbers = null; // Intentionally set to null to demonstrate NullPointerException
	        // int[] numbers = {1, 2, 3, 4, 5}; // Uncomment this to avoid NullPointerException

	        try {
	            for (int i = 0; i <= numbers.length; i++) { // Note: using <= will cause ArrayIndexOutOfBoundsException
	                System.out.println("Element at index " + i + ": " + numbers[i]);
	            }
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: The array is null.");
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught: Index out of bounds.");
	        }

	        System.out.println("Program continues after handling exceptions.");
	    }
}
