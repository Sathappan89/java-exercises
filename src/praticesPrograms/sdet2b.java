package praticesPrograms;

import java.util.Scanner;

/* Java Program to print first 10  Prime number */
//2,3,5,7,11,13,17,19,23,29,31,37,41,43
public class sdet2b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int number = 2;
		int count =0;
		
		while(count<10) {
			boolean isPrime = true;
				
			for(int i=2;i<number;i++) {
					if(number%i==0) {
						isPrime = false;
						break;
					}
			}
			
			if(isPrime) {
				System.out.println(number);
				count++;
			}
		number++;
			
		}

	
		sc.close();

	}

}
