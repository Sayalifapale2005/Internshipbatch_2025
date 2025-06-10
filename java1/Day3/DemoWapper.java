package Day3.java;

public class DemoWapper {

	public static void main(String[] args) {
	        // Sample string values
	        String intString = "100";
	        String doubleString = "123.45";
	        String floatString = "67.89";
	        String longString = "123456789";

	        try {
	            // Convert to int
	            int intValue = Integer.parseInt(intString);
	            System.out.println("Integer value: " + intValue);

	            // Convert to double
	            double doubleValue = Double.parseDouble(doubleString);
	            System.out.println("Double value: " + doubleValue);

	            // Convert to float
	            float floatValue = Float.parseFloat(floatString);
	            System.out.println("Float value: " + floatValue);

	            // Convert to long
	            long longValue = Long.parseLong(longString);
	            System.out.println("Long value: " + longValue);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format: " + e.getMessage());
	        }
	    }
	}


