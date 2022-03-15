package miniproject;

import java.io.*;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GetJSON {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		Object o = new JSONParser().parse(new FileReader("C:\\Users\\Jana\\Desktop\\Files\\details.json"));

		JSONObject j = (JSONObject) o;
		
		
		
	}

}
