package everyday;

public class SingleTonClass {

	private static SingleTonClass obj;
	
	
	private SingleTonClass() {
		
		
	}
	public static SingleTonClass getInstatnce() {
		
		if(obj==null) {
			obj = new SingleTonClass();
		}
		return obj;
	}
	public void displayMessage() {
		
		System.out.println("I have use singleton object");
	}
}
