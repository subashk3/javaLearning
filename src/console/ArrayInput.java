package console;

import java.io.*;
import java.util.ArrayList;

public class ArrayInput {

	File file = new File("C:\\Users\\Jana\\Desktop\\Files\\Object.txt");

	public void clearData() throws Exception {
		ArrayList<GetData> a = new ArrayList<GetData>();
		FileOutputStream fileOutputObject = new FileOutputStream(file);
		ObjectOutputStream outputObject = new ObjectOutputStream(fileOutputObject);
		outputObject.writeObject(a);
		outputObject.flush();
		outputObject.close();

	}

	public ArrayList<GetData> getData() throws Exception {
		FileInputStream fileInput = new FileInputStream(file);
		ObjectInputStream inputObject = new ObjectInputStream(fileInput);
		ArrayList<GetData> arraylist = (ArrayList<GetData>) inputObject.readObject();
		return arraylist;

	}

	public void setData(ArrayList<GetData> get) throws Exception {

		ArrayList<GetData> ar = getData();
		FileOutputStream fileOutput = new FileOutputStream(file);
		ObjectOutputStream outputObject = new ObjectOutputStream(fileOutput);
		outputObject.writeObject(ar);
		outputObject.flush();
		outputObject.close();

	}
}
