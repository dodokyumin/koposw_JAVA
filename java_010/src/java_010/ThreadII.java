package java_010;

public class ThreadII extends Thread {

	public static void main(String[] args) throws InterruptedException{
		ThreadII main = new ThreadII();
		Thread thread = new Thread(main);
		thread.start();
		main.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread");
	}

}
