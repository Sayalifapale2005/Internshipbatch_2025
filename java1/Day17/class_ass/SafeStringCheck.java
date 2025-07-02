package Day17;

public class SafeStringCheck {
	public static void main(String[] args) {
        String message = null; // Try changing this to "Hello" to test with a non-null value

        if (message != null) {
            // Safe to call methods on the string
            System.out.println("Message length: " + message.length());
            System.out.println("Uppercase message: " + message.toUpperCase());
        } else {
            // Handle null case
            System.out.println("The string is null. Cannot call methods on it.");
        }

        System.out.println("Program continues after null check.");
    }
}
