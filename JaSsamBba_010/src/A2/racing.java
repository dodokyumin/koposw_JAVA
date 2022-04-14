package A2;

import java.util.ArrayList;
import java.util.Scanner;

public class racing extends Thread {

	private static ArrayList<String> recordData1 = new ArrayList<String>();
	private static ArrayList<String> recordData2 = new ArrayList<String>();
	private static ArrayList<String> recordData3 = new ArrayList<String>();
	
	static ArrayList<ArrayList<String>> recordData2D1 = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> recordData2D2 = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> recordData2D3 = new ArrayList<ArrayList<String>>();
	private static double distance1 = 0,distance2 = 0,distance3 = 0;

	public static void main(String[] args) throws InterruptedException {

		racing player1 = new racing();
		racing player2 = new racing();
		racing player3 = new racing();

		player1.start();

		player2.start();

		player3.start();

		Scanner sc = new Scanner(System.in);

	}

	public void run() {
		int i = 1;
		while (true) {
			if (Thread.currentThread().getName().contains("Thread-0")) {
				System.out.printf("(1s)   " + "\t" + "(2s)" + "\t" + "(3s)" + "\t" + "(4s)" + "\t" + "(5s)" + "\t"
						+ "(6s)" + "\t" + "(7s)" + "\t" + "(8s)" + "\t" + "(9s)" + "\t" + "(10s)" + "\t" + "(11s)"
						+ "\t" + "(12s)" + "\t" + "(13s)" + "\t" + "(14s)" + "\t" + "\n");
			}

			int j = 0;

			try {

				this.distance1 += (Math.round(Math.random() * 100)) / 10;
				if (distance1 > 50) {
					recordData1.add("(Finished)");
					String str = String.join("", recordData1);
					System.out.println(str);
					break;
				}
				if (distance2 > 50) {
					recordData2.add("(Finished)");
					String str = String.join("", recordData2);
					System.out.println(str);
					break;
				}
				if (distance3 > 50) {
					recordData3.add("(Finished)");
					String str = String.join("", recordData3);
					System.out.println(str);
					break;

				} else {
					if (Thread.currentThread().getName().contains("Thread-0")) {
						recordData1.add(racing.distance1 + "m" + "\t");
						recordData2D1.add(recordData1);
						String str = String.join("", recordData1);
						System.out.println(str);

						j++;
						Thread.sleep(1000);

					}
					if (Thread.currentThread().getName().contains("Thread-1")) {
						recordData2.add(racing.distance2 + "m" + "\t");
						recordData2D2.add(recordData2);
						String str = String.join("", recordData2);
						System.out.println(str);

						j++;
						Thread.sleep(1000);
						
					}
					if (Thread.currentThread().getName().contains("Thread-2")) {
						recordData3.add(racing.distance3 + "m" + "\t");
						recordData2D3.add(recordData3);
						String str = String.join("", recordData3);
						System.out.println(str);

						j++;
						Thread.sleep(1000);
						//clearScreen();
					}
					
				}
			} catch (

			InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}

	public static void clearScreen() {
		for (int i = 0; i < 80; i++)
			System.out.println("");
	}

}
