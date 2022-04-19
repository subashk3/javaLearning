package threads;
class RunClass implements Runnable {
	public synchronized void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class RunClass2 extends Thread {
	public void run() {
		for (int i = 0; i < 11; i++) {
			System.out.println("How " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSample {
	public static void main(String[] args) {
		RunClass2 r2 = new RunClass2();
		Runnable r = new RunClass();
		Thread o = new Thread(r);
//		System.out.println(o.getName());
		o.start();
		r2.start();
		System.out.println(r2.isAlive());

	}

}
