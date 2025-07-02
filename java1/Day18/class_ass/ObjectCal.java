package Day18;

public class ObjectCal {
	static int count;
	ObjectCal()
	{
		count++;
		System.out.println("Number of object created:-"+count);
	}
	

	public static void main(String[] args) {
		ObjectCal o = new ObjectCal();
		ObjectCal o2= new ObjectCal();
		

	}

}
