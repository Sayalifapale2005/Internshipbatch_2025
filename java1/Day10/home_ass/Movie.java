package Day10;

import java.util.Scanner;

public class Movie {
	String title;
	String director;
	int releaseYear;
	
	void accept(Scanner sc)
	{
		System.out.println("Enter the movie title:-");
		title= sc.nextLine();
		System.out.println("Enter the movie director:-");
		director= sc.nextLine();
		System.out.println("Enter the release year:-");
		releaseYear= sc.nextInt();
	}
	void display()
	{
		System.out.println("Title:-"+title);
		System.out.println("Director:-"+director);
		System.out.println("Release Year:-"+releaseYear);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Movie m= new Movie();
		m.accept(sc);
		m.display();
		

	}

}
