package Constructor;

public class callByReference {

	public void test() {
		System.out.println("Testing");
	}
	
	public static void tester(callByReference rr) {
		System.out.println("call  by reference");
		rr.test();
	}
	
	public static void main(String[] args) {
		callByReference cr=new callByReference();
		callByReference.tester(cr);

	}

}
