package java_Constructor;
/*Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. 
 * Implement a default constructor and a parameterized constructor that takes all three instance variables. 
 * Use constructor chaining to initialize the variables. Print the values of the variables.*/

public class Student {
	
	public int studentId;
	public String studentName;
	public char grade;

	public Student() {
		this(0,"Unknown",'A');
		System.out.println("Default Constructor");
	}
	
	public Student(int studentId,String studentName, char grade) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.grade=grade;
	}
	
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("Student1 ID: " + student1.studentId);
		System.out.println("Student1 Name: " + student1.studentName);
		System.out.println("Student1 Grade: " + student1.grade);
		System.out.println("----------------------------");
		Student student2 = new Student(101, "Cullen", 'B');
		System.out.println("Student1 ID: " + student1.studentId);
		System.out.println("Student1 Name: " + student1.studentName);
		System.out.println("Student1 Grade: " + student1.grade);
	}

}
