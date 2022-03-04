package threads;

import javax.swing.tree.ExpandVetoException;

class Count extends Thread {
	public void run() {

		for (int i = 1; i < 10; i++) {
			System.out.println(i + " x " + 5 + " = " + i * 5);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}
}

class Count2 extends Thread {
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i + " x " + 4 + " = " + i * 4);
			try {
				Thread.sleep(5000);
			} catch (Exception e) {

			}
		}
	}

}

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		Count c = new Count();
		Count2 c1 = new Count2();

		c.start();
		c1.start();
		if (c1.isAlive())
			System.out.println("alive thread 4");

		if (c.isAlive())
			System.out.println("alive thread 5");
		else
			System.out.println("Not alive thread 5");
		c.join();
		System.out.println("Hello this is thread");
	}
}
