package W3Constructor;

import java.util.Arrays;

public class Classroom {

	public String className;
	public String students[];
	
	
	public Classroom(String className,String[] students) {
		this.className=className;
		this.students=students;
	}
	
	public static void main(String[] args) {
		String st[]= {"SAT","HAP","PAN"};
		Classroom cr=new Classroom("CSE A",st);
		System.out.println(cr.className + " -- " + Arrays.toString(st));
	}

}
