package praticesPrograms;

import java.util.Arrays;

public class test7 {

	public static void main(String[] args) {
		
		int a [] = {10,20,30,40,50};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("");
		System.out.println("----for each loop----");
		for(int naveen:a) {
			System.out.println(naveen);
		}
		
		String browser[] = new String[4];
		System.out.println(Arrays.toString(browser));

		browser[0] = "chrome";
		browser[1] = "firefox";
		browser[2] = "IE";
		browser[3] = "safari";

		System.out.println(Arrays.toString(browser));
		
		
		
	}

}
