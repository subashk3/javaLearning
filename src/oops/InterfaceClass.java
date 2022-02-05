package oops;

public class InterfaceClass implements InterfaceClassSuper {

	public void absMethodOne() {
		System.out.println("1");
	}

	public void absMethodTwo() {
		System.out.println("2");
	}

	public void absMethodThree() {
		System.out.println("3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceClassSuper obj = new InterfaceClass();
		
		obj.absMethodOne();
		obj.absMethodTwo();
		obj.absMethodThree();	
	}

}
