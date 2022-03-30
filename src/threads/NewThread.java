package threads;

public class NewThread extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("DB updating ...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
