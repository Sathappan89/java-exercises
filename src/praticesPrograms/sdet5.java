package praticesPrograms;

public class sdet5 {
/*Java Program to Find Factorial on given number*/
	public static void main(String[] args) {
			
		int number=5;
		int fact = 1;
		
		for(int i=number;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
