package threads;

/*
 * Instantiate a thread by using Thread class.
 */

public class InstantiateUsingOnlyThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Thread main started");
		
		Thread thread1 = new MyTask("any data that the thread may need to process");	
		Thread thread2 = new MyTask("any data that the thread may need to process");
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();
		
		System.out.println("Thread main finished");
	}
}

class MyTask extends Thread {
	private String anyData;
	
	public MyTask(String anyData) {
		this.anyData = anyData;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

