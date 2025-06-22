package Day14;
import java.lang.*;

public class NumberThread extends Thread{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		NumberThread n= new NumberThread();
		n.start();

	}

}
