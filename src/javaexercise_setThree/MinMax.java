package javaexercise_setThree;

public class MinMax {

	public static void main(String[] args) {
		
        int p[] = { 1, 4, 7, 10, 4, 5, 2, 11, 3 };
        
        int min = p[0];   // start with the first element
        
        int max = p[0];  // start with the first element
        
        for(int i = 1; i < p.length; i++) {
            if(p[i] < min) {
                min = p[i];   // update min
            }
            
            if(p[i] > max) {
            	max=p[i];
            }
            
        }
        
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}