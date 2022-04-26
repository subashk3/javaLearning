package workout;

import java.util.concurrent.DelayQueue;

public class Singleton {
	private static Singleton obj = null;

	private Singleton() {
	}

	public static Singleton getObject() {
		if (obj != null) {
			obj = new Singleton();
		}
		return obj;
	}

	/*
	 * public static void main(String[] args) { }
	 * 
	 */

	public static void main(String[] args) {

	}

}
