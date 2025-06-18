package Day12;
abstract class Bank
{
	abstract void getInterestRate();
	
}
class SBI extends Bank
{
	void getInterestRate()
	{
		System.out.println("Interest Rate of SBI is 2.5%");
	}
}
class HDFC extends Bank
{
	void getInterestRate()
	{
		System.out.println("Interest Rate of HDFC is 3.5%");
	}
}

public class MainBank {

	public static void main(String[] args) {
		Bank s= new SBI();
		s.getInterestRate();
		Bank h= new HDFC();
		h.getInterestRate();
	}

}
