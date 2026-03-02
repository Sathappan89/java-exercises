package praticesPrograms;

import java.util.Arrays;

public class test8 {

	public static void main(String[] args) {
		
		String details[] = new String[4];
		
		details[0]="testing";
		
		details[1]="my";
		details[2]="skill";
		details[3]="sathappan";
		
		System.out.println(details);
		System.out.println(Arrays.toString(details));
		
		for(String naveen:details) {
				System.out.println(naveen);
				if(naveen.equals("skill")) {
					break;
				}
		}

		System.out.println("---------------Object Arrays------------");
		
		Object testing[]=new Object[3];
		testing[0]=12;
		testing[1]="Sathappan";
		testing[2]='M';
		
		System.out.println(Arrays.toString(testing));
		
		
		for(int i=testing.length-1;i>=0;i--) {
			System.out.print(testing[i] + " ");
		}
		
	}

}