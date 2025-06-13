package Day9;

public class DemoSwap {

	public static void main(String[] args) {
		int a=67;
		int b=12;
		System.out.println("value before swapping.");
		System.out.println("value of a:-"+a+"Value of b:-"+b);
		//swapping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value after swapping.");
		System.out.println("value of a:-"+a+"Value of b:-"+b);

	}

}
