package oops;

public class InterfaceClass implements InterfaceClassSuper, InterfaceClassSuper1 {

	
	
	
	
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
		obj.absMethodOne();
		obj.absMethodOne();	
	}

	@Override
	public void absMethodOne1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void absMethodTwo1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void absMethodThree1() {
		// TODO Auto-generated method stub
		
	}
	

}
interface InterfaceClassSuper1 {

	public void absMethodOne1();

	public void absMethodTwo1();

	public void absMethodThree1();
	

}