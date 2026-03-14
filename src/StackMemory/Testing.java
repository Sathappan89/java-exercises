package StackMemory;
public class Testing {
	public void m1() {
		System.out.println("m1 method");
		int i = 10;
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		int t = 10;
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
		int p = 10;
	}
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t1 method");
		t3();
	}
	
	public static void t3() {
		System.out.println("t1 method");
		t1();
	}
	
	
	public static void main(String[] args) {
		Testing tr = new Testing();
		tr.m1();
	}
}