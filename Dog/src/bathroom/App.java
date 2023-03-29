package bathroom;

class Bathroom implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + "  is entring the bathroom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + "  is using the bathroom");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + "  is leaving the bathroom");
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class App {

	public static void main(String[] args) {

		try {
			Bathroom b1 = new Bathroom();

			Thread t1 = new Thread(b1);
			Thread t2 = new Thread(b1);
			Thread t3 = new Thread(b1);

			t1.setName("boy");
			t2.setName("girl");
			t3.setName("other");

			t1.start();
			t2.start();
			System.err.println("after join");
			t3.start();
			t3.join();
			System.err.println("after join");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
