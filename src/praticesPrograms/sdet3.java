package praticesPrograms;

//Java Program to find Fibonacci Series until a given number range
public class sdet3 {
//0,1,1,2,3,5,8,13,21,34....
	public static void main(String[] args) {

		int number = 10;

		int firstNumber = 0;
		int secondNumber = 1;

		for (int i = 0; i < number; i++) {
			System.out.println(firstNumber + " ");
			int temp = firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=temp;
		}

	}

}
