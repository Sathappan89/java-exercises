package MethodsAssignmentTwo;

public class functionforPrimenumber {
	
	public static void primeNUmber(int number) {
	boolean isPrime = true;
		
		if(number<=1) {
			isPrime = true;
		}
		else {
			
			for(int i=2;i<number;i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
			}
			
		}
		if(isPrime)
		{
			System.out.println("number is the prime number : " +number);
		}else {
			System.out.println("number is not prime number : " +number);
		}

	}
	

	public static void main(String[] args) {
		
		primeNUmber(3);
		primeNUmber(5);
		primeNUmber(12);
}
}