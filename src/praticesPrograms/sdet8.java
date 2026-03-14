package praticesPrograms;

public class sdet8 {

	public static void main(String[] args) {
		int number = 12543;
		int digitCount = 0;

		

		while (number > 0) {
			int rem=number%10;
			digitCount++;
			number=number/10;
		}
		System.out.println(digitCount);
	}

}
