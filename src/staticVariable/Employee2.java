package staticVariable;

public class Employee2 {
	static int a=90;
	public static void main(String[] args) {
		Employee2 e1=new Employee2();
		System.out.println(a);  /*Use it directly*/
		System.out.println(Employee2.a); /*Use by class name*/
		System.out.println(e1.a); /*Use it object reference name : not recommended*/
		Employee2 e2=new Employee2();
		System.out.println(e2.a);
		//Static variable can be changed		
		Employee2.a=70;
		System.out.println(e1.a);
		System.out.println(e2.a);
	}
}