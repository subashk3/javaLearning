package oops;

public class VolatileClass {

	private static volatile int COUNTER = 0;

	public static void main(String[] args) {
		
		new ReadingThread().start();
		new WritingThread().start();
	}

	static class ReadingThread extends Thread {

		@Override
		public void run() {
			while (COUNTER < 4) {

			}
			System.out.println("Counter reached 4.");

		}

	}

	static class WritingThread extends Thread {

		@Override
		public void run() {
			while (COUNTER < 10) {
				COUNTER++;
				System.out.println("Counter incremented to " + COUNTER);

			}

		}

	}

}
