package StackMemory;
public class MethodCalling {
	public void m1() {
		System.out.println("m1 method");
	}

	public static void t1(MethodCalling ob) { //Class Parameter 
		System.out.println("t1 method");
		ob.m1();
		
	}

	public static void main(String[] args) {
		MethodCalling obj = new MethodCalling();
		MethodCalling.t1(obj); //obj is reference 	
	}
}