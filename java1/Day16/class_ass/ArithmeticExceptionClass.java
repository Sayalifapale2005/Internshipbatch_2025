package Day16;

public class ArithmeticExceptionClass {

	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
			int ans=num1/num2;
			System.out.println("Answer:-"+ans);
		}
		catch(ArithmeticException a){
			System.out.println(a);
		}
	}

}
