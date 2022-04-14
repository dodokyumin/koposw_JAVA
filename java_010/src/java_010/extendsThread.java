package java_010;

import java.text.SimpleDateFormat;
import java.util.Date;

public class extendsThread extends Thread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		extendsThread thread = new extendsThread();
		thread.start();
		System.out.println("Check 1: " + getCurrentTime() + "-" + thread.isAlive());
		Thread.sleep(3000);
		System.out.println("Check 4: " + getCurrentTime() + "-" + thread.isAlive());
	}

	public static String getCurrentTime() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();
		String dateAndTime = format.format(time);
		return dateAndTime;
	}
	//run ÇÔ¼ö¸¦ override
	public void run() {
		int cnt = 0;
		while (true) {
			if (cnt == 5) {
				break;
			}
			try {
				System.out.println(getCurrentTime() + "-" + cnt);
				Thread.sleep(100);
				cnt++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
