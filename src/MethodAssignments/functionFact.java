package MethodAssignments;

public class functionFact {
	
	public int fact(int number) {
		int fact =1;
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		
		functionFact ff=new functionFact();
		int result = ff.fact(5);
		System.out.println(result);
	}

}
