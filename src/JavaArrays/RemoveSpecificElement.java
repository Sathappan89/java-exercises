package JavaArrays;

import java.util.Arrays;

/*Remove specific element from array*/
public class RemoveSpecificElement {

	public static int[] remove(int[] my_array, int num) {

        // Step 1: Count how many elements are NOT equal to num
        int count = 0;
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] != num) {
                count++;
            }
        }

        // Step 2: Create new array with reduced size
        int[] result = new int[count];

        // Step 3: Copy elements except the one to remove
        int j = 0; // index for result array
        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] != num) {
                result[j] = my_array[i];
                j++;
            }
        }

        return result;
    }


	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
	
		
		int[] updatedArray = remove(my_array, 25);

        System.out.println("Original: " + Arrays.toString(my_array));
        System.out.println("Updated : " + Arrays.toString(updatedArray));

		
		

	}

}
