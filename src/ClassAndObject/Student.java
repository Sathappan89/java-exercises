package ClassAndObject;

public class Student {

	String name;
	int age;
	char gender;
	
	public static void main(String[] args) {
		
		int totalStudent=0;
		Student s1 = new Student();
		++totalStudent;
		s1.name="Sathappan";
		s1.age=37;
		s1.gender='M';
		System.out.println(s1.name + " " + s1.age + " " + s1.gender);
		
		s1.age=38;
		System.out.println(s1.name + " " + s1.age + " " + s1.gender);
		
		Student s2 = new Student();
		++totalStudent;
		s2.name="Annamalai";
		s2.age=39;
		s2.gender='M';
		System.out.println(s2.name + " " + s2.age + " " + s2.gender);
		System.out.println(totalStudent);
		
	}

}