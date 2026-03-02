package praticesPrograms;

public class sdet7 {

	public static void main(String[] args) {
		int number = 153;
		int originalNumber = number;
		int q;
		int result = 0;

		while (number > 0) {
			q = number % 10;
			result = result + (q * q * q);
			number = number / 10;
		}
		if (result == originalNumber) {
			System.out.println(originalNumber + " is an Armstrong number");
		} else {
			System.out.println(originalNumber + " is not a Armstrong number");
		}
	}

}
