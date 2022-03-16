package miniproject;

import java.io.*;

import java.util.Scanner;
import org.json.simple.JSONObject;

public class JSONsample {

	public static void main(String[] args) throws IOException {
		JSONObject o = new JSONObject();
		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("C:\\Users\\Jana\\Desktop\\Files\\details.json", true);
		BufferedWriter bf = new BufferedWriter(file);
		PrintWriter pr = new PrintWriter(bf);

		/*
		 * GetDetails g = new GetDetails(); g.setName(sc.nextLine());
		 * g.setAge(sc.nextInt()); g.setMobNumber(sc.nextLine());
		 */
		
		
		  System.out.println("Enter the name:"); o.put("name", sc.nextLine());
		  System.out.println("Enter the age:"); o.put("age", sc.nextLine());
		  System.out.println("Enter the Moblie:"); o.put("Mobile", sc.nextLine());
		 
		
		
		pr.write(o.toJSONString());
		pr.println();
		
		pr.flush();
		pr.close();

	}

}
