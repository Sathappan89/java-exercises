package JavaTopCasting;

public class CalByReference {

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}

	public static double sub(CalByReference c) {
		double d=c.add(20, 30);
		return d;
		
	}

	public static void main(String[] args) {
		CalByReference cr = new CalByReference();
	
		double result=CalByReference.sub(cr);
		System.out.println(result);
	}

}
