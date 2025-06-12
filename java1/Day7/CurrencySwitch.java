package Day7;

import java.util.Scanner;

public class CurrencySwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter currency code (INR, USD, EUR, GBP): ");
        String currencyCode = scanner.nextLine().toUpperCase();  // Convert to uppercase for consistency

        switch (currencyCode) {
            case "INR":
                System.out.println("Symbol: ₹");
                break;
            case "USD":
                System.out.println("Symbol: $");
                break;
            case "EUR":
                System.out.println("Symbol: €");
                break;
            case "GBP":
                System.out.println("Symbol: £");
                break;
            default:
                System.out.println("Invalid currency code.");
        }
	}

}
