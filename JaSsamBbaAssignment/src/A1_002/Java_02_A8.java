package A1_002;

import java.util.Scanner;

public class Java_02_A8 {

	public static void main(String[] args) {
		/*
		 * Find the GCD(Greatest Common Divisor) User inputs the two numbers, N and M
		 * Print the GCD
		 */

		Scanner scanner = new Scanner(System.in);
		int GCD = 0, min, num1, num2, CD;

		num1 = scanner.nextInt();
		num2 = scanner.nextInt();

		min = (num1 > num2) ? num1 : num2;

		for (int i = 1; i < min; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				GCD = i;
			}
		}
		System.out.println(GCD);
	}

}