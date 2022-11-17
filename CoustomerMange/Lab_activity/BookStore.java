package thread;

import java.util.*;
import java.util.stream.Collectors;
class Book
{
	String id;
	String title;
	String author;
	String category;
	float price;
	
	public Book(String id,String name,String author, String category,float price)
	{
		this.id=id;
		this.title=name;
		this.author=author;
		this.category=category;
		this.price=price;
	}
	void display()
	{
		System.out.println(id +" "+title+" "+author+ " "+category+ "  "+price);
	}
	
}

	public class BookStore {

	public static void main(String[] args) {
		Book b =new Book("Book", "python", "A Brain-Friendly Guide", "Programming", 200);
		Book b1 =new Book("Book", "c++", " Bjarne Stroustrup", "technology", 380);		
		Book b2 =new Book("Book", "java", "E Balagurusamy", "Programming", 250);
		b.display();
		b1.display();
		b2.display();
		
		ArrayList<Book> mylist=new ArrayList<Book>();
		
		 //add a new Book object into the collection
		mylist.add(b);
		mylist.add(b1);
		mylist.add(b2);
		
		//search a book based on title and if found display the details
		List<String>searchByTitle =mylist.stream().map(p -> p.title).collect(Collectors.toList());
		System.out.println(searchByTitle);
	
		//search a book based on author and if found display the details
		List<String>searchByAuthor =mylist.stream().map(p1 -> p1.author).collect(Collectors.toList());
		System.out.println(searchByAuthor);
	}
}
