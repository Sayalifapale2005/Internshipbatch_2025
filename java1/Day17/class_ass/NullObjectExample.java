package Day17;

public class NullObjectExample {
	 
	    public static void main(String[] args) {
	        String message = null;  // Null object reference

	        try {
	            // Attempting to call a method on a null object
	            int length = message.length();  // This will throw NullPointerException
	            System.out.println("Length of the message: " + length);
	        } catch (NullPointerException e) {
	            System.out.println("NullPointerException caught: Cannot call a method on a null object.");
	        }

	        System.out.println("Program continues after handling the exception.");
	    }
	


}
