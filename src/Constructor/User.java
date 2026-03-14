package Constructor;
public class User {
	// class instance variable
	String name;
	int age;
	double salary;
	String dob;
	// const...is used to initialize the instance variables with the local variables
	public User(int age, String name) { // 2 param const..local vars
		System.out.println("User--2 Param const..");
		// Global Variable = local Variable
		this.name = name;
		this.age = age;
	}
	public User(int age, String name,double salary) { // 2 param const..local vars
		System.out.println("User--2 Param const..");
		// Global Variable = local Variable
		this.name = name;
		this.age = age;
		this.salary=salary;
	}
	public static void main(String[] args) {
		User u1 = new User(30, "Jaya");
		System.out.println(u1.age); // 30
		System.out.println(u1.name); // jaya

		System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.dob); // Jaya 30 0.0 null
		
		User u2=new User(30,"Naveen",1000.00);
		System.out.println(u1.name + " " + u1.age + " " + u1.salary + " " + u1.dob); /*User--2 Param const..
		Jaya 30 0.0 null*/
	}
}