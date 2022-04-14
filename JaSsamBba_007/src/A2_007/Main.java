package A2_007;

import java.util.Scanner;

public class Main {
	static int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			int inputNum = sc.nextInt();
			for (int i = 0; i < numbers.length; i++) {
				includeNum(i, inputNum);
			}
			System.out.println("");
		}
	}

	public static void includeNum(int i, int x) {
		if (numbers[i] % 10 == x || numbers[i] / 10 % 10 == x || numbers[i] / 100 == x) {
			System.out.print(numbers[i] + " ");
		}
	}
}
