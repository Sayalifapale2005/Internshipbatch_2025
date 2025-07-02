package Day19;

public class Book {
	String title;
	String authr;
	Book(String title,String authr)
	{
		this.authr=authr;
		this.title=title;
		System.out.println("Title:-"+title);
		System.out.println("Author:-"+authr);
	}
	
	Book(Book b)
	{
		this.authr=b.authr;
		this.title=b.title;
		System.out.println("Title:-"+title);
		System.out.println("Author:-"+authr);
	}

	public static void main(String[] args) {
		Book b1 = new Book("Sane Guruji","Shyam chi Aai");
		Book b2 = new Book(b1);

	}

}
