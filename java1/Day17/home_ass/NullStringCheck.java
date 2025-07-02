package Day17;

public class NullStringCheck {
	public static void main(String[] args) {
        String message = null; // Try changing this to "Hello, World!" to test with a valid string

        if (message != null) {
            // Safe to call methods on the string
            System.out.println("String length: " + message.length());
            System.out.println("Uppercase: " + message.toUpperCase());
        } else {
            // Handle null case
            System.out.println("The string is null. Cannot call methods on it.");
        }

        System.out.println("Program continues after null check.");
    }

}
