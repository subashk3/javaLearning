package filehandling;

import java.io.*;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		// Game Over.mp4

		InputStream in = new FileInputStream("F:\\Game Over.mp4");
		OutputStream out = new FileOutputStream("F:\\A.mp4");
		int count = in.read();
		while (count != -1) {

			out.write(count);
			count = in.read();
		}
		out.flush();
		out.close();
		in.close();

	}
}
