package Java_03;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double huanhao = 0;
		double usaToKor = 1220.63;
		double korToUsa = 0.00082;

		System.out.println("#Current Converter");
		System.out.println("1. South Korea won -> United States Dollar");
		System.out.println("2. United States Dollar -> South Korea won");

		int chosenNum = sc.nextInt();
		double amount = sc.nextInt();

		if (chosenNum == 1) {
			System.out.println(amount * korToUsa);

		} else if (chosenNum == 2) {

			System.out.println(amount * usaToKor);

		}


	}

}
