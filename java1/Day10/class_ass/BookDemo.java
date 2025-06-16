package Day10;

public class BookDemo {
	String title;
	String auth;
	BookDemo(String title,String auth)
	{
		this.title=title;
		this.auth=auth;
	}
	void display()
	{
		System.out.println("Title is:-"+title);
		System.out.println("author is:-"+auth);
	}

	public static void main(String[] args) {
		BookDemo b1= new BookDemo("Agni pankh","A.P.J. Abdul Kalam");
		BookDemo b2= new BookDemo("Shyam chi Aai","Sane Guruji");
		b1.display();
		b2.display();

	}

}
