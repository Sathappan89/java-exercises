package ConstructorAssignments;

public class Person {

	String name;
	int age;
	char gender;
	double heights;

	public Person(String name, int age, char gender, double heights) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.heights = heights;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Sathappan", 37, 'M', 35.56);
		System.out.println(p1.name + " " + p1.age + " " + p1.gender + " " + p1.heights);
		
		Person p2 = new Person("MuthuKumar", 36, 'M', 135.56);
		System.out.println(p2.name + " " + p2.age + " " + p2.gender + " " + p2.heights);

	}

}
