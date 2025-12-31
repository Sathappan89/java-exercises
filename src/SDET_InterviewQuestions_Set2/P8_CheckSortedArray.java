package SDET_InterviewQuestions_Set2;

import java.util.Arrays;

public class P8_CheckSortedArray {
//Check if a static array is sorted
	public static void main(String[] args) {
		
		int arr[]= {3,1,4,6,7};
		boolean sorted = true;
		int len =arr.length;
		
		for(int i=0;i<len-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted = false;
				break;
			}
		}
		
		if(sorted) {
			System.out.println(Arrays.toString(arr) + " = Sorted = "+sorted);
		}
		else {
			System.out.println(Arrays.toString(arr) + " = Not Sorted = false");
		}

	}

}
