package Day6;

public class SplitDemo2 {

	public static void main(String[] args) {
		        String text = "Hello? How are you? Good!";
		        String[] parts = text.split("\\?\\s*");

		        for (String part : parts) {
		            System.out.println(part);
		        }

	}

}
