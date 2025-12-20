package JavaArrays;

public class Calculateaverage {

	public static void main(String[] args) {

		int my_array[] = { 10,10,10,10,10};
		int sum = 0;
		int count = 0;
		for (int i = 0; i < my_array.length; i++) {
			++count;
			sum = sum + my_array[i];

		}

		System.out.println(sum);
		double result = sum / (count);
		System.out.println(result);

	}

}
