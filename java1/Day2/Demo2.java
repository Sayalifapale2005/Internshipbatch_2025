package demo1.java;
import java.util.*;

public class Demo2
{
	void printeven()
	{
	  int range;//Local Variable
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the range to print even number:-");
	  range = sc.nextInt();
	  int i;
	  for(i=0;i<=range;i++)
	  {
		  if(i%2==0)
		  {
			  System.out.println(i);
			  
		  }  
	  }
	  
	}

	public static void main(String[] args)
	{
		
      Demo2 d2 = new Demo2();
      d2.printeven();
	}

}
