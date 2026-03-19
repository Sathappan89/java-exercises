package java_Constructor;

/*Write a Java program to create a class called "Book" with instance variables title, author, and price. 
 * Implement a default constructor and two parameterized constructors:
 * 
 * One constructor takes title and author as parameters.
 * 
 * The other constructor takes title, author, and price as parameters.
 * 
 * Print the values of the variables for each constructor.
 * */
public class Book {

	public String title;
	public String author;
	public int price;

	public Book() {
		System.out.println("Boook Constructor");
	}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setAuthor("obama");
		b1.setPrice(99);
		b1.setTitle("newBook");

		System.out.println(b1.getAuthor());
		System.out.println(b1.getTitle());
		System.out.println(b1.getPrice());

		Book b2 = new Book("testing", "tester");
		System.out.println(b2.getAuthor() + " " + b2.getTitle() + " " + b2.price);

		Book b3 = new Book("king", "laptop", 99652);
		System.out.println(b3.getAuthor() + " " + b3.getTitle() + " " + b3.price);
	}

}
