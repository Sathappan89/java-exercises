package W3Constructor;

public class Dog {

	public String name;
	public String color;
	
	public Dog(String name,String color) {
		this.name=name;
		this.color=color;
	}
	
	public static void main(String[] args) {
		Dog d1=new Dog("Test","Black and White");
		System.out.println(d1.name + " - "+ d1.color);
		

	}

}
