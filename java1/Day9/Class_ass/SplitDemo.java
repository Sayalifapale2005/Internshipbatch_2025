package Day9;

public class SplitDemo {

	public static void main(String[] args) {
		String str = "hey! please look at this.";
		String arr[]= str.split(" ");
		for(String arr1 : arr)
		{
			System.out.println(arr1);
		}
	}

}
