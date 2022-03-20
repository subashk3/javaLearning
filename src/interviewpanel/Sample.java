package interviewpanel;

import java.util.*;
import java.io.*;

public class Sample {
	Member mem = new Member();
	public void fileData() throws FileNotFoundException {		
		File file = new File("E:\\Programs\\Program\\javaLearning\\src\\interviewpanel\\interviewList.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNextLine()) {
			mem.addCandidate(scan.nextLine());
		}
		scan.close();		
	}

}
