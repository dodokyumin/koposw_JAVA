package java_010;

public class setPriority {

	public static void main(String[] args) {
		Thread thread1 = new MultiThreadTest("[ Thread " + 1 + " ]");
		thread1.start();
		Thread thread2 = new MultiThreadTest("[ Thread " + 2 + " ]");
		thread2.start();
	}

}

class MultiThreadTest extends Thread {
	public MultiThreadTest(String threadName) {
		this.setName(threadName);
	}

	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + " Thread_Start ");
	}
}
	
	