package miniproject;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetJSON {
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONObject o = (JSONObject) new JSONParser()
				.parse(new FileReader("C:\\Users\\Jana\\Desktop\\Files\\details.json"));
		String name = (String) o.get("name");
		String mob = (String) o.get("Mobile");		
		System.out.println(name + " " + o.get("age")+ " " + mob);
		File  file = new File ("C:\\Users\\Jana\\Desktop\\Files\\details.json");

	}

}
