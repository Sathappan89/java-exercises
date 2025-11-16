package javaexercisess_setOne;

import java.util.Scanner;

public class JavaProg5 {

	/*
	 * Write a Java Program to compute body mass index (BMI). Test Data
	 * 
	 * Input weight in pounds : 452 I Input height in inches : 72
	 * 
	 * Expected Output: Body Mass Index is 61.30159143458721
	 * 
	 */

	/*
	 * BMI = weight (lb) * 703 / height
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Input weight in pounds : ");
		int weight = sc.nextInt();

		System.out.print("Input height in pounds : ");
		int height = sc.nextInt();

		double BMI = (weight * 703.0) / (height * height);

		System.out.println("Body Mass Index is " + BMI);

		sc.close();
	}

}
