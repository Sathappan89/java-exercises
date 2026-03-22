package W3Constructor;
/*Write a Java program to create a class called "Book" with instance variables title, author, and price. 
 * Implement a default constructor and two parameterized constructors:

One constructor takes title and author as parameters.
The other constructor takes title, author, and price as parameters.
Print the values of the variables for each constructor.
*/

public class Book {

	public String title;
	public String author;
	public int price;
	
	public Book() {
		System.out.println("This is default constructor for Book");
		this.title="Unknown";
		this.author="Unknown";
		this.price=0;
	}
	
	public Book(String title) {
		//this.gloabl variable = new variable
		this.title=title;
	}
	
	public Book(String title,String author,int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println("Book1 Title: " + b1.title);
        System.out.println("Book2 Author: " + b1.author);
        System.out.println("Book3 Price: " + b1.price);
        System.out.println("-------------------------");
		b1.title="Atomic Habits";
		b1.author="James Clear";
		b1.price=20;
		System.out.println("Book1 Title: " + b1.title);
        System.out.println("Book1 Author: " + b1.author);
        System.out.println("Book1 Price: " + b1.price);
		
		Book b2=new Book("MathBook");
		
		Book book3 = new Book("Altered Carbon", "Richard K. Morgan", 18);
		System.out.println("Book3 Title: " + book3.title);
        System.out.println("Book3 Author: " + book3.author);
        System.out.println("Book3 Price: " + book3.price);
		
	}

}
