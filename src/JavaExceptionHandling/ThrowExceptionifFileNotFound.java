package JavaExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExceptionifFileNotFound  {

	public static void main(String args[]) {

		System.out.println("file test");

	

		File file = new File("C:\\document\\test.xls");
		// FileInputStream ip = new FileInputStream(file); // CT- Checked exception
		// - Unhandled exception type FileNotFoundException
		try {
			FileInputStream ip = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}