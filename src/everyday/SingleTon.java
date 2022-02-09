package everyday;

public class SingleTon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SingleTonClass o = new SingleTonClass();
		
		SingleTonClass o = SingleTonClass.getInstatnce();
		SingleTonClass o1 = SingleTonClass.getInstatnce();
		
		o.displayMessage();
		
		o1.displayMessage();

	}

}
