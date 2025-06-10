package Day3.java;
import java.util.*;

public class DemoRec {
	
	public static void main(String[] args)
	{
		float len;
		float br;
		float area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle:-");
		len = sc.nextFloat();
		System.out.println("Enter the breadth of rectangle:-");
		br = sc.nextFloat();	
		area = len*br;
		System.out.println("Area of rectangle is:-"+area);
	

	}

}
