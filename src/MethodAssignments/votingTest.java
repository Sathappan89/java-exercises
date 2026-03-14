package MethodAssignments;

public class votingTest {
	
	public boolean result(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		votingTest v1=new votingTest();
		boolean a=v1.result(3);
		System.out.println(a);
	}

}
