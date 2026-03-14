package MethodsAssignmentTwo;

import java.util.Arrays;

public class p6 {
	
	public static Object[] reverseArray(Object[] array) {
		int length=array.length; //5
		Object[] reversedArray = new Object[length];
		
		int count = 0;
		for (int i = length-1; i >=0; i--) {
		reversedArray[count] = array[i];
		count++;
		}
		return reversedArray;		
	}

	public static void main(String[] args) {
		Object[] originalArray = {1, "test", 3, 4, 5};
		Object[] reversedArray = reverseArray(originalArray);
		System.out.println(Arrays.toString(reversedArray));
	}

}