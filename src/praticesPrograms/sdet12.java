package praticesPrograms;

public class sdet12 {

	public static void main(String[] args) {
		 int year = 1997;
		 //year is divisible by 4 and not by 100 or divisible by 400
		 if(year%4==0 && year%100!=0 || year%400==0) {
			 System.out.println(year + " is a leap year");
		 }
		 else {
			 System.out.println(year + " not is a leap year");
		 }

	}

}
