package MethodsAssignmentTwo;
/*
Method with Return Value (double) and with Parameters (double[]):

Assignment: Write a method to calculate the average of elements in a double array and return the
result.

Signature: public double calculateAverage(double[] numbers)*/

public class p4 {

	public static double result(double[] numbers) {

		double sum = 0.0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
		return sum/numbers.length;

	}

	public static void main(String[] args) {
		p4.result(new double[] { 1.0, 2.0, 3.0, 4.0 });
		
		double d[]= {10.0,20.0,30.0};
		double result=result(d);
		System.out.println(result);
		
	}

}
