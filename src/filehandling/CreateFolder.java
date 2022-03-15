package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFolder {

	public static void createFiles() throws IOException {
		Scanner sc = new Scanner(System.in);
		String s = "C:\\Users\\Jana\\Desktop\\Files\\sample\\";
		System.out.println("Enter your file name with extension:");
		s += sc.next();
		File f = new File(s);
		f.createNewFile();

		System.out.println("Sucessfull");

		System.out.println("Add press: 1");
		System.out.println("Exit: 2");
		if (sc.nextInt() == 1) {
			createFiles();
		} else
			return;

	}

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		createFiles();

	}

}
