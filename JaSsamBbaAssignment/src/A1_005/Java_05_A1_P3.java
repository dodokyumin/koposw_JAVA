package A1_005;

import java.util.Scanner;

public class Java_05_A1_P3 {
	static Scanner sc = new Scanner(System.in);
	static int firstNum = sc.nextInt();

	public static void main(String[] args) {

		SecondNum(3);

	}

	public static void SecondNum(int num) {
		int sum = firstNum * num;
		if (num == 9) {
			System.out.println(firstNum + " X " + "9 = " + sum);
		} else {

			System.out.println(firstNum + " X " + num + " = " + sum);
			SecondNum(num + 1);
		}

	}

}
