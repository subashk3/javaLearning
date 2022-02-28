package oops;

public class SynchroMain {

	public static void main(String[] args) throws InterruptedException {
		SynchronClass counter = new SynchronClass();
		Thread inT = new Thread() {

			public void run() {
				for (int i = 0; i < 5000; i++) {

					counter.increament();
				}
			}
		};
		Thread decT = new Thread() {

			public void run() {
				for (int i = 0; i < 5000; i++) {
					counter.decreament();
				}
			}
		};
		inT.start();
		decT.start();

		inT.join();
		decT.join();

		System.out.println(counter.getCount());

	}
}
