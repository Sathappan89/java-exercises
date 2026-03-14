package StackMemory;

public class CustomerCalling {

	public void testing() {
		System.out.println("Welcome to testing");
	}
	
	public static void tester(CustomerCalling cct) {
		System.out.println("Welcome to tester");
		cct.testing();
	}
	
	public static void main(String[] args) {
		
		CustomerCalling cc= new CustomerCalling();
		CustomerCalling.tester(cc);

	}

}
