package A1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A1 extends Thread {

	private static int cnt = 1;
	private static int inputSec = 100;

	public static void main(String[] args) throws InterruptedException {

		System.out.println(getCurrentTime());

		A1 thread = new A1();
		thread.start();

		Scanner sc = new Scanner(System.in);
		inputSec = sc.nextInt();

	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}

	public void run() {

		while (true) {

			try {
				Thread.sleep(1000);
				this.cnt++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (cnt == inputSec) {
				System.out.println("time is over(" + getCurrentTime() + ")");
				break;
			} else if (cnt > inputSec) {
				System.out.println("time is already over(" + getCurrentTime() + ")");
				break;
			}
		}

	}
}
