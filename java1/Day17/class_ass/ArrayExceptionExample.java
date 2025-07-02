package Day17;

public class ArrayExceptionExample {
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Array with 5 elements

        try {
            // Attempting to access the 6th element (index 5)
            System.out.println("Accessing 6th element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an index that doesn't exist in the array.");
        }

        System.out.println("Program continues after handling the exception.");
    }

}
