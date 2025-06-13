package Day9;
import java.util.*;

public class SplitEmail {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your email:-");
		String email= sc.nextLine();
		String part[]=email.split("@");
		for(String part1 : part)
		{
			System.out.println(part1);
		}
		

	}

}
