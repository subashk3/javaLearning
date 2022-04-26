package everyday;

public class SingleTonClass {
	private static SingleTonClass obj;
	public static int count = 0;

	private SingleTonClass() {

	}

	public static SingleTonClass getInstatnce() {
		if (obj == null) {
			count++;
			obj = new SingleTonClass();
		}
		return obj;
	}

	public void displayMessage(String display) {
		System.out.println("I have use singleton object " + display);
	}
}
