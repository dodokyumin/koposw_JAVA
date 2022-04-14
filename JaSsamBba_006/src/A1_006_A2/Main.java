package A1_006_A2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputNum = sc.nextLine();

		reverseStr(inputNum);
	}

	public static void reverseStr(String inputNum) {

		String[] splitStrArr = inputNum.split("");

		for (int i = splitStrArr.length - 1; i >= 0; i--) {
			System.out.print(splitStrArr[i]);

		}
	}
}