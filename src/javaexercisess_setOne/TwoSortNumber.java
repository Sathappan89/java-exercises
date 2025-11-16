package javaexercisess_setOne;

public class TwoSortNumber {

	/*Sort Two Numbers*/
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]); //5
		int b = Integer.parseInt(args[1]); //2
		
		if(b<a) {
			int t=a;
			a=b;
			b=t;	
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
