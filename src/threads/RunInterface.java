package threads;

public class RunInterface {

	public void main(String[] args) {
		Runnable firstRunnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i < 6; i++) {
				//	System.out.println(i * 5);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};
		Runnable secondRunnable = new Runnable() {

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

		};
		Thread t1 = new Thread(firstRunnable);
		Thread t2 = new Thread(secondRunnable);
		t1.start();
		t2.start();

	}

}
