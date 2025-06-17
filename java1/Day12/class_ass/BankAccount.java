package Day12;
import java.util.*;

public class BankAccount {
	private int accnum;
	private double bal;
	BankAccount(int accnum,double bal)
	{
		this.accnum=accnum;
		this.bal=bal;
	}
	void deposit(Scanner sc)
	{
		System.out.println("Enter the amount you want to deposit:-");
		double damt=sc.nextDouble();
		if(damt>0)
		{
			System.out.println("you have deposited:-"+damt);
			System.out.println("Now your balance become:-"+(bal+damt));
		}
		else
		{
			System.out.println("please enter positive amount.");
		}
	}
	void withDraw(Scanner sc)
	{
		System.out.println("Enter the amount to withdraw:-");
		double withdrawamt=sc.nextDouble();
		if(withdrawamt<bal && withdrawamt>0)
		{
			System.out.println("You have withDraw:-"+withdrawamt);
			System.out.println("Now you have balance left:"+(bal-withdrawamt));
			
		}
		else
		{
			System.out.println("You have insufficient balance.");
		}
	}
	   void displayInfo()
	  {
		  System.out.println("AccountNumber:-"+accnum);
		  System.out.println("Account Balance:-"+bal);  
	  }
		
	

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount b = new BankAccount(12345,5000.0);
    b.displayInfo();
    b.deposit(sc);
    b.withDraw(sc);


	}

}
