package praticesPrograms;
/*Write a java program to calculate the sum of digits of a number*/
public class sdet10 {

	public static void main(String[] args) {
		int number=12991;
		int sum=0;
		
		while(number>0) {
			int reminder = number%10;
			sum=sum+reminder;
			number=number/10;
		}
		System.out.println(sum);
	}

}
