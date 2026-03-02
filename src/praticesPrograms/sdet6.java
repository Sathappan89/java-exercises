package praticesPrograms;
public class sdet6 {
	public static void main(String[] args) {

		int number = 107;
		int rev = 0;
		while (number > 0) {
			int q = number % 10;
			rev = rev*10+q;
			number = number / 10;
		}
		System.out.println(rev);
	}
}