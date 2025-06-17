package Day11;
class BankAccount
{
	int accNum;
	String accHolder;
	double accBal;
	BankAccount(int accNum,String accHolder,double accBal)
	{
		this.accNum=accNum;
		this.accHolder=accHolder;
		this.accBal=accBal;
	}
	void display()
	{
		System.out.println("Account Number:-"+accNum);
		System.out.println("Account Holder:-"+accHolder);
		System.out.println("Account Balance:-"+accBal);
	}
}

public class SavingAccount extends BankAccount{
	float interestRate;
	SavingAccount(int accNum,String accHolder,double accBal,float interestRate)
	{
		super(accNum, accHolder, accBal );
		this.interestRate=interestRate;
	}
	void displayDetails()
	{
		System.out.println("Interest Rate:-"+interestRate);
	}

	public static void main(String[] args) {
		SavingAccount s= new SavingAccount(101,"Sayali",3000.0,3.5f);
		s.display();
		s.displayDetails();

	}

}
