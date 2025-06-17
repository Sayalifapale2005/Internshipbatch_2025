package Day12;
interface Printable
{
	abstract void print();
}
class Document implements Printable
{
	 public void print()
	{
		System.out.println("Print Document");
	}
}
class Photo implements Printable
{
	public void print()
	{
		System.out.println("Print Photo");
	}
}


public class MainPrintable {
	public static void main(String args[])
	{
		Printable d= new Document();
		d.print();
		Printable p= new Photo();
		p.print();
	}
	

}
