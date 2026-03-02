package praticesPrograms;

public class sdet4 {

	public static void main(String[] args) {
		
		int a =10;
		int b=5;
		
		System.out.println("Original a = " + a);
		System.out.println("Original b = " + b);
		
		a=a+b; //10+5 = 15
		b=a-b; //15-5 = 10
		a=a-b; //15-10 = 5
		
		System.out.println("Swap a = " + a);
		System.out.println("Swap b = " + b);

	}

}
