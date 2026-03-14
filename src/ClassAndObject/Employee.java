package ClassAndObject;

public class Employee {
	
	String name;
	int age;
	String deptName;
	String city;
	double salary;
	boolean isPermanent;
	char gender;

	public static void main(String[] args) {
	
		
		Employee e = new Employee();
	
		e.age=20;
		e.deptName="cse";
		e.city="chandler";
		e.salary=100.35;
		e.isPermanent=true;
		e.gender='M';
		e.name=null;
		e.name="test";
		System.out.println(e.name + " " +e.age+ " "+e.deptName + " " + e.city + " " +e.salary + " " +e.isPermanent +" " +e.gender);
		
		Employee e3 = new Employee();
		e3.name="peter";
		System.out.println(e3.name);
		
		e3.name=null;
		System.out.println(e3.name);
		
		Employee e4=new Employee();
		e4=null;
		e4.name="Lisa";
		System.out.println(e4.name);
		
	}

}