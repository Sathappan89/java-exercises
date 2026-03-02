package praticesPrograms;

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10*/
public class sdet11 {

	public static void main(String[] args) {
		int count = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				if (i >= j) {
					System.out.print(count+ " ");
					count++;
				}
			}
			System.out.println("");
		}

	}

}
