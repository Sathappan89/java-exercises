package ClassAndObject;
public class Book {
	String title;
	String author;
	int pageCount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalBook=0;
		
		Book B1=new Book();
		B1.title="Math";
		B1.author="Ram";
		B1.pageCount=101020;
		System.out.println(B1.title +" "+B1.author+" "+B1.pageCount);
		++totalBook;
		
		B1.pageCount=112233;
		System.out.println(B1.title +" "+B1.author+" "+B1.pageCount);
		
		Book B2=new Book();
		B2.title="Chemistry";
		B2.author="John";
		B2.pageCount=101;
		++totalBook;
		System.out.println(B2.title +" "+B2.author+" "+B2.pageCount);
		System.out.println(totalBook);
	}
}