package Java0426;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("ms");
		double ms = sc.nextDouble();
		System.out.printf("kmh");
		double kmh = sc.nextDouble();
		System.out.printf("mms");
		double mms = sc.nextDouble();
		
		double kmhToMs = kmh * 0.277778;
		double mmsToMs = mms * 1000;
		
		double biggest; 
		double Answer;
		
		biggest = (ms > kmhToMs)? ms : kmhToMs;
		Answer = (biggest == ms)? ms : kmh;
		biggest = (biggest > mmsToMs)? biggest : mmsToMs;
		Answer = (biggest == mmsToMs)?  mms: Answer;

		if(Answer == ms) {
			System.out.printf(String.valueOf((int)Answer) + "m/s");
		} else if (Answer == kmh) {
			System.out.printf(String.valueOf((int)Answer) + "km/h");
		} else {
			System.out.printf(String.valueOf(Answer) + "m/ms");
		}
		
	}
}
