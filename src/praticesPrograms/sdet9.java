package praticesPrograms;
//11,101 and 12321
public class sdet9 {

	public static void main(String[] args) {
		
		int number = 14542321;
		int originalNumber = number;
		int rev=0;
		
		while(number>0) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
		
		if(originalNumber == rev) {
			System.out.println("number is palindrome " +originalNumber);
		}
		else {
			System.out.println("number is not a  palindrome " +originalNumber);
		} 
		
	}
}