package everyday;

class Explore extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			SingleTonClass obj = SingleTonClass.getInstatnce();
			System.out.println(obj + " Thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Explore1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			SingleTonClass obj = SingleTonClass.getInstatnce();
			System.out.println(obj + " Thread 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

public class SingleTon {

	public static void main(String[] args) {

		Explore o1 = new Explore();
		Explore1 o2 = new Explore1();
		o1.start();
		o2.start();

	}

}
