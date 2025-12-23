package JavaArrays;

import java.util.Arrays;

public class Reverseanintegerarray {
	
	public static int[] reverse(int arr[]) {
		
		int len = arr.length;
		System.out.println(len);
		
		int [] reversearray = new int[len];
		
		
		int j=0;
		
		for(int i=len-1;i>=0;i--) {
			reversearray[i]=arr[j];
			j++;
		}
	
		
		return reversearray;
	}

	public static void main(String[] args) {
	
		
		int []arr = {10,20,30,40,50,60,70,80,90};
		
		int []result=reverse(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(result));

	}

}
