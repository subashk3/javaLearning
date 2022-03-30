package threads;

class BThread extends Thread {
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(i * 5);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
public class NewThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		NewThread newThread = new NewThread();
		BThread obj = new BThread();
		newThread.start();
		obj.start();
		newThread.join();
		obj.join();
		System.out.println("End...");
	}

}
