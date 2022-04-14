package Java_03;

import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double huanhao = 0;

		System.out.println("#Current Converter");
		System.out.println("1. Celsius -> Fahrenheit");
		System.out.println("2. Fahrenheit -> Celsius");

		int chosenNum = sc.nextInt();
		double temperature = sc.nextInt();

		double celtoFa = (temperature * 9/5) + 32;
		double faToCel = (temperature - 32) * 5 / 9;

		if (chosenNum == 1) {
			System.out.println(Math.round(faToCel));

		} else if (chosenNum == 2) {

			System.out.println(Math.round(faToCel));

		}

	}

}
