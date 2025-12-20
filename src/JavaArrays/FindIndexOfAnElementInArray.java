package JavaArrays;

/*Write a Java program to find the index of an array element.*/
public class FindIndexOfAnElementInArray {

	public static void main(String[] args) {

		int my_array[] = { 1, 10, 10, 10, 10, 10, 10, 10, 10, 100 };
		
		int li=my_array[0];
		int hi=my_array[my_array.length-1]; //100
		int lenght = my_array.length; //10
		
		System.out.println(li); //1
		System.out.println(hi); //100
		System.out.println(lenght); //10
		int j=0;
		for(int i=0;i<lenght;i++) {
			System.out.println("Index of the array is " + j + " = "+my_array[i]);
			j++;
		}
		System.out.println("Index of the array is " + (j-1));
		
		
	}

}
