package JavaExceptionHandling;

public class ThrowExceptionfoOddNumber {
/*Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd*/
	
	public static void Oddnumber(int num) {
		
		
		if(num%2==1) {
			System.out.println("num is odd");
			throw new OddNumberThrow("number is odd");
		}
		else {
			System.out.println("num is even");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		ThrowExceptionfoOddNumber.Oddnumber(10);
		
		
	}

}