import java.util.*;

class Book{
	String title;
	String authors;
	int pages;
	float price;
	String publisher;
	
	Book(){}
	
	Book(String title, String authors, int pages, float price, String publisher){
		this.title = title;
		this.authors = authors;
		this.pages = pages;
		this.price = price;
		this.publisher = publisher;
	}
	
	void printDetails(){
		System.out.println("Title of the book is: "+title);
		System.out.println("Author of the book is: "+authors);
		System.out.println("Number of pages in the book are: "+pages);
		System.out.println("Price of the book is: "+price);
		System.out.println("Publisher of the book is: "+publisher);
		System.out.println();
	}
}


public class Library{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter total number of books: ");
		int books_no = sc.nextInt();
		sc.nextLine();
		
		Book b[] = new Book[books_no];
		
		for(int i = 0; i < books_no; i++){
			System.out.println("Please enter details of books.");
			System.out.println();
		
			System.out.print("Enter the title of the book: ");
			String t = sc.nextLine();
			
			System.out.print("Enter the author of the book: ");
			String a = sc.nextLine();
			
			System.out.print("Enter the number of pages in the book: ");
			int pg = sc.nextInt();
			
			System.out.print("Enter the price of the book: ");
			int mrp = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Enter the publisher ofthe book: ");
			String pub = sc.nextLine();
			
			b[i] = new Book(t, a, pg, mrp, pub);
		}
		
		System.out.println("Details of books in the library are as follows:");
		for(int i = 0; i < books_no; i++){
			b[i].printDetails();
			System.out.println("=======================================================");
		}
	}
}