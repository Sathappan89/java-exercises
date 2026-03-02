package praticesPrograms;

/*
	4 3 2 1 
	4 3 2 
	4 3 
	4
 * */
public class sdet16 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 4; j >= 1; j--) {
				if (j >= i) {
					System.out.print(j + " ");
				}
			}
			System.out.println("");
		}
	}
}