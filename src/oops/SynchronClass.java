package oops;

public class SynchronClass {

	private int count;
	
	public synchronized void increament() {// overcome the thread
		
		count++;
	}
	public synchronized void decreament() {
		
		count--;
	}
	public int getCount() {
		return count;
	}
	
	
	
}
