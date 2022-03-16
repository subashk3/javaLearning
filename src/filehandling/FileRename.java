package filehandling;

import java.io.*;

public class FileRename {

	public static void main(String[] args) {
//Game Over.mp4
		File file = new File("C:\\Users\\Jana\\Desktop\\Files\\subash.txt");
		File file1 = new File("C:\\Users\\Jana\\Desktop\\Files\\new\\subash_new.txt");

		/*
		 * String[] s = file.list();
		 * 
		 * for (String x : s) {
		 * 
		 * String n = x.substring((x.lastIndexOf(".")) + 1); if(n.equals("png"))
		 * 
		 * System.out.println(x + " " + file.isFile());
		 * 
		 * }
		 */
		file.renameTo(file1);
	}
}
